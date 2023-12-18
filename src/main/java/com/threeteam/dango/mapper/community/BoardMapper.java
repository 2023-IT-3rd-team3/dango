package com.threeteam.dango.mapper.community;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.threeteam.dango.vo.community.BoardVO;

public interface BoardMapper implements RowMapper<BoardVO>{
	
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		BoardVO board = new BoardVO();
		board.setBoardid(rs.getInt("boardid"));
		board.setBoardtitle(rs.getString("boardtitle"));
		board.setBoardmain(rs.getString("boardmain"));
		board.setUserid(rs.getString("userid"));
		board.setBoardregisterate(rs.getDate("boadregisterdate"));
		
		return board;
	}
}