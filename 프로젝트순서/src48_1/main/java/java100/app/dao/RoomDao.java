package java100.app.dao;

import java.util.List;

import java100.app.domain.Room;

public interface RoomDao {
	public List<Room> selectlist();
	public int intsert(Room room);
	public int delete(int no);

}
