package com.threeteam.dango.service.community;

import org.springframework.stereotype.Service;

import com.threeteam.dango.vo.community.RecommendVO;

@Service
public interface RecommendService {

	public void plusRecommend(RecommendVO recommendVO);
	public void minusRecommend(RecommendVO recommendVO);
}
