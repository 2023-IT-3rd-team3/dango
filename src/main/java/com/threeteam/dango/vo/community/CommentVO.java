package com.threeteam.dango.vo.community;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class CommentVO {

	private String commentid;
	private String commentmain;
	private String userid;
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
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "CommentVO [commentseq="+commentid+", commentcontent="+commentmain+", writer="+userid+", regDate="+commentregisterdate+"]";
	}
}