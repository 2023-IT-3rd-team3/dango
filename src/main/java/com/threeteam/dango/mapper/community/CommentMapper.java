package com.threeteam.dango.mapper.community;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.threeteam.dango.vo.community.CommentVO;

@Mapper
public interface CommentMapper {

	public CommentVO getComment(CommentVO commentVO);
	public List<CommentVO> getCommentList(CommentVO commentId);
	public void addComment(CommentVO commentVO);
	public void deleteComment(CommentVO commentVO);
	public void updateComment(CommentVO commentVO);
}