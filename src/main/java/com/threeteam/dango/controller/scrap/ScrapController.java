package com.threeteam.dango.controller.scrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.threeteam.dango.service.community.ScrapService;
import com.threeteam.dango.vo.community.ScrapVO;

@RestController
@SessionAttributes("scrap")
@RequestMapping("/scrap/*")
public class ScrapController {

	@Autowired
	ScrapService scrapService;
	
	@GetMapping
	public String scrapMain(ScrapVO scrapVO, Model model) {
		
		return "/scrap/main";
	}
	
	@PostMapping("/insertScrap")
	public String insertScrap(@RequestParam("boardId") Long boardId, @RequestParam("userId") String userId) {
		try {
	        scrapService.insertScrap(boardId, userId);
	        return "success";
	    } catch (Exception e) {
	        e.printStackTrace();
	        return "failure";
	    }
	}
	
	@PostMapping("/deleteScrap")
	public String deleteScrap(@RequestParam("boardId") Long boardId, @RequestParam("userId") String userId) {
		try {
	        scrapService.deleteScrap(boardId, userId);
	        return "success";
	    } catch (Exception e) {
	        e.printStackTrace();
	        return "failure";
	    }
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
	
	
}
