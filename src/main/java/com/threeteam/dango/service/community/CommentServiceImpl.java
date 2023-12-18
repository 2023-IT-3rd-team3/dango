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
	public void addComment(CommentVO vo) {
		commentDAO.addComment(vo);
	}

	@Override
	public void deleteComment(CommentVO vo) {
		commentDAO.deleteComment(vo);
	}

	@Override
	public CommentVO getComment(CommentVO vo) {
		return commentDAO.getComment(vo);
	}

	@Override
	public List<CommentVO> getCommantList(CommentVO vo) {
		return commentDAO.getCommentList(vo);
	}

}
