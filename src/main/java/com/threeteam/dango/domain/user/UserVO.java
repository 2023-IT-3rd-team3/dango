package com.threeteam.dango.domain.user;

import org.springframework.stereotype.Component;

@Component
public class UserVO {

	private String userid;
	private String userpw;
	private String username;
	private String userphone;
	private String useremail;
	private String useradmin;
	private String userregisterdate;
	private String userupdatedate;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUseradmin() {
		return useradmin;
	}
	public void setUseradmin(String useradmin) {
		this.useradmin = useradmin;
	}
	public String getUserregisterdate() {
		return userregisterdate;
	}
	public void setUserregisterdate(String userregisterdate) {
		this.userregisterdate = userregisterdate;
	}
	public String getUserupdatedate() {
		return userupdatedate;
	}
	public void setUserupdatedate(String userupdatedate) {
		this.userupdatedate = userupdatedate;
	}
	@Override
	public String toString() {
		return "UserVO [userid=" + userid + ", userpw=" + userpw + ", username=" + username + ", userphone="
				+ userphone + ", useremail=" + useremail + ", useradmin=" + useradmin + ", userregisterdate="
				+ userregisterdate + ", userupdatedate=" + userupdatedate + "]";
	}
}
