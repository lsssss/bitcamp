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

//urlPatterns 속성
//- 클라이언트가 "/board/"로 시작하는 URL을 요청할 때 이 서블릿을 실행하라고 표시한다.
//- /board/로 시작하는 요청이 들어오면 서블릿 컨테이너는 이 서블릿 객체를 실행한다.
//
@SuppressWarnings("serial")
@WebServlet("/board/view")
public class BoardViewServlet extends HttpServlet {

    
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
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
        out.println("<h1>게시물 상세 정보</h1>");

        
        try {
            int no = Integer.parseInt(request.getParameter("no"));
            Board board = boardDao.selectOne(no);
            
            if (board != null) {
                out.println("<form action='update' method='post'>");
                
                out.println("<div>");
                out.println("<label for='no'>번호</label>");
                out.printf("<input readonly id='no' type='number' name='no' value='%d'>\n", 
                           board.getNo());
                out.println("</div>");
                
                out.println("<div>");
                out.println("<label for='title'>제목</label>");
                out.printf("<input id='title' type='text' name='title' value='%s'>\n", 
                            board.getTitle());
                out.println("</div>");
                
                out.println("<div>");
                out.println("<label for='content'>내용</label>");
                out.printf("<textarea id='content type='text' name='content' >%s\n</textarea>", 
                            board.getContent());
                out.println("</div>");
                
                out.println("<div>");
                out.println("<label for='regdate'>등록날짜</label>");
                out.printf("<input readonly id='regdate' type='text' name='regdate' value='%s'>\n", 
                            board.getRegDate());
                out.println("</div>");
                
                out.println("<div>");
                out.println("<label for='cnt'>조회수</label>");
                out.printf("<input readonly id='cnt' type='number' name='cnt' value='%d'>\n", 
                            board.getViewCount());
                out.println("</div>");
                
                
                out.println("<button>변경</button>");
                
                out.printf("<a href='delete?no=%d'>삭제</a>\n", board.getNo());
                out.println("</form>");
                
            } else {
                out.printf("'%d'의 성적 정보가 없습니다.\n", no); 
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
        out.println("</body>");
        out.println("</html>");
    }
    
    
}








