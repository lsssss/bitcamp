package java100.app.control.member;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.annotation.RequestMapping;
import java100.app.dao.MemberDao;
import java100.app.domain.Member;

@Component("/member/list")
public class MemberListController {

    @Autowired MemberDao memberDao;
    
    @RequestMapping
    public String list(HttpServletRequest request, HttpServletResponse response) throws Exception {

        List<Member> list = memberDao.selectList();
        request.setAttribute("list", list);
        return "/member/list.jsp";
       
        
    }
}
