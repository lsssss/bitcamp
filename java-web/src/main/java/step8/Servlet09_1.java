package step8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@SuppressWarnings("serial")
@WebServlet("/step8/Servlet09_1")
@MultipartConfig
public class Servlet09_1 extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
       
     
        
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        
        
        Part photo1Filename = req.getPart("photo1");
        String photo1Name = photo1Filename.getSubmittedFileName();
        Part photo2Filename = req.getPart("photo2");
        String photo2Name = photo2Filename.getSubmittedFileName();
      
       
        out.printf("이름 : %s\n",name);
        out.printf("나이 : %s\n",age);
        out.printf("사진1 : %s\n",photo1Name);
        out.printf("사진2 : %s\n",photo2Name);
    }
}

















