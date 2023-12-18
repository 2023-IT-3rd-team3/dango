package com.threeteam.dango.dao.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.threeteam.dango.vo.community.ReplyVO;

public class ReplyDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// SQL 명령어
	private final String REPLY_ADD="insert into T_REPLY(replyid, replymain, userid, commentid) values(?, ?, ?, ?)";
	private final String REPLY_DELETE="select * from T_REPLY order by replyid desc";
	private final String REPLY_UPDATE="update T_REPLY set replymain=? where replyid=?";
	
	
	public void addReply(ReplyVO vo) {
		jdbcTemplate.update(REPLY_ADD, vo.getReplymain());
	}
	
	public void deleteReply(ReplyVO vo) {
		jdbcTemplate.update(REPLY_DELETE);
	}
	
	public void updateReply(ReplyVO vo) {
		jdbcTemplate.update(REPLY_UPDATE, vo.getReplymain());
	}
	
	public ReplyVO getReply(ReplyVO vo) {
		return vo;
		
	}
	
	public List<ReplyVO> getReplyList(ReplyVO vo){
		return null;
		
	}
		
}
