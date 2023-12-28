package com.threeteam.dango.controller.recent;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.threeteam.dango.domain.recent.RecentVO;
import com.threeteam.dango.domain.user.UserVO;
import com.threeteam.dango.service.recent.RecentService;

@Controller
@RequestMapping("dango/recent/*")
public class RecentController {
	
	@Autowired
	private RecentService recentService;
	
	@ResponseBody
	@PostMapping(value = "/", consumes = "application/json")
	public boolean insertRecent(@RequestBody Long wordId, HttpServletRequest request, Model model) {
		
		HttpSession session = request.getSession();
		UserVO userVO = (UserVO)session.getAttribute("user");
		
		RecentVO vo = new RecentVO();
		vo.setUserId(userVO.getUserid());
		vo.setWordId(wordId);
		boolean recent = recentService.isRecent(vo);
		
		return recent;
	}
	
	@GetMapping(value = "/getRecentList")
	public String getRecentList(HttpServletRequest request, Model model) {
		System.out.println("recent 목록 보기 처리");
		
		HttpSession session = request.getSession();
		UserVO userVO = (UserVO)session.getAttribute("user");
		
		model.addAttribute("recent", recentService.getRecentList(userVO));
		return "/getRecentList";
	}
}
