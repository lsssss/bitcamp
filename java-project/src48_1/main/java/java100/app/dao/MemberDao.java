package java100.app.dao;

import java.util.List;

import java100.app.domain.Member;

public interface MemberDao {
	public List<Member> selectList();
	public int insert(Member member);
	public int update(Member member);
	public int delete(int no);
	public Member selectOne(int no);
}
