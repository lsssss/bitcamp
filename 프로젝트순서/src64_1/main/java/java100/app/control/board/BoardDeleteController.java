package java100.app.control.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.annotation.RequestMapping;
import java100.app.dao.BoardDao;
import java100.app.domain.Board;

@Component("/board/delete")
public class BoardDeleteController {

    @Autowired BoardDao boardDao;
    @RequestMapping
    public String delete(Board board,HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        boardDao.delete(board.getNo());
        return "redirect:list.do";
        
    }
}
