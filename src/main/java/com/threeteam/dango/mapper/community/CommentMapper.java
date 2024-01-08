package com.threeteam.dango.mapper.community;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.threeteam.dango.vo.community.CommentVO;

@Mapper
public interface CommentMapper {

	public CommentVO getComment(CommentVO commentVO);
	public List<CommentVO> getCommentList(CommentVO commentVO);
	public int addComment(CommentVO commentVO);
	public int deleteComment(CommentVO commentVO);
	public int updateComment(CommentVO commentVO);
}