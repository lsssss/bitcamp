package java100.app.web;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java100.app.dao.RoomDao;
import java100.app.domain.Room;
import java100.app.service.RoomService;

@Controller
@RequestMapping("/room")
public class RoomController {
    @Autowired RoomService roomService;
    @Autowired RoomDao roomDao;
    
    @RequestMapping("list")
    public String list(
            @RequestParam(value="pn", defaultValue="1") int pageNo,
            @RequestParam(value="ps", defaultValue="5") int pageSize,
            @RequestParam(value="nm", required=false) String[] names,
            @RequestParam(value="oc", required=false) String orderColumn,
            @RequestParam(value="al", required=false) String align,
            Model model) throws Exception {

        
        if (pageNo < 1) {
            pageNo = 1;
        }
        if (pageSize < 5 || pageSize > 15) {
            pageSize = 5;
        }
        
        
        HashMap<String,Object> options = new HashMap<>();
        options.put("names", names);
        options.put("orderColumn", orderColumn);
        options.put("align", align);
        
        int totalCount = roomService.getTotalCount();
        int lastPageNo = totalCount / pageSize;
        if((totalCount % pageSize) > 0) {
            lastPageNo++;
        }
        model.addAttribute("pageNo", pageNo);
        model.addAttribute("lastPageNo",lastPageNo);
        model.addAttribute("list", roomService.list(pageNo, pageSize, options));
        return "room/list";
    }
    
    
    
    @RequestMapping("add")
    public String add(Room room) throws Exception {
        roomService.add(room);
        return "redirect:list";
        
    }
    
    @RequestMapping("delete")
    public String delete(int no,Room room) throws Exception {
        roomService.delete(no);
        return "redirect:list";
    }
    
    @RequestMapping("form")
    public String form() throws Exception {
        return "room/form";
        
    }
}
