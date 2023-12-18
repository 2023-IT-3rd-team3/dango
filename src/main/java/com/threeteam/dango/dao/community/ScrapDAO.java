package com.threeteam.dango.dao.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.threeteam.dango.service.community.BoardVO;

public class ScrapDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void addScrap(BoardVO vo) {
		
	}
	
	public void deleteScrap(BoardVO vo) {
		
	}
	
	public BoardVO getScrap(BoardVO vo) {
		return vo;
		
	}
	
	public List<BoardVO> getScrapList(BoardVO vo){
		return null;
		
	}
}
