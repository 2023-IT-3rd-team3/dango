package com.threeteam.dango.mapper.community;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.threeteam.dango.vo.community.ScrapVO;

@Mapper
public interface ScrapMapper {

	public List<ScrapVO> getScrapList(String scrapId);
	public void addScrap(ScrapVO scrapVO);
	public void deleteScrap(ScrapVO scrapVO);
	public ScrapVO getScarp(ScrapVO scrapVO);
}