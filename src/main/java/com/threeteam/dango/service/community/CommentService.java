package com.threeteam.dango.service.community;

import java.util.List;

import org.springframework.stereotype.Service;

import com.threeteam.dango.vo.community.CommentVO;

@Service
public interface CommentService {

	public void addComment(CommentVO commentVO);
	public void deleteComment(CommentVO commentVO);
	public CommentVO getComment(CommentVO commentVO);
	public List<CommentVO> getCommantList(CommentVO commentVO);
}
