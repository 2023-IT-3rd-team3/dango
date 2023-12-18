package com.threeteam.dango.login.domain.dao;

import org.springframework.stereotype.Repository;

import com.threeteam.dango.login.domain.vo.LoginVO;

@Repository
public interface LoginDAO {

	public LoginVO loginCheck(LoginVO login);
	public void register(LoginVO login);
	public LoginVO infoload(String id);
	public String FindID(String name);
	public String FindPW(String id);
	public LoginVO getUser(String id);
	public boolean remove(String id);
	public boolean usermodify(LoginVO login);
}
