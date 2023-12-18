package com.threeteam.dango.dao.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.threeteam.dango.service.community.BoardVO;

public class ReplyDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// SQL 명령어
	private final String REPLY_ADD="";
	private final String REPLY_DELETE="";
	private final String REPLY_UPDATE="";
	
	
	public void addReply(BoardVO vo) {
		
	}
	
	public void deleteReply(BoardVO vo) {
		
	}
	
	public void updateReply(BoardVO vo) {
		
	}
	
	public BoardVO getReply(BoardVO vo) {
		return vo;
		
	}
	
	public List<BoardVO> getReplyList(BoardVO vo){
		return null;
		
	}
		
}
