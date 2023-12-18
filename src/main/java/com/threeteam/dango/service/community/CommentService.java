package com.threeteam.dango.service.community;

import java.util.List;

import org.springframework.stereotype.Service;

import com.threeteam.dango.vo.community.CommentVO;

@Service
public interface CommentService {

	public void addComment(CommentVO vo);
	public void deleteComment(CommentVO vo);
	public CommentVO getComment(CommentVO vo);
	public List<CommentVO> getCommantList(CommentVO vo);
}
