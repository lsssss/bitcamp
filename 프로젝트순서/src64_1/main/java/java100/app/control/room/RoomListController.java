package java100.app.control.room;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.annotation.RequestMapping;
import java100.app.dao.RoomDao;
import java100.app.domain.Room;

@Component("/room/list")
public class RoomListController {

    @Autowired RoomDao roomDao;
    
    @RequestMapping
    public String list(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Room> list = roomDao.selectList();
        request.setAttribute("list", list);
        return "/room/list.jsp";
    }
}
