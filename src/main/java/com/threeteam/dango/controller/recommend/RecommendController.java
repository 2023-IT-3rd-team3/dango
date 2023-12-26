package com.threeteam.dango.controller.recommend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.threeteam.dango.service.community.RecommendService;

@RestController
@RequestMapping("/recommend/*")
public class RecommendController {

	@Autowired
	RecommendService recommendService;
	
	@GetMapping("plusRecommend")
	public String plusRecommend() {
		return "CommunityPostpage";
	}
	
	@GetMapping("minusRecommend")
	public String minusRecommend() {
		return "CommunityPostpage";
	}
}
