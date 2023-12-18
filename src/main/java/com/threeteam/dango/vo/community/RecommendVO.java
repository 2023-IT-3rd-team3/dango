package com.threeteam.dango.vo.community;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class RecommendVO {

	private String recommendid;
	private String boardid;
	private String userid;
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
	public String getBoardid() {
		return boardid;
	}
	public void setBoardid(String boardid) {
		this.boardid = boardid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
}
