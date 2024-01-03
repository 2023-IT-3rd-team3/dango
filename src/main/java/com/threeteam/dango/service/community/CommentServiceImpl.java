package com.threeteam.dango.service.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.threeteam.dango.dao.community.CommentDAO;
import com.threeteam.dango.vo.community.CommentVO;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentDAO commentDAO;
	
	@Override
	public void insertComment(CommentVO commentVO) {
		commentDAO.insertComment(commentVO);
	}

	@Override
	public void deleteComment(CommentVO commentVO) {
		commentDAO.deleteComment(commentVO);
	}

	@Override
	public CommentVO getComment(CommentVO commentVO) {
		return commentDAO.getComment(commentVO);
	}

	@Override
	public List<CommentVO> getCommentList(CommentVO commentVO) {
		return commentDAO.getCommentList(commentVO);
	}

	@Override
	public void updateComment(CommentVO commentVO) {
		commentDAO.updateComment(commentVO);
	}

}
