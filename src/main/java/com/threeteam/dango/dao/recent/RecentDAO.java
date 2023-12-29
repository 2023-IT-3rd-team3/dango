package com.threeteam.dango.dao.recent;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.threeteam.dango.domain.recent.RecentVO;
import com.threeteam.dango.domain.user.UserVO;
import com.threeteam.dango.domain.word.WordVO;

@Repository("recentDAO")
public class RecentDAO {
	
	@Autowired
	public static SqlSessionTemplate mybatis;
	
	public static boolean isRecent(RecentVO vo) {
		System.out.println("------>>> isCheck() 기능 처리");
		return mybatis.selectOne("RecentDAO.isRecent", vo);
	}
	
	public static void setRecent(RecentVO vo) {
		System.out.println("------>>> setRecent() 기능 처리");
		mybatis.insert("RecentDAO.setRecent", vo);
	}
	
	public static void updateRecent(RecentVO vo) {
		System.out.println("------>>> updateRecent() 기능 처리");
		mybatis.update("RecentDAO.updateRecent", vo);
	}
	
	public static List<WordVO> getRecentList(UserVO userVO){
		System.out.println("------>>> getRecentList() 기능 처리");
		return mybatis.selectList("RecentDAO.getRecentList", userVO.getUserid());
	}
}
