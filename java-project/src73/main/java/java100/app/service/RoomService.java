package java100.app.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import java100.app.domain.Room;
@Service
public interface RoomService {

    List<Room> list(int pageNo, int pageSize, Map<String,Object> options);
    int add(Room room);
    int delete(int no);
    int getTotalCount();
}
