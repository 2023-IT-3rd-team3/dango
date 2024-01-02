package com.threeteam.dango.controller.check;

import java.util.List;

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

import com.threeteam.dango.domain.check.CheckVO;
import com.threeteam.dango.domain.user.UserVO;
import com.threeteam.dango.service.check.CheckService;

@Controller
@RequestMapping("/check/*")
public class CheckController {

	@Autowired
	private CheckService checkService;
	
	@ResponseBody
	@PostMapping(value="/toggleCheck", consumes = "application/json")
	public boolean checkWord(@RequestBody Long wordId, HttpServletRequest request, Model model) {
		
		HttpSession session = request.getSession();
		UserVO userVO = (UserVO)session.getAttribute("user");
		
		CheckVO vo = new CheckVO();
		vo.setUserId(userVO.getUserid());
		vo.setWordId(wordId);
		
		boolean isChecked = checkService.isCheck(vo);
		
		return isChecked;
	}
<<<<<<< HEAD
	
	@GetMapping(value="/getCheckList")
	public String getCheckList(HttpServletRequest request, Model model) {
		System.out.println("check 목록 보기 처리");
	@GetMapping(value="/getCheck", consumes = "application/json;")
	public String getCheck(@RequestBody CheckVO vo, HttpServletRequest request, Model model) {
		System.out.println("check �긽�꽭 蹂닿린 泥섎━");
		model.addAttribute("check", checkService.getCheck(vo));
		return "getCheck.jsp";
	}
	
	@GetMapping(value="/getCheckList", consumes = "application/json;")
	public String getCheckList(@RequestBody WordVO wordVO, HttpServletRequest request, Model model) {
		System.out.println("check 紐⑸줉 蹂닿린 泥섎━");
=======

	@GetMapping(value="/getCheckList")
	public String getCheckList(HttpServletRequest request, Model model) {
		System.out.println("check 목록 보기 처리");

>>>>>>> 16bc88c6cb3c97a693c59e9c38d3ec1429c3554d
		HttpSession session = request.getSession();
		UserVO userVO = (UserVO)session.getAttribute("user");

		model.addAttribute("checkList", checkService.getCheckList(userVO));
		return "check/getCheckList";
	}
}
