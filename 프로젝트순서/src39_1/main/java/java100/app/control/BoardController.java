package java100.app.control;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import java100.app.dao.BoardDao;
import java100.app.domain.Board;
import java100.app.domain.Room;

public class BoardController implements Controller {
    
	BoardDao boardDao = new BoardDao();
    @Override
    public void destroy() {}
    
    @Override
    public void init() {
        
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
        
        try {
            List<Board> list = boardDao.selectList();
            for(Board board : list) {
                out.printf("%d, %s, %s, %d\n",
                		board.getNo(),
                		board.getTitle(),
                		board.getRegDate(),
                		board.getViewCount()
                		);
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
    }

    private void doAdd(Request request, Response response) {

        PrintWriter out = response.getWriter();
        out.println("[게시물 등록]");
        
        try {
            Board board = new Board();
            board.setTitle(request.getParameter("title"));
            board.setContent(request.getParameter("content"));
            boardDao.insert(board);
            out.println("저장하였습니다.");
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
    } 
    
    private void doView(Request request, Response response) {

        PrintWriter out = response.getWriter();
        out.println("[게시물 상세 정보]");
        try {
        	int no = Integer.parseInt(request.getParameter("no"));
        	 
        	Board board = boardDao.selectOne(no);
        	
        	if (board != null) {
                  out.printf("번호: %d\n", board.getNo());
                  out.printf("제목: %s\n", board.getTitle());
                  out.printf("내용: %s\n", board.getContent());
                  out.printf("등록일: %s\n", board.getRegDate());
                  out.printf("조회수: %d\n", board.getViewCount());
              } else {
                  out.printf("'%s'번의 게시물 정보가 없습니다.\n", 
                          request.getParameter("no"));
              }
        	
        }catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
              

    } 
    
    private void doUpdate(Request request, Response response) {

        PrintWriter out = response.getWriter();
        out.println("[게시물 변경]");
        
        try {
            Board board = new Board();
           board.setTitle(request.getParameter("title")); 
           board.setContent(request.getParameter("content"));
           board.setNo(Integer.parseInt(request.getParameter("no")));
            boardDao.update(board);
            if (boardDao.update(board) > 0) {
                out.println("변경하였습니다.");
            } else {
                out.printf("'%s'번 게시물이 없습니다.\n", 
                        board.getNo());
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
    }
    
    private void doDelete(Request request, Response response) {

        PrintWriter out = response.getWriter();
        out.println("[게시물 삭제]");
        
        try{
            
        	int no = Integer.parseInt(request.getParameter("no"));
            
            if (boardDao.delete(no) > 0) {
                out.println("삭제했습니다.");
            } else {
                out.printf("'%s'번의 게시물 정보가 없습니다.\n", 
                       no);
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
    }
}








