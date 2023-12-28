package com.threeteam.dango.dao.check;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.threeteam.dango.domain.check.CheckVO;
import com.threeteam.dango.domain.user.UserVO;
import com.threeteam.dango.domain.word.WordVO;

@Repository("checkDAO")
public class CheckDAO {
	
	@Autowired
	public SqlSessionTemplate mybatis;
	
	public boolean isCheck(CheckVO vo) {
		System.out.println("------>>> isCheck() 기능 처리");
		return mybatis.selectOne("CheckDAO.isCheck", vo);
	}
	
	public void onCheck(CheckVO vo) {
		System.out.println("------>>> onCheck() 기능 처리");
		mybatis.insert("CheckDAO.onCheck", vo);
	}
	
	public void offCheck(CheckVO vo) {
		System.out.println("------>>> offCheck() 기능 처리");
		mybatis.delete("CheckDAO.offCheck", vo);
	}
	
	public List<WordVO> getCheckList(UserVO userVO){
		System.out.println("------>>> getCheckList() 기능 처리");
		return mybatis.selectList("CheckDAO.getCheckList", userVO.getUserid());
	}
}