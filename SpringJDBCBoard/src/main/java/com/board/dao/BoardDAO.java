package com.board.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.board.domain.Board;

@Repository
public class BoardDAO {

	// jdbc template
	@Autowired
	private JdbcTemplate jdbcTemplate;

	// 쿼리문
	public static String insert = "insert into jdbcBoard(board_no, title, content, writer)\r\n"
			+ "values(jdbcboard_seq.nextval, ?, ?, ?)";
	public static String list = "SELECT board_no, title, content, writer, reg_date FROM jdbcBoard WHERE board_no > 0 "
			+ "ORDER BY board_no desc, reg_date DESC";
	public static String read = "SELECT board_no, title, content, writer, reg_date FROM jdbcBoard WHERE board_no = ?";
	public static String delete = "delete from jdbcBoard where board_no = ?";
	// curd 함수 처리
	public void create(Board board) throws Exception {
		jdbcTemplate.update(insert, board.getTitle(), board.getContent(), board.getWriter());
	}

	public List<Board> list() throws Exception {
		List<Board> result = jdbcTemplate.query(list, new RowMapper<Board>() {

			@Override
			public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
				Board board = new Board();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setRegDate(rs.getDate("reg_date"));
				return board;
			}

		});

		return result;
	}

	public Board read(Integer boardNo) throws Exception {
		List<Board> results = jdbcTemplate.query(read, new RowMapper<Board>() {
			@Override
			public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
				Board board = new Board();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setRegDate(rs.getDate("reg_date"));
				return board;
			}
		}, boardNo);
		return results.isEmpty() ? null : results.get(0);
	}

	public void delete(Integer boardNo) throws Exception {
		jdbcTemplate.update(delete, boardNo);
	}
}
