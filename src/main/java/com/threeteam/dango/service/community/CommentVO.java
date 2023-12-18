package com.threeteam.dango.service.community;

import java.util.Date;

public class CommentVO {

	// Comment
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
		
		@Override
		public String toString() {
			return "CommentVO [seq="+commentid+", content="+commentmain+", writer="+userid+", regDate="+commentregisterdate+"]";
		}
}
