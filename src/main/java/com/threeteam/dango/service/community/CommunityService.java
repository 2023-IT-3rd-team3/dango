package com.threeteam.dango.service.community;

import java.util.List;

public interface CommunityService {

	// Board
	public void insertBoard(BoardVO vo);
	public void updateBoard(BoardVO vo);
	public void deleteBoard(BoardVO vo);
	public BoardVO getBoard(BoardVO vo);
	public List<BoardVO> getBoardList(BoardVO vo);
	
	// Comment
	public void addComment(BoardVO vo);
	public void deleteComment(BoardVO vo);
	public BoardVO getComment(BoardVO vo);
	public List<BoardVO> getCommantList(BoardVO vo);
	
	// Reply
	public void addReply(BoardVO vo);
	public void deleteReply(BoardVO vo);
	public BoardVO getReply(BoardVO vo);
	public List<BoardVO> getReplyList(BoardVO vo);
	
	// Scrap
	public void addScrap(BoardVO vo);
	public void deleteScrap(BoardVO vo);
	public BoardVO getScrap(BoardVO vo);
	public List<BoardVO> getScrapList(BoardVO vo);
	
	// Recommend
	public void plusRecommend(BoardVO vo);
	public void minusRecommend(BoardVO vo);
}
