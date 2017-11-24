package java100.app.control;

import java.io.PrintWriter;
import java.security.spec.ECGenParameterSpec;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;

import java100.app.domain.Board;

public class BoardController extends GenericController<Board> {
    @Override
    public void destroy() {}
    
    
    @Override
    public void init() {
    	try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (ClassNotFoundException ex) {
			throw new RuntimeException("JDBC 드라이버 클래스를 찾을수 없습니다");
		}
    }

    
    
    @Override
    public void execute(Request request, Response response) {
        switch (request.getMenuPath()) {
        case "/board/list": this.doList(request, response); break;
        case "/board/add": this.doAdd(request, response); break;
        case "/board/view": this.doView(request, response); break;
        case "/board/update": this.doUpdate(request, response); break;
        case "/board/delete": this.doDelete(request, response); break;
        default: 
            response.getWriter().println("해당 명령이 없습니다.");
        }
    }
    
    private void doList(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[게시물 목록]");
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");
				PreparedStatement pstmt = con.prepareStatement("select no,title,conts,regdt,vwcnt from ex_board");
				ResultSet rs = pstmt.executeQuery();) {

			while (rs.next()) {
				out.printf("%4d, %4s, %4s, %4s, %4d\n", rs.getInt("no"), rs.getString("title"),rs.getString("conts"),rs.getString("regdt"),rs.getInt("vwcnt"));
			}

		} catch (Exception e) {
			e.printStackTrace();
			out.println(e.getMessage());
		}
    }

    private void doAdd(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[게시물 등록]");
        
    	try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");
				PreparedStatement pstmt = con
						.prepareStatement("insert into ex_board (title,conts,regdt,vwcnt) values(?,?,now(),0)");) {

			pstmt.setString(1, request.getParameter("title"));
			pstmt.setString(2, request.getParameter("content"));

			pstmt.executeUpdate();
			out.println("등록하였습니다");

		} catch (Exception e) {
			e.printStackTrace();
			out.println(e.getMessage());
		}

	}

    
    private void doView(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[상세 게시물 조회]");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");
				PreparedStatement pstmt = con
						.prepareStatement("select no,title,conts,regdt,vwcnt from ex_board where no=?");
        		PreparedStatement pstmt2 = con.prepareStatement("update ex_board set vwcnt=? where no=?");
        		) {

			pstmt.setInt(1, Integer.parseInt(request.getParameter("no")));
			ResultSet rs = pstmt.executeQuery();
			
		
			
			
		
			
			
			
			if (rs.next()) {
			
				out.printf("게시물 번호 : %d\n", rs.getInt("no"));
				out.printf("게시물 제목 : %s\n", rs.getString("title"));
				out.printf("게시물 내용 : %s\n", rs.getString("conts"));
				out.printf("등록 날짜 : %s\n", rs.getString("regdt"));
				out.printf("조회수 : %d\n", rs.getInt("vwcnt"));
				
				int k =  rs.getInt("vwcnt")+1;
				pstmt2.setInt(1, k);
				pstmt2.setInt(2, Integer.parseInt(request.getParameter("no")));
				pstmt2.executeUpdate();
				
			} else {
				out.printf("'%s'의 성적 정보가 없습니다.\n", request.getParameter("no"));
			}
			
			rs.close();
			
			

		} catch (Exception e) {
			e.printStackTrace();
			out.println(e.getMessage());
		}

        
    } 
    
    private void doUpdate(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[게시물 변경]");
        
    }
    
    private void doDelete(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[게시물 삭제]");
    }    
}








