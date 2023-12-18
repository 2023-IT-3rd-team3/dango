package com.threeteam.dango.dao.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.threeteam.dango.vo.community.ScrapVO;

public class ScrapDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void addScrap(ScrapVO vo) {
		
	}
	
	public void deleteScrap(ScrapVO vo) {
		
	}
	
	public ScrapVO getScrap(ScrapVO vo) {
		return vo;
		
	}
	
	public List<ScrapVO> getScrapList(ScrapVO vo){
		return null;
		
	}
}
