package com.threeteam.dango.controller.word;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.threeteam.dango.mapper.word.WordMapper;

@Controller
@RequestMapping("/word/*")
public class WordController {
	@Autowired
	private WordMapper wordMapper;
	
	@GetMapping("/new")
	public String list(Model model) {
		model.addAttribute("time", wordMapper.getTime());
		return "word/newWord";
	}
}
