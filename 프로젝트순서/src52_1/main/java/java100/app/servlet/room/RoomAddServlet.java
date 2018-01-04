package java100.app.servlet.room;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.RoomDao;
import java100.app.dao.ScoreDao;
import java100.app.domain.Room;
import java100.app.domain.Score;
import java100.app.listener.ContextLoaderListener;

//urlPatterns 속성
//- 클라이언트가 "/room/xxx" URL을 요청할 때 이 서블릿을 실행하라고 표시한다.
//- /room/xxx 요청이 들어오면 서블릿 컨테이너는 이 서블릿 객체를 실행한다.
//
@SuppressWarnings("serial")
@WebServlet(urlPatterns="/room/add")
public class RoomAddServlet extends HttpServlet {
   
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>강의실 관리</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>강의실 상세 정보</h1>");

        out.println("<form method='post'>");
        out.println("<label for='location'>강의 지역</label>");
        out.println("<input id='location' type='text' name='location'>");
        out.println("</div>");
        
        out.println("<div>");
        out.println("<label for='name'>강의 내용</label>");
        out.println("<input id='name' type='text' name='name'>");
        out.println("</div>");
        
        out.println("<div>");
        out.println("<label for='capacity'>수용 인원</label>");
        out.println("<input id='capacity' type='number' name='capacity'>");
        out.println("</div>");
        
        out.println("<button>추가</button>");
        out.println("</form>");

        out.println("</body>");
        out.println("</html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(RoomDao.class);

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>강의실 관리</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>강의실 등록 결과</h1>");

        try {
            Room room = new Room();
            room.setLocation(request.getParameter("location"));
            room.setName(request.getParameter("name"));
            room.setCapacity(Integer.parseInt(request.getParameter("capacity")));

            roomDao.insert(room);
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










