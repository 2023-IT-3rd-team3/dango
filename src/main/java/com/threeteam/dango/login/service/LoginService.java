package com.threeteam.dango.login.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.threeteam.dango.login.domain.vo.LoginVO;

@Service
public interface LoginService {

	public LoginVO loginCheck(LoginVO login,HttpSession session);
	public void logOut(HttpSession session);
	public void register(LoginVO login);
	public String FindID(String name);
	public String FindPW(String id);
	public LoginVO infoload(String id);
	public boolean remove(String id);
	public boolean usermodify(LoginVO login);
}
