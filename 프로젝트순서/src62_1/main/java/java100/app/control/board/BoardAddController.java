package java100.app.control.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.control.PageController;
import java100.app.dao.BoardDao;
import java100.app.domain.Board;

@Component("/board/add")
public class BoardAddController implements PageController{

    
    @Autowired BoardDao boardDao;
    
    public String service(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        Board board = new Board();
        board.setTitle(request.getParameter("title"));
        board.setContent(request.getParameter("content"));
        boardDao.insert(board);
        return "redirect:list.do";
        
        
    }
}
