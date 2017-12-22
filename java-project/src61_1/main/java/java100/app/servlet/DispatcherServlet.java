package java100.app.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 프론트 컨트롤러
// -페이지 컨트롤러의 앞 쪽에서 요청을 먼저 받는다.
// - 페이지 컨트롤러가 사용하기 쉽게 요청 데이터를 가공한다.
// - 페이지 컨트롤러가 작업을 완료하면 그 작업 결과를 출력할 JSP를 실행한다.
// - 또는 redirect 한다.
// - "Facade" 설계와 같다

@WebServlet("*.do")
@SuppressWarnings("serial")
public class DispatcherServlet extends HttpServlet{

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //클라이언트가 요청한 URL에서 .do를 제외한 서블릿 경로를 추출한다
        //페이지 컨트롤러의 경로를 추출한다.
        String pageControllerPath = request.getServletPath().replaceAll(".do", "");
        //페이지 컨트롤러 실행을 포함한다.
        RequestDispatcher rd = request.getRequestDispatcher(pageControllerPath);
        rd.include(request, response);
        
        //페이지 컨트롤러를 실행한 후 
        //viewName 의 값에 따라 다음 작업을 수행한다.
        String viewName = (String)request.getAttribute("viewName"); 
        
        if(viewName.startsWith("redirect:")) {
            response.sendRedirect(viewName.substring(9));
            return;
            
        }else {
            
            response.setContentType("text/html;charset=UTF-8");
            rd = request.getRequestDispatcher(viewName);
            rd.include(request, response);
        }
        
    }
    
}
