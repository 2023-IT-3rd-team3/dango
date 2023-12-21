package com.threeteam.dango.controller.check;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.threeteam.dango.domain.check.CheckVO;
import com.threeteam.dango.domain.word.WordVO;
import com.threeteam.dango.service.check.CheckService;

@RestController
@RequestMapping("/check/*")
public class CheckController {

	@Autowired
	private CheckService checkService;
	
	@PostMapping("/toggleCheck")
	public boolean checkWord(@RequestBody CheckVO vo) {
		
		boolean isChecked = checkService.isCheck(vo);
		
		return isChecked;
	}
	
	@GetMapping("/getCheck")
	public String getCheck(CheckVO vo, Model model) {
		System.out.println("check 상세 보기 처리");
		model.addAttribute("check", checkService.getCheck(vo));
		return "getCheck.jsp";
	}
	
	@GetMapping("/getCheckList")
	public String getCheckList(CheckVO vo, Model model) {
		System.out.println("check 상세 보기 처리");

		model.addAttribute("check", checkService.getCheckList(vo));
		return "getCheckList.jsp";
	}
}
