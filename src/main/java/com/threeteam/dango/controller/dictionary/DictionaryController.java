package com.threeteam.dango.controller.dictionary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	@GetMapping("/list")
	public String searchList() {
		return "/dictionary/dictionaryList";
	}
}
