package com.threeteam.dango.controller.word;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.threeteam.dango.mapper.word.WordMapper;
import com.threeteam.dango.service.word.WordService;

@Controller
@RequestMapping("/word/*")
public class WordController {
	@Autowired
	WordService WordService;
	
	@GetMapping("/new/{wordlevel}")
	public String list(@PathVariable("wordlevel") Integer wordlevel, Model model) {
		model.addAttribute("sentenceList", WordService.getSentenceList(wordlevel));
		return "word/newWord";
	}
	@GetMapping("/new")
	public String selectLevel() {
		return "word/newWordLevelSelect";
	}
}