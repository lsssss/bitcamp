package java100.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java100.app.beans.ApplicationContext;
import java100.app.domain.Board;
import java100.app.util.DataSource;

public class BoardDao {
	DataSource ds;

	public void setDataSource(DataSource ds) {
		this.ds = ds;
	}

	public List<Board> selectList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = ds.getConnection();

			pstmt = con.prepareStatement("select no,title,regdt,vwcnt from ex_board");
			rs = pstmt.executeQuery();

			ArrayList<Board> list = new ArrayList<>();
			while (rs.next()) {

				Board board = new Board(rs.getInt("no"), rs.getString("title"), rs.getString("regdt"),
						rs.getInt("vwcnt"));
				list.add(board);
			}
			return list;

		} catch (Exception e) {
			throw new DaoException();
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

	public int insert(Board board) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ds.getConnection();

			pstmt = con.prepareStatement("insert into ex_board(title,conts,regdt)" + " values(?,?,now())");
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());

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

	public Board selectOne(int no) {
		Connection con = null;

		try {
			con = ds.getConnection();

			try (PreparedStatement pstmt = con.prepareStatement("update ex_board set vwcnt = vwcnt + 1 where no=?")) {
				pstmt.setInt(1, no);
				pstmt.executeUpdate();
			} catch (Exception e) {
			}

			try (PreparedStatement pstmt = con
					.prepareStatement("select no,title,conts,regdt,vwcnt from ex_board where no=?")) {

				pstmt.setInt(1, no);

				ResultSet rs = pstmt.executeQuery();
				Board board = new Board();
				if (rs.next()) {
					board.setNo(no);
					board.setTitle(rs.getString("title"));
					board.setContent(rs.getString("conts"));
					board.setRegDate(rs.getString("regdt"));
					board.setViewCount(rs.getInt("vwcnt"));
				}
				rs.close();
				return board;

			} catch (Exception e) {
				throw new DaoException();
			}
		} catch (Exception e) {
			throw new DaoException();
		}
	}

	public int delete(int no) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ds.getConnection();

			pstmt = con.prepareStatement("delete from ex_board where no=?");

			pstmt.setInt(1, no);

			return pstmt.executeUpdate();
		} catch (Exception e) {
			throw new DaoException();
		}
	}

	public int update(Board board) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ds.getConnection();

			pstmt = con.prepareStatement("update ex_board set title=?,conts=? where no=?");

			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setInt(3, board.getNo());

			return pstmt.executeUpdate();

		} catch (Exception e) {
			throw new DaoException();
		}

	}

}
