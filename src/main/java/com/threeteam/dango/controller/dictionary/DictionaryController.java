package com.threeteam.dango.controller.dictionary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.threeteam.dango.service.word.WordService;

@Controller
@RequestMapping("/dictionary/*")
public class DictionaryController {
	@Autowired
	WordService wordService;
	
	@GetMapping("/")
	public String main() {
		return "/dictionary/dictionaryMain";
	}
	@GetMapping("/{wordId}")
	public String searchWord(@PathVariable("wordId") Long wordId, Model model) {
		model.addAttribute("sentence", wordService.getSentenceByWordId(wordId));
		
		return "/dictionary/dictionarySearch";
	}
	@GetMapping("/search")
	public String searchResult(String keyword, Model model) {
		model.addAttribute("wordList", wordService.getWordAllByKeyword(keyword));
		
		return "/dictionary/dictionaryList";
	}
}
