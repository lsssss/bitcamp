package java100.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java100.app.domain.Room;

public class RoomDao {
	
	
	public List<Room> selectlist() {
		  
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb", "study", "1111");
             PreparedStatement pstmt = con.prepareStatement(
                "select no,loc,name,capacity from ex_room");
             ResultSet rs = pstmt.executeQuery();){
        	
        	 ArrayList<Room> list = new ArrayList<>();
            while (rs.next()) {
            	Room room = new Room(rs.getInt("no"),
            			rs.getString("loc"),
            			rs.getString("name"),
            			rs.getInt("capacity")
            			);
            	list.add(room);
            }
            return list;
            
        } catch (Exception e) {
        	throw new DaoException(e);
        }
	}
	
	public int intsert(Room room) {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");
				PreparedStatement pstmt = con
						.prepareStatement("insert into ex_room(loc,name,capacity) values(?,?,?)");) {

			pstmt.setString(1, room.getLocation());
			pstmt.setString(2, room.getName());
			pstmt.setInt(3, room.getCapacity());

			return pstmt.executeUpdate();

		} catch (Exception e) {
			throw new DaoException(e);
		}
		
	}
	
	public int delete(int no) {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");
				PreparedStatement pstmt = con.prepareStatement("delete from ex_room where no=?");) {

			pstmt.setInt(1, no);

			return pstmt.executeUpdate();
		} catch (Exception e) {
		
			throw new DaoException();
		}
		
	}
	
	
	
}
