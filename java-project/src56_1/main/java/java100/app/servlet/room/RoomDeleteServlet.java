package java100.app.servlet.room;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.RoomDao;
import java100.app.dao.ScoreDao;
import java100.app.listener.ContextLoaderListener;

//urlPatterns 속성
@SuppressWarnings("serial")
//- 클라이언트가 "/room/xxx" URL을 요청할 때 이 서블릿을 실행하라고 표시한다.
//- /room/xxx 요청이 들어오면 서블릿 컨테이너는 이 서블릿 객체를 실행한다.
//
@WebServlet("/room/delete")
public class RoomDeleteServlet extends HttpServlet {
   
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(
                RoomDao.class);
        
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>게시물</title>");
        out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");
        out.println("<link rel='stylesheet' href='../css/common.css'>");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        RequestDispatcher rd = request.getRequestDispatcher("/header");
        rd.include(request, response);
        out.println("<h1>게시물 삭제</h1>");
        
        try {
            int no = Integer.parseInt(request.getParameter("no"));
            
            if (roomDao.delete(no) > 0) {
                out.println("<p>삭제했습니다.</p>");
            } else {
                out.printf("<p>'%d'의 성적 정보가 없습니다.</p>\n", no);
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
        
        out.println("<p><a href='list' class='btn btn-primary btn-sm'>목록</a></p>");
        rd = request.getRequestDispatcher("/footer");
        rd.include(request, response);
        out.println("</div>");
        out.println("<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>");
        out.println("<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>");
        out.println("<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js'></script>");

        out.println("</body>");
        out.println("</html>");
    }
    
    
}










