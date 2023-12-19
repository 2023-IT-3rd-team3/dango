package com.threeteam.dango.service.community;

import java.util.List;

import org.springframework.stereotype.Service;

import com.threeteam.dango.domain.word.SentenceDTO;
import com.threeteam.dango.vo.community.ScrapVO;

@Service
public interface ScrapService {

	public void addScrap(ScrapVO scrapVO);
	public void deleteScrap(ScrapVO scarpVO);
	public List<ScrapVO> getScrapList(String scrapId);
	public ScrapVO getScrapVO(ScrapVO scrapVO);
}
