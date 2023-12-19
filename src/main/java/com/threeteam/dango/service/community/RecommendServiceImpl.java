package com.threeteam.dango.service.community;

import org.springframework.beans.factory.annotation.Autowired;

import com.threeteam.dango.dao.community.RecommendDAO;
import com.threeteam.dango.vo.community.RecommendVO;

public class RecommendServiceImpl implements RecommendService {

	@Autowired
	RecommendDAO recommendDAO;
	
	@Override
	public void plusRecommend(RecommendVO vo) {
		recommendDAO.plusRecommend(vo);
	}

	@Override
	public void minusRecommend(RecommendVO vo) {
		recommendDAO.minusRecommend(vo);
	}

}
