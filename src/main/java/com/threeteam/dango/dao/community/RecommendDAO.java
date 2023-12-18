package com.threeteam.dango.dao.community;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.threeteam.dango.vo.community.BoardVO;

public class RecommendDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// Recommend
	public void plusRecommend(BoardVO vo) {
			
	}
		
	public void minusRecommend(BoardVO vo) {
			
	}
}
