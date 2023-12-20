package com.threeteam.dango.mapper.user;

import org.apache.ibatis.annotations.Mapper;

import com.threeteam.dango.domain.user.UserVO;



@Mapper
public interface UserMapper {

	public void insert(UserVO login);
	public UserVO select(UserVO login);
	public int delete(String id);
	public int update(UserVO user);
	public String selectid(UserVO user);
	public String selectpw(UserVO user);
}
