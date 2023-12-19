package com.threeteam.dango.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.threeteam.dango.domain.user.UserVO;
import com.threeteam.dango.service.user.UserService;

import lombok.extern.log4j.Log4j;

/*
 * Task(작업)		URL(경로)			Method		Parameter(속성)	Form		URL이동
 * 
 * o로그인페이지		/user/userPage		get			모든 항목			입력화면 필요	이동(home)
 * o로그아웃			/user/logout		get			USER_PW						이동(home)
 * o로그인확인			/user/userinfo		post		
 * o회원등록			/user/register		Post		모든 항목			입력화면 필요	이동(userPage)
 * o회원정보수정		/user/usermodify	Post		모든 항목			입력화면 필요  이동(home)
 * o삭제처리			/user/remove		Get			USER_ID			입력화면 필요	이동(userPage)
 * ID 찾기,PW 수정	/user/findPage 		Get			USER_ID,USER_PW	입력화면 필요	이동(findPage)
 */

@Controller
@RequestMapping("/user/*")
public class UserController {

	@Autowired
	private UserService userservice;
	
	//로그인 페이지
	@GetMapping("/loginPage")
	public String gologinPage() {
		return "/user/login" ;
	}
	
	//로그인 확인
	@PostMapping("/userlogin")
	public String userlogin(String id,String pw,Model model,HttpServletRequest request) {
		UserVO user = userservice.login(id, pw);
		if(user == null) {
			model.addAttribute("message","계정이 존재하지 않습니다");
		}
		//model.addAttribute("userinfo",user);
		HttpSession session = request.getSession();
		session.setAttribute("userinfo",user);
		
		return "/user/myPage" ;
	}
	
	@GetMapping("/userlogout")
	public String userlogout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		
		return "redirect:/user/loginPage" ;
	}
	
	//회원가입 페이지
	@GetMapping("/register")
	public String register() {
		return "/user/signup" ;
	}
	
	//새로운 회원정보 생성
	@GetMapping("/newregister")
	public String newregister(UserVO user,RedirectAttributes rttr) {
		userservice.register(user);
		rttr.addFlashAttribute("message","계정 생성 완료");
		return "redirect:/user/loginPage";
	}
	
	@GetMapping("/modify")
	public String updatepage(HttpSession session,Model model) {
		UserVO user = (UserVO) session.getAttribute("userset");
		model.addAttribute("userinfo",user);
		
		return "/user/usermodify";
	}
	
	@PostMapping("/infomodify")
	public String infomodify(UserVO user,HttpSession session,Model model) {
		//현재 유저 정보를 가져온다
		UserVO usercheck = (UserVO) session.getAttribute("userinfo");
		
		//usercheck에 수정 한 정로로 덮어 쒸운다.
		usercheck.setUsername(user.getUsername());
		usercheck.setUserphone(user.getUserphone());
		usercheck.setUseremail(user.getUseremail());
		System.out.println(usercheck.toString());
		
		if(userservice.update(usercheck)) {
			model.addAttribute("message","회원 정보 수정 완료");
		}
		
		return "/user/myPage";
	}
	
	@GetMapping("/regout")
	public String userregout(HttpSession session,RedirectAttributes rttr) {
		UserVO id = (UserVO) session.getAttribute("userinfo");
		
		if(userservice.remove(id.getUserid())) {
			rttr.addFlashAttribute("message","회원 탈퇴 완료");
		}
		
		return "redirect:/user/loginPage" ;
	}
	
	@GetMapping("/userfind")
	public String findPage() {
		return "/user/findPage" ;
	}
	
	@GetMapping("/findID")
	public String findid(String name,String phone,Model model,RedirectAttributes rttr) {
		UserVO userinfo = new UserVO();
		userinfo.setUsername(name);
		userinfo.setUserphone(phone);
		if(userservice.findid(userinfo) != null) {
			System.out.println(userservice.findid(userinfo));
			rttr.addFlashAttribute("id",userservice.findid(userinfo));
		}
		else {
			rttr.addFlashAttribute("namecheck","아이디 찾기 실패");
		}
		
		
		return "redirect:/user/userfind";
	}
	@GetMapping("/findPW")
	public String findpw(String id,String phone,RedirectAttributes rttr) {
		UserVO userinfo = new UserVO();
		userinfo.setUserid(id);
		userinfo.setUserphone(phone);
		if(userservice.findpw(userinfo) != null) {
			System.out.println(userservice.findpw(userinfo));
			rttr.addFlashAttribute("pw",userservice.findpw(userinfo));
		}
		else {
			rttr.addFlashAttribute("idcheck","비밀번호 찾기 실패");
		}
		
		return "redirect:/user/userfind";
	}
	
//	@GetMapping()
//	public void Test(HttpServletRequest request) {
//		HttpSession session = request.getSession();
//	}
}
