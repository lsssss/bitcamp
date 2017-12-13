package java100.app.servlet.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.MemberDao;
import java100.app.dao.ScoreDao;
import java100.app.domain.Member;
import java100.app.domain.Score;
import java100.app.listener.ContextLoaderListener;

//urlPatterns 속성
//- 클라이언트가 "/member/xxx" URL을 요청할 때 이 서블릿을 실행하라고 표시한다.
//- /member/xxx 요청이 들어오면 서블릿 컨테이너는 이 서블릿 객체를 실행한다.
//
@SuppressWarnings("serial")
@WebServlet("/member/add")
public class MemberAddServlet extends HttpServlet {
    
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>회원관리</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>회원 상세정보</h1>");

        out.println("<form method='post'>");
        out.println("<label for='name'>이름</label>");
        out.println("<input id='name' type='text' name='name'>");
        out.println("</div>");
        out.println("<div>");
        out.println("<label for='email'>이메일</label>");
        out.println("<input id='kor' type='text' name='email'>");
        out.println("</div>");
        out.println("<div>");
        out.println("<label for='pwd'>패스워드</label>");
        out.println("<input id='eng' type='text' name='pwd'>");
        out.println("</div>");
        out.println("<button>추가</button>");
        out.println("</form>");

        out.println("</body>");
        out.println("</html>");
    }
    
    
       
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(
                MemberDao.class);

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>성적관리</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>성적 등록 결과</h1>");

        try {
            Member member = new Member();
            member.setName(request.getParameter("name"));
            member.setEmail(request.getParameter("email"));
            member.setPassword(request.getParameter("pwd"));
           
            
            memberDao.insert(member);
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










