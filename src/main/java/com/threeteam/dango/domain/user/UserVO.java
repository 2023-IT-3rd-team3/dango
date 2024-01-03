package com.threeteam.dango.domain.user;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class UserVO {

	private String userId;
	private String userPw;
	private String userName;
	private String userPhone;
	private String userEmail;
	private String userAdmin;
	private String userProfile;
	private String userRegisterDate;
	private String userUpdateDate;
	
	@Override
	public String toString() {
		return "UserVO [userid=" + userId + ", userpw=" + userPw + ", username=" + userName + ", userphone="
				+ userPhone + ", useremail=" + userEmail + ", useradmin=" + userAdmin + ", userregisterdate="
				+ userRegisterDate + ", userupdatedate=" + userUpdateDate + "]";
	}
}
