package com.threeteam.dango.service.community;

import java.util.List;

import org.springframework.stereotype.Service;

import com.threeteam.dango.domain.word.SentenceDTO;
import com.threeteam.dango.vo.community.ScrapVO;

@Service
public interface ScrapService {

	public boolean isScrap(ScrapVO scrapVO);
	public void insertScrap(ScrapVO scrapVO);
	public void deleteScrap(ScrapVO scarpVO);
	public List<ScrapVO> getScrapList(ScrapVO scrapId);
	public ScrapVO getScrap(ScrapVO scrapVO);
}