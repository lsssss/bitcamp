package java100.app.servlet;

// 프론트 컨트롤러
// -페이지 컨트롤러의 앞 쪽에서 요청을 먼저 받는다.
// - 페이지 컨트롤러가 사용하기 쉽게 요청 데이터를 가공한다.
// - 페이지 컨트롤러가 작업을 완료하면 그 작업 결과를 출력할 JSP를 실행한다.
// - 또는 redirect 한다.
// - "Facade" 설계와 같다
import static org.reflections.ReflectionUtils.getMethods;
import static org.reflections.ReflectionUtils.withAnnotation;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.listener.ContextLoaderListener;

@WebServlet("*.do")
@SuppressWarnings("serial")
public class DispatcherServlet extends HttpServlet{

    @SuppressWarnings("unchecked")
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //클라이언트가 요청한 URL에서 .do를 제외한 서블릿 경로를 추출한다
        //페이지 컨트롤러의 경로를 추출한다.
        String pageControllerPath = request.getServletPath().replaceAll(".do", "");
        
        
        Object pageController = ContextLoaderListener.iocContainer.getBean(pageControllerPath);
        
        if(pageController == null) {
            throw new ServletException("페이지 컨트롤러를 찾을 수 없습니다.");
        }
        
        
       Set<Method> methods = getMethods(pageController.getClass(), withAnnotation(java100.app.annotation.RequestMapping.class));
       
       if(methods.size() == 0 ) {
           throw new ServletException("페이지 컨트롤러의 요청 핸들러를 찾을 수 없습니다.");
       }
       
       Method requestHandler = (Method)methods.toArray()[0];
       
        try {
            String viewName =(String)requestHandler.invoke( pageController, request, response); 
            
            if(viewName.startsWith("redirect:")) {
                response.sendRedirect(viewName.substring(9));
                return;
                
            }else {
                
                response.setContentType("text/html;charset=UTF-8");
                RequestDispatcher rd = request.getRequestDispatcher(viewName);
                rd.include(request, response);
            }
            
        } catch (Exception e) {
            throw new ServletException(e);
        }
        
    }
    
}
