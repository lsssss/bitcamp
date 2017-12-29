package step12;

import java.util.List;
import java.util.Map;

public interface BoardDao {
    
    List<Board> findAll(Map<String,Object> data);
    Board findByNo(int no);
    int insert(Board board);
    int update(Board board);  
    int delete(int no);
}
