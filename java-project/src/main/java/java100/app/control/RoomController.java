package java100.app.control;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import java100.app.domain.Room;

// RoomController는 ArrayList를 상속 받은 서브 클래스이기도 하지만,
// Controller라는 규칙을 따르는 클래스이기도 하다!
public class RoomController extends ArrayList<Room> implements Controller {
    private static final long serialVersionUID = 1L;
    Scanner keyScan = new Scanner(System.in);
    
    @Override
    public void destroy() {}
    
    // CSV 형식으로 저장된 파일에서 성적 데이터를 읽어 
    // ArrayList에 보관한다.
    @Override
    public void init() {
    	try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (ClassNotFoundException ex) {
			throw new RuntimeException("JDBC 드라이버 클래스를 찾을수 없습니다");
		}

    }
    
    
    // 다음 메서드는 Controller 규칙을 따르기로 했기 때문에,
    // Controller 선언된 추상 메서드를 오버라이딩 한 것이다.
    // 만약 추상 메서드를 오버라이딩 하지 않는다면,
    // 이 클래스는 추상 클래스가 되어야 한다.
    @Override
    public void execute(Request request, Response response) {
        switch (request.getMenuPath()) {
        case "/room/list": this.doList(request, response); break;
        case "/room/add": this.doAdd(request, response); break;
        case "/room/delete": this.doDelete(request, response); break;
        default: 
            response.getWriter().println("해당 명령이 없습니다.");
        }
    }
    
    private void doList(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[강의실 목록]");
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");
				PreparedStatement pstmt = con.prepareStatement("select no,loc,name,capacity from ex_room");
				ResultSet rs = pstmt.executeQuery();) {

			while (rs.next()) {
				out.printf("%4d, %-4s, %4s, %4d\n", rs.getInt("no"), rs.getString("loc"),rs.getString("name"),rs.getInt("capacity") );
			}

		} catch (Exception e) {
			e.printStackTrace();
			out.println(e.getMessage());
		}
        
    }
    
    private void doAdd(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[강의실 등록]");
        
        
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");
				PreparedStatement pstmt = con
						.prepareStatement("insert into ex_room (loc,name,capacity) values(?,?,?)");) {

			
			pstmt.setString(1, request.getParameter("loc"));
			pstmt.setString(2, request.getParameter("name"));
			pstmt.setInt(3, Integer.parseInt(request.getParameter("capacity")));

			pstmt.executeUpdate();
			out.println("등록하였습니다");

		} catch (Exception e) {
			e.printStackTrace();
			out.println(e.getMessage());
		}
        
        
    } 
    
    private void doDelete(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[강의실 삭제]");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");
				PreparedStatement pstmt = con
						.prepareStatement("delete from ex_room where no=?");) {

			pstmt.setInt(1, Integer.parseInt(request.getParameter("no")));

			if (pstmt.executeUpdate() > 0) {
				out.println("삭제하였습니다");
			} else {
				out.printf("'%s'의 강의실 정보가 없습니다.\n", request.getParameter("no"));
			}

		} catch (Exception e) {
			e.printStackTrace();
			out.println(e.getMessage());
		}

		
        
    }
    
    private Room find(String roomName) {
        Iterator<Room> iterator = this.iterator();
        while (iterator.hasNext()) {
            Room room = iterator.next();
            if (room.getName().equals(roomName)) {
                return room;
            }
        }
        return null;
    }
}










