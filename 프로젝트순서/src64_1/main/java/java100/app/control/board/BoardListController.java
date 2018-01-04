package java100.app.control.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.annotation.RequestMapping;
import java100.app.dao.BoardDao;
import java100.app.domain.Board;

@Component("/board/list")
public class BoardListController {

    @Autowired BoardDao boardDao; 
    
    @RequestMapping
    public String list(HttpServletRequest request, HttpServletResponse response) throws Exception {

        List<Board> list = boardDao.selectList();
        request.setAttribute("list", list);
        return "/board/list.jsp";
    }
}
