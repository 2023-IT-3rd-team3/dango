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
	public String recommendMain() {
		return "";
	}
	
	@GetMapping
	public String insertRecommend() {
		return "";
	}
	
	@GetMapping
	public String deleteRecommend() {
		return "";
	}
	
	@GetMapping
	public String updateRecommend() {
		return "";
	}
	
	@GetMapping
	public String getRecommend() {
		return "";
	}
	
	@GetMapping
	public String getRecommendList() {
		return "";
	}
}
