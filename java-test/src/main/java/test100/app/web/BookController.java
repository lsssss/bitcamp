package test100.app.web;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import test100.app.domain.Book;
import test100.app.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController extends HttpServlet {

	@Autowired
	ServletContext servletContext;
	@Autowired
	BookService bookService;

	@RequestMapping("list")
	public String list(@RequestParam(value = "pn", defaultValue = "1") int pageNo,
			@RequestParam(value = "ps", defaultValue = "5") int pageSize,
			@RequestParam(value = "word", required = false) String[] words,
			@RequestParam(value = "oc", required = false) String orderColumn,
			@RequestParam(value = "al", required = false) String align, Model model) throws Exception {
		if (pageNo < 1) {
			pageNo = 1;
		}
		if (pageSize < 5 || pageSize > 15) {
			pageSize = 5;
		}

		HashMap<String, Object> options = new HashMap<>();
		if (words != null && words[0].length() > 0) {
			options.put("words", words);
		}
		options.put("orderColumn", orderColumn);
		options.put("align", align);

		int totalCount = bookService.getTotalCount();
		int lastPageNo = totalCount / pageSize;

		if ((totalCount % pageSize) > 0) {
			lastPageNo++;
		}

		// view 컴포넌트가 사용할 값을 Model에 담는다.
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("lastPageNo", lastPageNo);
		model.addAttribute("list", bookService.list(pageNo, pageSize, options));
		return "book/list";
	}

	@RequestMapping("add")
	public String add(Book book, MultipartFile file) throws Exception {

		String filename2 = null;
		String uploadDir = servletContext.getRealPath("/download");
		String filename = this.writeUploadFile(file, uploadDir);

		if (file.getSize() == 0) {
			book.setBookphoto(filename2);
			bookService.add(book);
		} else {
			book.setBookphoto(filename);
			bookService.add(book);
		}
		return "redirect:list";
	}

	@RequestMapping("delete")
	public String delete(int no) throws Exception {

		bookService.delete(no);
		return "redirect:list";
	}

	@RequestMapping("form")
	public String form() throws Exception {
		return "book/form";
	}

	@RequestMapping("update")
	public String update(Book book, MultipartFile file) throws Exception {
		String filename2 = null;
		String uploadDir = servletContext.getRealPath("/download");
		String filename = this.writeUploadFile(file, uploadDir);

		System.out.println(file.isEmpty());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());

		if (file.getSize() == 0) {
			book.setBookphoto(filename2);
			bookService.update(book);
		} else {
			book.setBookphoto(filename);
			bookService.update(book);
		}

		return "redirect:list";
	}

	@RequestMapping("{no}")
	public String view(@PathVariable int no, Model model) throws Exception {
		model.addAttribute("book", bookService.get(no));
		return "book/view";
	}

	long prevMillis = 0;
	int count = 0;

	synchronized private String getNewFilename(String filename) {
		long currMillis = System.currentTimeMillis();
		if (prevMillis != currMillis) {
			count = 0;
			prevMillis = currMillis;
		}

		return currMillis + "_" + count++ + extractFileExtName(filename);
	}

	private String extractFileExtName(String filename) {
		int dotPosition = filename.lastIndexOf(".");
		if (dotPosition == -1)
			return "";
		return filename.substring(dotPosition);
	}

	private String writeUploadFile(MultipartFile part, String path) throws IOException {
		String filename = getNewFilename(part.getOriginalFilename());
		part.transferTo(new File(path + "/" + filename));
		return filename;
	}

}
