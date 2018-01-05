package java100.app.service;

import java.util.List;
import java.util.Map;

import java100.app.domain.Board;

public interface BoardService {
    List<Board> list(int pageNo, int pageSize, Map<String,Object> options);
    Board get(int no);
    int update(Board board);
    int delete(int no);
    int getTotalCount();
    int updateViewCount(int no);
    int add(Board board);
    
}
