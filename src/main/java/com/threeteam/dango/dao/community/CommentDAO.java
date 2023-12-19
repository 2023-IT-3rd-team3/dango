package com.threeteam.dango.dao.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.threeteam.dango.vo.community.CommentVO;

@Repository
public class CommentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// SQL명령어
	private final String COMMENT_ADD="insert into T_COMMENT(commentid, commentmain, userid, boardid) values(?, ?, ?, ?)";
	private final String COMMENT_DELETE="select * from T_COMMENT order by commentid desc";
	private final String COMMENT_UPDATE="update T_COMMENT set commentmain=? where commentid=?";
	
	
	public void addComment(CommentVO vo) {
		jdbcTemplate.update(COMMENT_ADD, vo.getCommentmain(), vo.getUserid());
	}
	
	public void deleteComment(CommentVO vo) {
		jdbcTemplate.update(COMMENT_DELETE);
	}
	
	public void updateComment(CommentVO vo) {
		jdbcTemplate.update(COMMENT_UPDATE, vo.getCommentmain());
	}
	
	public CommentVO getComment(CommentVO vo) {
		
	}
	
	public List<CommentVO> getCommentList(CommentVO vo){
		return null;
	}
}
