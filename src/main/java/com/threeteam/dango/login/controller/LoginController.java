package com.threeteam.dango.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.threeteam.dango.login.domain.vo.LoginVO;
import com.threeteam.dango.login.service.LoginService;



/*
 * Task(작업)		URL(경로)		Method		Parameter(속성)	Form		URL이동
 * 
 * o로그인페이지		/login/loginPage	get			모든 항목			입력화면 필요	이동(home)
 * o로그아웃			/login/logout		get			USER_PW						이동(home)
 * o로그인확인			/login/home			post		
 * o회원등록			/login/register		Post		모든 항목			입력화면 필요	이동(loginPage)
 * o회원정보수정		/login/usermodify	Post		모든 항목			입력화면 필요  이동(home)
 * o삭제처리			/login/remove		Get			USER_ID			입력화면 필요	이동(loginPage)
 * oID 찾기,PW 수정	/login/findPage 	Get			USER_ID,USER_PW	입력화면 필요	이동(findPage)
 */

@restController
@RequestMapping("/login/*")
public class LoginController {

	@Autowired
	LoginService loginService;
	
	//로그인 페이지
	@GetMapping("/loginPage")
	public String loginPage() {
		return "/login/loginPage" ;
	}
	
	
	//로그인 확인
	//파라미터 id, 파라미터 pw 를 전달 받아 loginService.loginCheck()메서드 에게 전달한다.
	@PostMapping("/loginCheck")
	public String loginCheck(Model model ,String id, String pw,HttpSession session,RedirectAttributes rttr) {
		LoginVO userCheck = new LoginVO();
		userCheck.setUserid(id);
		userCheck.setUserpw(pw);
		LoginVO user = loginService.loginCheck(userCheck, session);
		
		if(session.getAttribute("userVO") == null) {
			rttr.addFlashAttribute("message","없는 아이디 입니다.");
			return "redirect:/login/loginPage";
		}
			model.addAttribute("user", user);
		
		return "/login/home";
	}
	
	//로그아웃
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		loginService.logOut(session);
		return "/login/loginPage";
	}
	
	//회원가입
	@GetMapping("/register")
	public String register() {
		return "/login/register";
	}
	
	@GetMapping("/registerCheck")
	public String registerCheck(LoginVO login,Model model) {
		loginService.register(login);
		
		model.addAttribute("message","회원가입 완료");
		return "/login/loginPage";
	}
	
	//회원탈퇴
	@GetMapping("/regout")
	public String regout(String id,Model model) {
		loginService.remove(id);

		model.addAttribute("message","회원탈퇴 완료");
		return "/login/loginPage";
	}
	//회원정보수정
	//현재 아이디 값을 가져와서 회원 전체 정보를 출력
	@GetMapping("/usermodify")
	public String usermodify(String id,Model model) {
		
		LoginVO user = loginService.infoload(id);
		
		model.addAttribute("user",user);
		return "/login/usermodify";
	}
	
	//수정한 정보를 보내서 업데이트
	@PostMapping("/usermodify")
	public String usermodify(LoginVO user,Model model) {
		loginService.usermodify(user);
		model.addAttribute("user",user);
		return "/login/home";
	}
	
	//아이디,비밀번호 찾기
	
	@GetMapping("/findPage")
	public String findPage() {
		return "/login/findPage";
	}
	
	@GetMapping({"/findID","/findPW"})
	public String findUserId(String name,String id,Model model) {
		if(name != null) {
			String username = loginService.FindID(name);
			if(username == null) {
				model.addAttribute("namecheck", "해당 이름은 등록되어었지않습니다");
				return "/login/findPage";
			}
			model.addAttribute("name",username);
			return "/login/findPage";
		}
		if(id != null) {
			String userid = loginService.FindPW(id);
			if(userid == null) {
				model.addAttribute("idcheck", "해당 아이디는 등록되어었지않습니다");
				return "/login/findPage";
			}
			model.addAttribute("id",userid);
			return "/login/findPage";
		}
		return "/login/findPage";
	}
}
