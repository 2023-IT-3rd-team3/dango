package com.threeteam.dango.login.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.threeteam.dango.login.domain.vo.LoginVO;

@Mapper
public interface LoginMapper {

	public LoginVO loginCheck(LoginVO login);
	public void insert(LoginVO login);
	public LoginVO load(String id);
	public String findid(String name);
	public String findpw(String id);
	public LoginVO read(String id);
	public int delete(String id);
	public int usermodify(LoginVO login);
}
