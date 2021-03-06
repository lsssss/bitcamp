// 서블릿 초기화 파라미터
//
package step7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step7/Servlet02")
public class Servlet02 extends HttpServlet{
    
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        int a = Integer.parseInt( req.getParameter("a"));
        int b = Integer.parseInt( req.getParameter("b"));
        String op = req.getParameter("op");
        
        
        
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>계산기</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>계산결과</h1>");
        out.print("<p>");        
        out.printf("%d %s %d =", a, op, b);
        switch(op){
        case "+" : out.println(a+b); break;
        case "-" : out.println(a-b); break;
        case "*" : out.println(a*b); break;
        case "/" : out.println(a/b); break;
        case "%" : out.println(a%b); break;
        default: out.println("지원하지 않는 연산자 입니다!");
        }
        out.print("<p>");
        
        out.println("</body>");
        out.println("</html>");
    
    }
}









