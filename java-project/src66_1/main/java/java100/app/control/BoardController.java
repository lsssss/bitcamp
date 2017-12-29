package java100.app.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java100.app.dao.BoardDao;
import java100.app.domain.Board;

@Controller
public class BoardController {

    @Autowired
    BoardDao boardDao;

    @RequestMapping("/board/list.do")
    public String list(HttpServletRequest request, HttpServletResponse response) throws Exception {

        List<Board> list = boardDao.selectList();
        request.setAttribute("list", list);
        return "/board/list.jsp";
    }

    @RequestMapping("/board/add")
    public String add(Board board, HttpServletResponse response) throws Exception {
        boardDao.insert(board);
        return "redirect:list.do";
    }

    @RequestMapping("/board/delete")
    public String delete(Board board, HttpServletRequest request, HttpServletResponse response) throws Exception {

        boardDao.delete(board.getNo());
        return "redirect:list.do";
    }

    @RequestMapping("/board/form")
    public String form(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return "/board/form.jsp";
    }

    @RequestMapping("/board/update")
    public String update(Board board, HttpServletRequest request, HttpServletResponse response) throws Exception {
        boardDao.update(board);
        return "redirect:list.do";
    }

    @RequestMapping("/board/view")
    public String view(@RequestParam("no") int no, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        Board board = boardDao.selectOne(no);
        request.setAttribute("board", board);
        return "/board/view.jsp";

    }
}
