package com.threeteam.dango.login.domain.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.threeteam.dango.login.domain.vo.LoginVO;
import com.threeteam.dango.login.mapper.LoginMapper;

import lombok.extern.log4j.Log4j;

@Repository
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	LoginMapper loginMapper;

	@Override
	public LoginVO loginCheck(LoginVO login) {
		return loginMapper.loginCheck(login);
	}

	@Override
	public void register(LoginVO login) {
		loginMapper.insert(login);
	}

	@Override
	public LoginVO getUser(String id) {
		return loginMapper.read(id);
	}
	
	@Override
	public String FindID(String name) {
		return loginMapper.findid(name);
	}
	
	@Override
	public String FindPW(String id) {
		return loginMapper.findpw(id);
	}
	
	@Override
	public LoginVO infoload(String id) {
		return loginMapper.load(id);
	}

	@Override
	public boolean remove(String id) {
		return loginMapper.delete(id) != 0;
	}

	@Override
	public boolean usermodify(LoginVO login) {
		return loginMapper.usermodify(login) != 0;
	}

}
