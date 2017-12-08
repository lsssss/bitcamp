package java100.app.servlet.score;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.ScoreDao;
import java100.app.domain.Score;
import java100.app.listener.ContextLoaderListener;

// urlPatterns 속성
// - 클라이언트가 "/score/"로 시작하는 URL을 요청할 때 
//   이 서블릿을 실행하라고 표시한다.
// - /score/로 시작하는 요청이 들어오면 서블릿 컨테이너는 이 서블릿 객체를 실행한다.
//
@SuppressWarnings("serial")
@WebServlet(urlPatterns="/score/list")   
public class ScoreListServlet extends HttpServlet {
   
    
    public void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(ScoreDao.class);
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("[성적 목록]");
        
        try {
            List<Score> list = scoreDao.selectList();
            
            for (Score score : list) {
                out.printf("%4d, %-4s, %4d, %6.1f\n",
                        score.getNo(),
                        score.getName(), 
                        score.getSum(), 
                        score.getAver());
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
    }
}













