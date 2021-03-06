package java100.app.web;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java100.app.dao.BoardDao;
import java100.app.domain.Board;
import java100.app.domain.Member;
import java100.app.service.BoardService;


@Controller
@RequestMapping("/board")
@SessionAttributes("loginUser")
public class BoardController {

    @Autowired BoardService boardService;
    @Autowired
    BoardDao boardDao;

    @RequestMapping("list")
    public String list(
            
            @RequestParam(value="pn", defaultValue="1") int pageNo,
            @RequestParam(value="ps", defaultValue="5") int pageSize,
            @RequestParam(value="word", required=false) String[] words,
            @RequestParam(value="oc", required=false) String orderColumn,
            @RequestParam(value="al", required=false) String align,
            Model model) throws Exception {

        
        if (pageNo < 1) {
            pageNo = 1;
        }
        if (pageSize < 5 || pageSize > 15) {
            pageSize = 5;
        }
        
        HashMap<String,Object> options = new HashMap<>();
        options.put("titles", words);
        options.put("orderColumn", orderColumn);
        options.put("align", align);
        
        int totalCount = boardService.getTotalCount();
        int lastPageNo = totalCount / pageSize;
        if((totalCount % pageSize) > 0) {
            lastPageNo++;
        }
        
        
        //view 컴포넌트가 사용할 값을 Model에 담는다.
        model.addAttribute("pageNo", pageNo);
        model.addAttribute("lastPageNo",lastPageNo);
        model.addAttribute("list", boardService.list(pageNo, pageSize, options));
        return "board/list";
    }

    @RequestMapping("add")
    public String add(Board board, @ModelAttribute("loginUser") Member loginUser) throws Exception {
        
        
        board.setWriter(loginUser);
        boardService.add(board);
        return "redirect:list";
    }

    @RequestMapping("delete")
    public String delete(int no) throws Exception {

        boardService.delete(no);
        return "redirect:list";
    }

    @RequestMapping("form")
    public String form() throws Exception {
        return "board/form";
    }

    @RequestMapping("update")
    public String update(Board board) throws Exception {
        boardService.update(board);
        return "redirect:list";
    }

    @RequestMapping("{no}")
    public String view(@PathVariable int no,Model model)
            throws Exception {
        
        boardService.updateViewCount(no);
        model.addAttribute("board", boardService.get(no));
        return "board/view";

    }
}
