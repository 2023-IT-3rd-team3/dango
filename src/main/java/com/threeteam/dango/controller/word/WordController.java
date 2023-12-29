package com.threeteam.dango.controller.word;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.threeteam.dango.domain.user.UserVO;
import com.threeteam.dango.mapper.word.WordMapper;
import com.threeteam.dango.service.word.WordService;
import com.threeteam.dango.service.word.WrongService;

@Controller
@RequestMapping("/word/*")
public class WordController {
	@Autowired
	WordService wordService;
	@Autowired
	WrongService wrongService;
	
	private UserVO getSessionUser(HttpServletRequest request) {
		HttpSession session = request.getSession();
		UserVO userInfo = (UserVO)session.getAttribute("user");
		
		return userInfo;
	}
	
	@GetMapping("/new/{wordLevel}")
	public String list(@PathVariable("wordLevel") Integer wordLevel, Model model, HttpServletRequest request) {
		UserVO userInfo = getSessionUser(request);
		if(userInfo == null)
			return "/user/login";
		
		model.addAttribute("sentenceList", wordService.getSentenceList(wordLevel, userInfo.getUserid()));
		model.addAttribute("userId", userInfo.getUserid());
		return "word/newWord";
	}
	@GetMapping("/new")
	public String selectLevel(HttpServletRequest request) {
		UserVO userInfo = getSessionUser(request);
		if(userInfo == null)
			return "/user/login";
		
		return "word/newWordLevelSelect";
	}
	@GetMapping("/wrong")
	public String wrongNote(Model model, HttpServletRequest request) {
		UserVO userInfo = getSessionUser(request);
		if(userInfo == null)
			return "/user/login";
		
		model.addAttribute("sentenceList", wrongService.getWrongAllByUserId(userInfo.getUserid()));
		return "word/wrongNote";
	}
}