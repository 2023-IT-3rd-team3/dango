package com.threeteam.dango.vo.community;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class BoardVO {

	private String boardid;
	private String boardtitle;
	private String userid;
	private String boardmain;
	private String boardnotice;
	private Date boardregisterdate;
	private Date boardupdatedate;
	private String searchCondition;
	private String searchKeyword;
	
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
	public String getSearchCondition() {
		return searchCondition;
	}
	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}
	public String getSearchKeyword() {
		return searchKeyword;
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
	
	@Override
	public String toString() {
		return "BoardVO [boardid="+boardid+", boardtitle="+boardtitle+", userid="+userid+", boardmain="+boardmain+", boardregisterdate="+boardregisterdate+", boardnotice="+boardnotice+", boardupdatedate="+boardupdatedate+"]";
	}

}