package com.threeteam.dango.controller.scrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.threeteam.dango.service.community.ScrapService;

@RestController
@RequestMapping("/scrap")
public class ScrapController {

	@Autowired
	ScrapService scrapService;
	
	@GetMapping
	public String scrapMain() {
		return "";
	}
	
	@GetMapping
	public String insertScrap() {
		return "";
	}
	
	@GetMapping
	public String deleteScrap() {
		return "";
	}
	
	@GetMapping
	public String getScrap() {
		return "";
	}
	
	@GetMapping
	public String getScrapList() {
		return "";
	}
}
