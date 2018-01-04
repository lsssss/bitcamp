package java100.app.servlet.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.MemberDao;
import java100.app.domain.Member;
import java100.app.listener.ContextLoaderListener;

//urlPatterns 속성
//- 클라이언트가 "/member/xxx" URL을 요청할 때 이 서블릿을 실행하라고 표시한다.
//- /member/xxx 요청이 들어오면 서블릿 컨테이너는 이 서블릿 객체를 실행한다.
//
@SuppressWarnings("serial")
@WebServlet("/member/view")
public class MemberViewServlet extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);

        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>회원 관리</title>");
        out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");
        out.println("<link rel='stylesheet' href='../css/common.css'>");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        RequestDispatcher rd = request.getRequestDispatcher("/header");
        rd.include(request, response);
        out.println("<h1>회원 상세 정보</h1>");

        
        try {
            int no = Integer.parseInt(request.getParameter("no"));
            Member member = memberDao.selectOne(no);
            
            if (member != null) {
                out.println("<form action='update' method='post'>");
                
                out.println("<div class='form-group row'>");
                out.println("<label for='no' class='col-sm-2 col-form-label'>번호</label>");
                out.println("<div class='col-sm-10'>");
                out.printf("<input class='form-control' readonly id='no' type='number' name='no' value='%d'>\n", 
                            member.getNo());
                out.println("</div>");
                out.println("</div>");
                
                out.println("<div class='form-group row'>");
                out.println("<label for='no' class='col-sm-2 col-form-label'>이름</label>");
                out.println("<div class='col-sm-10'>");
                out.printf("<input class='form-control' id='name' type='text' name='name' value='%s'>\n", 
                            member.getName());
                out.println("</div>");
                out.println("</div>");
                
                out.println("<div class='form-group row'>");
                out.println("<label for='no' class='col-sm-2 col-form-label'>이메일</label>");
                out.println("<div class='col-sm-10'>");
                out.printf("<input class='form-control' id='email' type='email' name='email' value='%s'>\n", 
                            member.getEmail());
                out.println("</div>");
                out.println("</div>");
               
                out.println("<div class='form-group row'>");
                out.println("<label for='no' class='col-sm-2 col-form-label'>패스워드</label>");
                out.println("<div class='col-sm-10'>");
                out.printf("<input class='form-control' id='pwd' type='password' name='pwd' value='%s'>\n", 
                            member.getPassword());
                out.println("</div>");
                out.println("</div>");
               
                
                out.println("<div class='form-group row'>");
                out.println("<div class='col-sm-10'>");
                out.println("<button class='btn btn-primary btn-sm' >변경</button>");
                out.printf("<a href='delete?no=%d' class='btn btn-primary btn-sm'>삭제</a>\n", member.getNo());
                out.println("</div>");
                out.println("</div>");
                
                out.println("</form>");
                
            } else {
                out.printf("'%d'의 성적 정보가 없습니다.\n", no); 
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
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










