package java100.app.dao;

import java.util.List;
import java100.app.domain.Score;

public interface ScoreDao {
	public List<Score> selectList();
	public int insert(Score score);
	public int update(Score score);
	public int delete(int no);
	public Score selectOne(int no);
}
