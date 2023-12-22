package com.threeteam.dango.dao.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.threeteam.dango.mapper.community.CommentMapper;
import com.threeteam.dango.vo.community.CommentVO;

@Repository
public class CommentDAO {

	@Autowired
	CommentMapper commentMapper;
	
	public void insertComment(CommentVO commentVO) {
		commentMapper.addComment(commentVO);
	}
	
	public void deleteComment(CommentVO commentVO) {
		commentMapper.deleteComment(commentVO);
	}
	
	public void updateComment(CommentVO commentVO) {
		commentMapper.updateComment(commentVO);
	}
	
	public CommentVO getComment(CommentVO commentVO) {
	    return commentMapper.getComment(commentVO);
	}
	
	public List<CommentVO> getCommentList(CommentVO commentId){
		return commentMapper.getCommentList(commentId);
	}
}
