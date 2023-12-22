package com.threeteam.dango.controller.recomment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.threeteam.dango.service.community.RecommendService;

@RestController
@RequestMapping
public class RecommentController {

	@Autowired
	RecommendService recommendService;
	
	@GetMapping
	public String plusRecommend() {
		return "";
	}
	
	@GetMapping
	public String minusRecommend() {
		return "";
	}
	
}
