package java100.app.dao;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.domain.Board;

//BoardDao 클래스로부터 메서드 호출 규칙만 분리하여 따로 정의한다.
//=> setDataSource()는 컨트롤러가 호출하는 메서드가 아니다.
//=> 그래서 규칙에서 제외했다.
//=> 이 규칙은 BoardController가 호출하는 규칙이다.
public interface BoardDao {
    List<Board> findAll(Map<String,Object> params);
    int insert(Board board);
    int update(Board board);
    int delete(int no);
    Board findByNo(int no);
    int updateViewCount(int no);
    int countAll();
}















