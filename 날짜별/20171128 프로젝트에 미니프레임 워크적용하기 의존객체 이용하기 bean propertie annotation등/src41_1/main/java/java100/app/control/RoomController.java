package java100.app.control;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import java100.app.dao.RoomDao;
import java100.app.domain.Room;

public class RoomController implements Controller {

	RoomDao roomDao = new RoomDao();

	@Override
	public void destroy() {
	}

	@Override
	public void init() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			// => com.mysql.jdbc.Driver 클래스를 로딩한다.
			// => static {} 블록을 수행한다.
			// => Driver 인스턴스를 생성한다.
			// => DriverManager에 그 인스턴스를 등록한다.

		} catch (ClassNotFoundException ex) {
			// 이 예외가 발생하면 init()를 호출한 쪽에 예외를 던진다.
			// 단 RuntimeException 예외인 경우 스텔스 방식으로 전달되기 때문에,
			// 굳이 메서드 선언부에 어떤 예외를 던지는지 적시할 필요는 없다.
			throw new RuntimeException("JDBC 드라이버 클래스를 찾을 수 없습니다.");
		}
	}

	@Override
	public void execute(Request request, Response response) {
		switch (request.getMenuPath()) {
		case "/room/list":
			this.doList(request, response);
			break;
		case "/room/add":
			this.doAdd(request, response);
			break;
		case "/room/delete":
			this.doDelete(request, response);
			break;
		default:
			response.getWriter().println("해당 명령이 없습니다.");
		}
	}

	private void doList(Request request, Response response) {
		PrintWriter out = response.getWriter();
		out.println("[강의실 목록]");

		try {

			List<Room> list = roomDao.selectlist();
			for (Room room : list) {

				out.printf("%d, %s, %s, %d\n", room.getNo(), room.getName(), room.getLocation(), room.getCapacity());
			}

		} catch (Exception e) {
			e.printStackTrace(); // for developer
			out.println(e.getMessage()); // for user
		}
	}

	private void doAdd(Request request, Response response) {

		PrintWriter out = response.getWriter();
		out.println("[강의실 등록]");

		try {
			Room room = new Room();
			room.setLocation(request.getParameter("loc"));  
			room.setName( request.getParameter("name"));
			room.setCapacity(Integer.parseInt(request.getParameter("capacity")));
			roomDao.intsert(room);
			
			out.println("저장하였습니다.");

		} catch (Exception e) {
			e.printStackTrace(); // for developer
			out.println(e.getMessage()); // for user
		}
	}

	private void doDelete(Request request, Response response) {

		PrintWriter out = response.getWriter();
		out.println("[강의실 삭제]");

		try {

			
			int no = Integer.parseInt(request.getParameter("no"));
			
			if (roomDao.delete(no) > 0) {
				out.println("삭제했습니다.");
			} else {
				out.printf("'%s'의 강의실 정보가 없습니다.\n", no);
			}

		} catch (Exception e) {
			e.printStackTrace(); // for developer
			out.println(e.getMessage()); // for user
		}
	}

}
