package java100.app.control;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberController implements Controller{
    
    @Override
    public void destroy() {
    }
    
    @Override
	public void init() {
		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (ClassNotFoundException ex) {
			throw new RuntimeException("JDBC 드라이버 클래스를 찾을수 없습니다");
		}

	}
    
    // 실제 이 클래스가 오버라이딩 하는 메서드는 
    // GenericController가 따른다고 한 Controller 인터페이스의 
    // 추상 메서드이다.
    @Override    
    public void execute(Request request, Response response) {
        switch (request.getMenuPath()) {
        case "/member/list": this.doList(request, response); break;
        case "/member/add": this.doAdd(request, response); break;
        case "/member/view": this.doView(request, response); break;
        case "/member/update": this.doUpdate(request, response); break;
        case "/member/delete": this.doDelete(request, response); break;
        default: 
            response.getWriter().println("해당 명령이 없습니다.");
        }
    }
    
    private void doList(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        out.println("[회원 목록]");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");
				PreparedStatement pstmt = con.prepareStatement("select no,name,email,regdt from ex_memb");
				ResultSet rs = pstmt.executeQuery();) {

			while (rs.next()) {
				out.printf("%4d, %4s, %4s, %4s\n", rs.getInt("no"), rs.getString("name"), rs.getString("email"), rs.getString("regdt"));
			}

		} catch (Exception e) {
			e.printStackTrace();
			out.println(e.getMessage());
		}
        
    }
    
    private void doAdd(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[회원 등록]");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");
				PreparedStatement pstmt = con
						.prepareStatement("insert into ex_memb (name,email,pwd,regdt) values(?,?,passsword(?),now())");) {

			pstmt.setString(1, request.getParameter("name"));
			pstmt.setString(2, request.getParameter("email"));
			pstmt.setString(3, request.getParameter("password"));

			pstmt.executeUpdate();
			out.println("등록하였습니다");

		} catch (Exception e) {
			e.printStackTrace();
			out.println(e.getMessage());
		}

	}
        
        
    
    private void doView(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[회원 상세 정보]");
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");
				PreparedStatement pstmt = con
						.prepareStatement("select no,name,email,regdt from ex_memb where no=?");) {

			pstmt.setInt(1, Integer.parseInt(request.getParameter("no")));
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				out.printf("번호 : %d\n", rs.getInt("no"));
				out.printf("이름 : %s\n", rs.getString("name"));
				out.printf("이메일 : %s\n", rs.getString("email"));
				out.printf("날짜 : %s\n", rs.getString("regdt"));
			} else {
				out.printf("'%s'의 회원 정보가 없습니다.\n", request.getParameter("no"));
			}
			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
			out.println(e.getMessage());
		}

        
    } 
    
    private void doUpdate(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");
				PreparedStatement pstmt = con
						.prepareStatement("update ex_memb set name=?,email=?,pwd=password(?) where no=?");) {

			pstmt.setString(1, request.getParameter("name"));
			pstmt.setString(2, request.getParameter("email"));
			pstmt.setString(3, request.getParameter("password"));
			pstmt.setInt(4, Integer.parseInt(request.getParameter("no")));

			if (pstmt.executeUpdate() > 0) {
				out.println("변경하였습니다");
			} else {
				out.printf("'%s'의 회원 정보가 없습니다.\n", request.getParameter("no"));
			}

		} catch (Exception e) {
			e.printStackTrace();
			out.println(e.getMessage());
		}

        
    }
    
    
    
    private void doDelete(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[회원 삭제]");
    	
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");
				PreparedStatement pstmt = con
						.prepareStatement("delete from ex_memb where no=?");) {

			pstmt.setInt(1, Integer.parseInt(request.getParameter("no")));

			if (pstmt.executeUpdate() > 0) {
				out.println("삭제하였습니다");
			} else {
				out.printf("'%s'의 성적 정보가 없습니다.\n", request.getParameter("no"));
			}

		} catch (Exception e) {
			e.printStackTrace();
			out.println(e.getMessage());
		}
    }
    
}










