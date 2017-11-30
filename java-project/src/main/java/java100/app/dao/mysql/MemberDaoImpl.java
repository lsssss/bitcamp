package java100.app.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.dao.DaoException;
import java100.app.dao.MemberDao;
import java100.app.domain.Member;
import java100.app.util.DataSource;
@Component
public class MemberDaoImpl implements MemberDao {
	DataSource ds;
	@Autowired
	public void setDataSource(DataSource ds) {
		this.ds = ds;
	}

	public List<Member> selectList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement("select no,name,email,pwd,regdt from ex_memb");
			rs = pstmt.executeQuery();

			ArrayList<Member> list = new ArrayList<>();
			while (rs.next()) {
				Member member = new Member(rs.getInt("no"), rs.getString("name"), rs.getString("email"),
						rs.getString("pwd"), rs.getString("regdt"));
				list.add(member);
			}
			return list;

		} catch (Exception e) {
			throw new DaoException(e);
		} finally {
			try {
				rs.close();
			} catch (Exception e) {
			}
			try {
				pstmt.close();
			} catch (Exception e) {
			}
			ds.returnConnection(con);
		}

	}

	public int insert(Member member) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ds.getConnection();

			pstmt = con.prepareStatement("insert into ex_memb(name,email,pwd,regdt) values(?,?,password(?),now())");
			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getEmail());
			pstmt.setString(3, member.getPassword());

			return pstmt.executeUpdate();

		} catch (Exception e) {
			throw new DaoException(e);
		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {
			}
			ds.returnConnection(con);
		}

	}

	public int update(Member member) {

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ds.getConnection();

			pstmt = con.prepareStatement("update ex_memb set name=?,email=?,pwd=password(?) where no=?");

			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getEmail());
			pstmt.setString(3, member.getPassword());
			pstmt.setInt(4, member.getNo());
			return pstmt.executeUpdate();

		} catch (Exception e) {
			throw new DaoException();
		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {
			}
			ds.returnConnection(con);
		}
	}

	public int delete(int no) {

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ds.getConnection();

			pstmt = con.prepareStatement("delete from ex_memb where no=?");

			pstmt.setInt(1, no);

			return pstmt.executeUpdate();

		} catch (Exception e) {

			throw new DaoException();
		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {
			}
			ds.returnConnection(con);
		}

	}

	public Member selectOne(int no) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ds.getConnection();

			pstmt = con.prepareStatement("select no,email,pwd,regdt from ex_memb where no=?");

			pstmt.setInt(1, no);

			ResultSet rs = pstmt.executeQuery();
			Member member = new Member();
			if (rs.next()) {
				member.setNo(no);
				member.setName(rs.getString("name"));
				member.setEmail("email");
				member.setCreatedDate("regdt");
			}
			rs.close();
			return member;

		} catch (Exception e) {
			throw new DaoException();
		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {
			}
			ds.returnConnection(con);
		}
	}

}
