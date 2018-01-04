package java100.app.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java100.app.dao.RoomDao;
import java100.app.domain.Room;

@Controller
public class RoomController {

    @Autowired RoomDao roomDao;
    
    @RequestMapping("/room/list")
    public String list(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Room> list = roomDao.selectList();
        request.setAttribute("list", list);
        return "/room/list.jsp";
    }
    
    @RequestMapping("/room/add")
    public String add(Room room,HttpServletRequest request, HttpServletResponse response) throws Exception {
       
        roomDao.insert(room);
        return "redirect:list.do";
        
    }
    
    @RequestMapping("/room/delete")
    public String delete(Room room,HttpServletRequest request, HttpServletResponse response) throws Exception {
        roomDao.delete(room.getNo());
        return "redirect:list.do";
        
    }
    
    @RequestMapping("/room/form")
    public String form(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        
        return "/room/form.jsp";
        
    }
}
