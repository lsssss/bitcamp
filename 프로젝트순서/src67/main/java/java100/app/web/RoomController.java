package java100.app.web;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java100.app.dao.RoomDao;
import java100.app.domain.Room;

@Controller
@RequestMapping("/room")
public class RoomController {

    @Autowired RoomDao roomDao;
    
    @RequestMapping("list")
    public String list(
            @RequestParam(value="nm", required=false) String[] names,
            @RequestParam(value="oc", required=false) String orderColumn,
            @RequestParam(value="al", required=false) String align,
            Model model) throws Exception {

        HashMap<String,Object> params = new HashMap<>();
        params.put("names", names);
        params.put("orderColumn", orderColumn);
        params.put("align", align);
        
        model.addAttribute("list", roomDao.findAll(params));
        return "room/list";
    }
    
    @RequestMapping("add")
    public String add(Room room) throws Exception {
        roomDao.insert(room);
        return "redirect:list";
        
    }
    
    @RequestMapping("delete")
    public String delete(int no,Room room) throws Exception {
        roomDao.delete(no);
        return "redirect:list";
        
    }
    
    @RequestMapping("form")
    public String form() throws Exception {
        
        return "room/form";
        
    }
}
