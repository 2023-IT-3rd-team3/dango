package com.threeteam.dango.mapper.community;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.threeteam.dango.vo.community.CommentVO;

public class CommentMapper implements RowMapper<CommentVO> {

	public CommentVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		CommentVO comment = new CommentVO();
		
		comment.setCommentid(rs.getInt("commentid"));
		comment.setCommentmain(rs.getString("commentmain"));
		comment.setCommentregisterdate(rs.getDate("commentregisterdate"));
		comment.setCommentupdatedate(rs.getDate("commentupdatedate"));
		comment.setUserid(rs.getString("userid"));
		
		return comment;
	}
}