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
        out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");
        out.println("<style>");
        out.println(".container {");
        out.println("    width: 680px;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h1>게시물 상세 정보</h1>");
        out.println("<form method='post'>");
        
        out.println("<div class='form-group row'>");
        out.println("<label for='math' class='col-sm-2 col-form-label'>제목</label>");
        out.println("<div class='col-sm-10'>");
        out.println("<input class='form-control' id='title' type='text' name='title'>");
        out.println("</div>");
        out.println("</div>");
        
        out.println("<div class='form-group row'>");
        out.println("<label for='math' class='col-sm-2 col-form-label'>내용</label>");
        out.println("<div class='col-sm-10'>");
        out.println("<textarea class='form-control' id='content' placeholder='내용입력하세요' name='content'></textarea>");
        out.println("</div>");
        out.println("</div>");

        
        out.println("<div class='form-group row'>");
        out.println("<div class='col-sm-10'>");
        out.println("<button class='btn btn-primary btn-sm'>추가</button>");
        out.println("</div>");
        out.println("</div>");
        out.println("</form>");
        
        
        out.println("</div>");
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
        out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");
        out.println("<style>");
        out.println(".container {");
        out.println("    width: 680px;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
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
        out.println("<p><a href='list' class='btn btn-primary btn-sm'>목록</a></p>");
        out.println("</body>");
        out.println("</body>");
        out.println("</html>");
    }
    
    
}








