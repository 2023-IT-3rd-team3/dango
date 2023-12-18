package com.threeteam.dango.dao.community;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.threeteam.dango.vo.community.RecommendVO;

public class RecommendDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void plusRecommend(RecommendVO vo) {
			
	}
		
	public void minusRecommend(RecommendVO vo) {
			
	}
}
