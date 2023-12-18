package com.threeteam.dango.dao.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.threeteam.dango.vo.community.BoardVO;

public class CommentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// SQL명령어
	private final String COMMENT_ADD="";
	private final String COMMENT_DELETE="";
	private final String COMMENT_UPDATE="";
	
	
	public void addComment(BoardVO vo) {
		jdbcTemplate.update(COMMENT_ADD, vo.getCommentmain(), vo.getUserid());
	}
	
	public void deleteComment(BoardVO vo) {
		
	}
	
	public void updateComment(BoardVO vo) {
		
	}
	
	public BoardVO getComment(BoardVO vo) {
		return vo;
		
	}
	
	public List<BoardVO> getCommentList(BoardVO vo){
		return null;
		
	}
}
