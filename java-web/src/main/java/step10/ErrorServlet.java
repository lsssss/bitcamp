package step10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step10/ErrorServlet")
public class ErrorServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Error</title>");
        out.println("<p>name 파라미터 값이 없습니다 </p>\n");
        out.println("</head>");
        out.println("<body>");

        out.printf("<h1>ErrorServlet</h1>");
        out.printf("<p>이 출력은 ErrorServlet에서 만든 것이다.</p>");
        
        
        out.println("</body>");
        out.println("</html>");

    }
}
