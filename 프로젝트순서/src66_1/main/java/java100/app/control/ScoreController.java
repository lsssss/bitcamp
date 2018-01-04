package java100.app.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java100.app.dao.ScoreDao;
import java100.app.domain.Score;

@Controller
public class ScoreController {

    @Autowired
    ScoreDao scoreDao;

    @RequestMapping("/score/list")
    public String list(HttpServletRequest request, HttpServletResponse response) throws Exception {

        List<Score> list = scoreDao.selectList();
        request.setAttribute("list", list);
        return "/score/list.jsp";
    }
    
    @RequestMapping("/score/add")
    public String add(Score score,HttpServletRequest request, HttpServletResponse response) throws Exception {
       
        scoreDao.insert(score);
        return "redirect:list.do";
        
    }
    @RequestMapping("/score/delete")
    public String delete(Score score,HttpServletRequest request, HttpServletResponse response) throws Exception {

        scoreDao.delete(score.getNo());
        return "redirect:list.do";
        
    }
    @RequestMapping("/score/form")
    public String form(HttpServletRequest request, HttpServletResponse response) throws Exception {
         
         return  "/score/form.jsp";
         
     }
    
    @RequestMapping("/score/update")
    public String update(Score score,HttpServletRequest request, HttpServletResponse response) throws Exception {
       
        scoreDao.update(score);
        return "redirect:list.do";
    }
    
    @RequestMapping("/score/view")
    public String view(@RequestParam("no") int no,HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        Score score= scoreDao.selectOne(no);
        request.setAttribute("score", score);
        return "/score/view.jsp";
        
    }
}
