package com.threeteam.dango;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.threeteam.dango.service.community.BoardService;
import com.threeteam.dango.vo.community.BoardDTO;

@Controller
public class HomeController {
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setBoardNotice(0);
		
		model.addAttribute("boardList", boardService.getBoardFivePost(boardDTO));
		return "mainpage";
	}
	
}
