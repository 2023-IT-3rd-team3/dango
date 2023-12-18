package com.threeteam.dango.vo.community;

import java.util.Date;

public class ReplyVO {

	private String replyid;
	private String userid;
	private String commentid;
	private String replymain;
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
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getCommentid() {
		return commentid;
	}
	public void setCommentid(String commentid) {
		this.commentid = commentid;
	}
	public String getReplymain() {
		return replymain;
	}
	public void setReplymain(String replymain) {
		this.replymain = replymain;
	}
		
	@Override
	public String toString() {
		return "ReplyVO [Replyseq="+replyid+", content="+replymain+", writer="+userid+", regDate="+replyregisterdate+"]";
	}
}
