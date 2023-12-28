package com.threeteam.dango.controller.scrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.threeteam.dango.service.community.ScrapService;
import com.threeteam.dango.vo.community.ScrapVO;

@RestController
@RequestMapping("/scrap/*")
public class ScrapController {

	@Autowired
	ScrapService scrapService;
	
	@GetMapping
	public String scrapMain(ScrapVO scrapVO, Model model) {
		
		return "/scrap/main";
	}
	
	@GetMapping
	public String insertScrap(ScrapVO scrapVO) {
		return "/scrap/insertScrap";
	}
	
	@GetMapping
	public String deleteScrap(ScrapVO scrapVO) {
		return "/scrap/deleteScrap";
	}
	
	@GetMapping
	public String getScrap(ScrapVO scrapVO, Model model) {
		model.addAttribute("", scrapService.getScrap(scrapVO));
		return ".jsp";
	}
	
	@GetMapping("/scrapList")
	public String getScrapList() {
		return "ScrapList.jsp";
	}
	
	/*
	스크랩 버튼을 누르면
	보드테이블에서 보드id, 유저id 받아서 scrap테이블에 저장
	count 컬럼 추가해서 0이면 추가하고 1이면 추가 x (boolean?)
	
	view? -> boardid 추적?
*/
}
