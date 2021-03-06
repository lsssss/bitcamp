package java100.app.control.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.control.PageController;
import java100.app.dao.MemberDao;

@Component("/member/delete")
public class MemberDeleteController implements PageController {
   @Autowired MemberDao memberDao;
    public String service(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int no = Integer.parseInt(request.getParameter("no"));
        memberDao.delete(no);
        return  "redirect:list.do";
    }
}
