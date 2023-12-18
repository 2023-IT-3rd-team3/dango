package com.threeteam.dango.login.service;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.threeteam.dango.login.domain.dao.LoginDAO;
import com.threeteam.dango.login.domain.vo.LoginVO;

import lombok.extern.log4j.Log4j;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDAO loginDAO;
	
	@Override
	public LoginVO loginCheck(LoginVO login,HttpSession session) {
		LoginVO user = loginDAO.loginCheck(login);
		if(user != null) {
			session.setAttribute("userVO",user);
		}
		return user ;
	}

	@Override
	public void logOut(HttpSession session) {
			session.invalidate();
	}

	@Override
	public void register(LoginVO login) {
		loginDAO.register(login);
	}

	@Override
	public String FindID(String name) {
		return loginDAO.FindID(name);
	}
	
	@Override
	public String FindPW(String id) {
		return loginDAO.FindPW(id);
	}
	
	@Override
	public LoginVO infoload(String id) {
		return loginDAO.infoload(id);
		
	}

	@Override
	public boolean remove(String id) {
		return loginDAO.remove(id);
	}

	@Override
	public boolean usermodify(LoginVO login) {
		return loginDAO.usermodify(login);
	}

}
