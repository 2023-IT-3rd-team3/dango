package com.threeteam.dango.controller.check;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
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
import com.threeteam.dango.domain.user.UserVO;
import com.threeteam.dango.domain.word.WordVO;
import com.threeteam.dango.service.check.CheckService;

@RestController
@RequestMapping("/check/*")
public class CheckController {

	@Autowired
	private CheckService checkService;
	
	@PostMapping(value="/toggleCheck", consumes = "application/json")
	public boolean checkWord(@RequestBody int wordId, HttpServletRequest request, Model model) {
		
		HttpSession session = request.getSession();
		UserVO userVO = (UserVO)session.getAttribute("user");
		
		CheckVO vo = new CheckVO();
		vo.setUserId(userVO.getUserid());
		vo.setWordId(wordId);
		
		boolean isChecked = checkService.isCheck(vo);
		
		return isChecked;
	}
	
	@GetMapping(value="/getCheck", consumes = "application/json;")
	public String getCheck(@RequestBody CheckVO vo, HttpServletRequest request, Model model) {
		System.out.println("check �긽�꽭 蹂닿린 泥섎━");
		model.addAttribute("check", checkService.getCheck(vo));
		return "getCheck.jsp";
	}
	
	@GetMapping(value="/getCheckList", consumes = "application/json;")
	public String getCheckList(@RequestBody WordVO wordVO, HttpServletRequest request, Model model) {
		System.out.println("check 紐⑸줉 蹂닿린 泥섎━");
		HttpSession session = request.getSession();
		UserVO userVO = (UserVO)session.getAttribute("user");
		CheckVO vo = new CheckVO();
		vo.setUserId(userVO.getUserid());
		vo.setWordId(wordVO.getWordId());

		model.addAttribute("check", checkService.getCheckList(vo));
		return "getCheckList.jsp";
	}
}
