package java100.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java100.app.App;
import java100.app.domain.Room;
import java100.app.util.DataSource;

public class RoomDao {
	
	
	public List<Room> selectlist() {
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		  
        try {
        	
        	con = DataSource.getConnection();
        	pstmt = con.prepareStatement("select no,loc,name,capacity from ex_room");
            rs = pstmt.executeQuery();
        	
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
        }finally {
			try {rs.close();}catch(Exception e) {}
			try {pstmt.close();}catch(Exception e) {}
			DataSource.returnConnection(con);
		}
	}
	
	public int intsert(Room room) {
		
		Connection con =null;
		PreparedStatement pstmt = null;
		
		
		  
        try {
        	
        	con = DataSource.getConnection();
        	pstmt = con.prepareStatement("insert into ex_room(loc,name,capacity) values(?,?,?)");

			pstmt.setString(1, room.getLocation());
			pstmt.setString(2, room.getName());
			pstmt.setInt(3, room.getCapacity());

			return pstmt.executeUpdate();

		} catch (Exception e) {
			throw new DaoException(e);
		}finally {
			try {pstmt.close();}catch(Exception e) {}
			DataSource.returnConnection(con);
		}
		
	}
	
	public int delete(int no) {

		Connection con =null;
		PreparedStatement pstmt = null;
		
		
		
		try {
			
			con = DataSource.getConnection();
        	pstmt = con.prepareStatement("delete from ex_room where no=?");

			pstmt.setInt(1, no);

			return pstmt.executeUpdate();
		} catch (Exception e) {
		
			throw new DaoException();
		}finally {
			try {pstmt.close();}catch(Exception e) {}
			DataSource.returnConnection(con);
		}
		
	}
	
	
	
}
