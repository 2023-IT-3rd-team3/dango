package com.threeteam.dango.service.community;

import java.util.List;

public interface CommunityService {

	// Board
	public void insertBoard(CommunityVO vo);
	public void updateBoard(CommunityVO vo);
	public void deleteBoard(CommunityVO vo);
	public CommunityVO getBoard(CommunityVO vo);
	public List<CommunityVO> getBoardList(CommunityVO vo);
	
	// Comment
	public void addComment(CommunityVO vo);
	public void deleteComment(CommunityVO vo);
	
	// Reply
	public void addReply(CommunityVO vo);
	public void deleteReply(CommunityVO vo);
	
	// Scrap
	public void addScrap(CommunityVO vo);
	public void deleteScrap(CommunityVO vo);
	
	// Recommend
	public void plusRecommend(CommunityVO vo);
	public void minusRecommend(CommunityVO vo);
}
