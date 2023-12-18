package com.threeteam.dango.service.community;

import com.threeteam.dango.vo.community.RecommendVO;

public interface RecommendService {

	public void plusRecommend(RecommendVO vo);
	public void minusRecommend(RecommendVO vo);
}
