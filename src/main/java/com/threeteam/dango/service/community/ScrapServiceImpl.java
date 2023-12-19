package com.threeteam.dango.service.community;

import org.springframework.beans.factory.annotation.Autowired;

import com.threeteam.dango.dao.community.ScrapDAO;
import com.threeteam.dango.vo.community.ScrapVO;

public class ScrapServiceImpl implements ScrapService {

	@Autowired
	ScrapDAO scrapDAO;
	
	@Override
	public void addScrap(ScrapVO vo) {
		scrapDAO.addScrap(vo);
	}

	@Override
	public void deleteScrap(ScrapVO vo) {
		scrapDAO.deleteScrap(vo);
	}

}
