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
	/* 
	 *  스크랩 추가할 때 필요
	 *  boardId : 어느 게시글을 스크랩할지
	 *  userId : 어느 유저가 추가할지
	 *  scrapId
	 *  scrapregisterdate : 언제 스크랩했는지
	 *  scrapupdatedate : ??
	 */
	
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
