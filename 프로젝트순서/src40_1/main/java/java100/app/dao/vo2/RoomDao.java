package java100.app.dao.vo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java100.app.App;
import java100.app.domain.Room;

public class RoomDao {
	
	static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // => com.mysql.jdbc.Driver 클래스를 로딩한다.
            // => static {} 블록을 수행한다.
            //    => Driver 인스턴스를 생성한다.
            //    => DriverManager에 그 인스턴스를 등록한다.
            
        } catch (ClassNotFoundException ex) {
            // 이 예외가 발생하면 init()를 호출한 쪽에 예외를 던진다.
            // 단 RuntimeException 예외인 경우 스텔스 방식으로 전달되기 때문에,
            // 굳이 메서드 선언부에 어떤 예외를 던지는지 적시할 필요는 없다.
            throw new RuntimeException(
                    "JDBC 드라이버 클래스를 찾을 수 없습니다.");
        }
	}
	
	
	public RoomDao() {
	}
	
	
	public List<Room> selectlist() {
		  
        try (
             PreparedStatement pstmt = App.con.prepareStatement(
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

		try (
				PreparedStatement pstmt = App.con
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

		try (
				PreparedStatement pstmt = App.con.prepareStatement("delete from ex_room where no=?");) {

			pstmt.setInt(1, no);

			return pstmt.executeUpdate();
		} catch (Exception e) {
		
			throw new DaoException();
		}
		
	}
	
	
	
}
