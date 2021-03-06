package java100.app.control.score;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.annotation.RequestMapping;
import java100.app.dao.ScoreDao;
import java100.app.domain.Score;

@Component("/score/update")
public class ScoreUpdateController {

    @Autowired ScoreDao scoreDao;
    @RequestMapping
    public String update(Score score,HttpServletRequest request, HttpServletResponse response) throws Exception {
       
        scoreDao.update(score);
        return "redirect:list.do";
        
        
    }
}
