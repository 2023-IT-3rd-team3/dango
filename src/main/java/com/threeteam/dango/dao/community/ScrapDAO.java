package com.threeteam.dango.dao.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.threeteam.dango.mapper.community.ScrapMapper;
import com.threeteam.dango.vo.community.ScrapVO;

@Repository
public class ScrapDAO {

	@Autowired
	ScrapMapper scrapMapper;
	
	public void addScrap(ScrapVO scrapVO) {
		scrapMapper.addScrap(scrapVO);
	}
	
	public void deleteScrap(ScrapVO scrapVO) {
		scrapMapper.deleteScrap(scrapVO);
	}
	
	public ScrapVO getScrap(ScrapVO scrapVO) {
		return scrapMapper.getScarp(scrapVO);
	}
	
	public List<ScrapVO> getScrapList(String scrapId){
		return scrapMapper.getScrapList(scrapId);
	}
}
