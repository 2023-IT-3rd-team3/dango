package com.threeteam.dango.service.community;

import java.util.Date;

public class CommunityVO {
	
	// Community Board
	private String boardid;
	private String boardtitle;
	private String userid;
	private String boardmain;
	private String boardnotice;
	private Date boardregisterdate;
	private Date boardupdatedate;
	
	public String getBoardid() {
		return boardid;
	}
	public void setBoardid(String boardid) {
		this.boardid = boardid;
	}
	public String getBoardtitle() {
		return boardtitle;
	}
	public void setBoardtitle(String boardtitle) {
		this.boardtitle = boardtitle;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getBoardmain() {
		return boardmain;
	}
	public void setBoardmain(String boardmain) {
		this.boardmain = boardmain;
	}
	public String getBoardnotice() {
		return boardnotice;
	}
	public void setBoardnotice(String boardnotice) {
		this.boardnotice = boardnotice;
	}
	public Date getBoardregisterdate() {
		return boardregisterdate;
	}
	public void setBoardregisterdate(Date boardregisterdate) {
		this.boardregisterdate = boardregisterdate;
	}
	public Date getBoardupdatedate() {
		return boardupdatedate;
	}
	public void setBoardupdatedate(Date boardupdatedate) {
		this.boardupdatedate = boardupdatedate;
	}
	
	// Comment
	private String commentid;
	private String commentmain;
	private Date commentregisterdate;
	private Date commentupdatedate;
	
	public String getCommentid() {
		return commentid;
	}
	public void setCommentid(String commentid) {
		this.commentid = commentid;
	}
	public String getCommentmain() {
		return commentmain;
	}
	public void setCommentmain(String commentmain) {
		this.commentmain = commentmain;
	}
	public Date getCommentregisterdate() {
		return commentregisterdate;
	}
	public void setCommentregisterdate(Date commentregisterdate) {
		this.commentregisterdate = commentregisterdate;
	}
	public Date getCommentupdatedate() {
		return commentupdatedate;
	}
	public void setCommentupdatedate(Date commentupdatedate) {
		this.commentupdatedate = commentupdatedate;
	}
	
	// Reply
	private String replyid;
	private Date replyregisterdate;
	private Date replyupdatedate;
	
	public String getReplyid() {
		return replyid;
	}
	public void setReplyid(String replyid) {
		this.replyid = replyid;
	}
	public Date getReplyregisterdate() {
		return replyregisterdate;
	}
	public void setReplyregisterdate(Date replyregisterdate) {
		this.replyregisterdate = replyregisterdate;
	}
	public Date getReplyupdatedate() {
		return replyupdatedate;
	}
	public void setReplyupdatedate(Date replyupdatedate) {
		this.replyupdatedate = replyupdatedate;
	}
	
	// Scrap
	private String scrapid;
	private Date scrapregisterdate;
	private Date scrapupdatedate;
	
	public String getScrapid() {
		return scrapid;
	}
	public void setScrapid(String scrapid) {
		this.scrapid = scrapid;
	}
	public Date getScrapregisterdate() {
		return scrapregisterdate;
	}
	public void setScrapregisterdate(Date scrapregisterdate) {
		this.scrapregisterdate = scrapregisterdate;
	}
	public Date getScrapupdatedate() {
		return scrapupdatedate;
	}
	public void setScrapupdatedate(Date scrapupdatedate) {
		this.scrapupdatedate = scrapupdatedate;
	}
	
	// Recommend
	private String recommendid;
	private Date recommendregisterdate;
	private Date recommendupdatedate;

	public String getRecommendid() {
		return recommendid;
	}
	public void setRecommendid(String recommendid) {
		this.recommendid = recommendid;
	}
	public Date getRecommendregisterdate() {
		return recommendregisterdate;
	}
	public void setRecommendregisterdate(Date recommendregisterdate) {
		this.recommendregisterdate = recommendregisterdate;
	}
	public Date getRecommendupdatedate() {
		return recommendupdatedate;
	}
	public void setRecommendupdatedate(Date recommendupdatedate) {
		this.recommendupdatedate = recommendupdatedate;
	}
}