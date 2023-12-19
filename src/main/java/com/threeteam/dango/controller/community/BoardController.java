package com.threeteam.dango.controller.community;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.threeteam.dango.service.community.BoardService;

@RestController
@RequestMapping("/community/*")
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@GetMapping("/boardList")
	public String boardList(Model model) {
		model.addAllAttributes("", );
		return "boardList";
	}
	
	@GetMapping("/boardView")
	public String boardView(Model model, int boardId) {
		modle.
	}
	@GetMapping("/boardInsert")
	
	@GetMapping("/boardUpdate")
	
	@GetMapping("/boardDelete")
	
	@GetMapping("/board")
	
}