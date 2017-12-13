package java100.app.servlet.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.BoardDao;
import java100.app.domain.Board;
import java100.app.listener.ContextLoaderListener;


@SuppressWarnings("serial")

@WebServlet("/board/add")
public class BoardAddServlet extends HttpServlet {


    
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>게시물</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>게시물 상세 정보</h1>");

        out.println("<form method='post'>");
        out.println("<label for='title'>제목</label>");
        out.println("<input id='title' type='text' name='title'>");
        out.println("</div>");
        
        out.println("<div>");
        out.println("<label for='content'>내용</label>");
        out.println("<textarea id='content' placeholder='내용입력하세요' name='content'></textarea>");
        out.println("</div>");

       
        out.println("<button>추가</button>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        
        BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>게시물관리</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>게시물 등록 결과</h1>");

        try {
            Board board = new Board();
            board.setTitle(request.getParameter("title"));
            board.setContent(request.getParameter("content"));

            boardDao.insert(board);
            out.println("<p>저장하였습니다.</p>");

        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
        out.println("<p><a href='list'>목록</a></p>");
        out.println("</body>");
        out.println("</html>");
    }
    
    
}








