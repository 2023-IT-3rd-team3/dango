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
 * Task(�۾�)		URL(���)			Method		Parameter(�Ӽ�)	Form		URL�̵�
 * 
 * o�α���������		/user/userPage		get			��� �׸�			�Է�ȭ�� �ʿ�	�̵�(home)
 * o�α׾ƿ�			/user/logout		get			USER_PW						�̵�(home)
 * o�α���Ȯ��			/user/userinfo		post		
 * oȸ�����			/user/register		Post		��� �׸�			�Է�ȭ�� �ʿ�	�̵�(userPage)
 * oȸ����������		/user/usermodify	Post		��� �׸�			�Է�ȭ�� �ʿ�  �̵�(home)
 * o����ó��			/user/remove		Get			USER_ID			�Է�ȭ�� �ʿ�	�̵�(userPage)
 * ID ã��,PW ����	/user/findPage 		Get			USER_ID,USER_PW	�Է�ȭ�� �ʿ�	�̵�(findPage)
 */

@Controller
@RequestMapping("/user/*")
public class UserController {

	@Autowired
	private UserService userservice;
	
	//�α��� ������
	@GetMapping("/loginPage")
	public String gologinPage() {
		return "/user/login" ;
	}
	
	//�α��� Ȯ��
	@PostMapping("/userlogin")
	public String userlogin(String id,String pw,Model model,HttpServletRequest request) {
		UserVO user = userservice.login(id, pw);
		if(user == null) {
			model.addAttribute("message","������ �������� �ʽ��ϴ�");
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
	
	//ȸ������ ������
	@GetMapping("/register")
	public String register() {
		return "/user/signup" ;
	}
	
	//���ο� ȸ������ ����
	@GetMapping("/newregister")
	public String newregister(UserVO user,RedirectAttributes rttr) {
		userservice.register(user);
		rttr.addFlashAttribute("message","���� ���� �Ϸ�");
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
		//���� ���� ������ �����´�
		UserVO usercheck = (UserVO) session.getAttribute("userinfo");
		
		//usercheck�� ���� �� ���η� ���� �����.
		usercheck.setUsername(user.getUsername());
		usercheck.setUserphone(user.getUserphone());
		usercheck.setUseremail(user.getUseremail());
		System.out.println(usercheck.toString());
		
		if(userservice.update(usercheck)) {
			model.addAttribute("message","ȸ�� ���� ���� �Ϸ�");
		}
		
		return "/user/myPage";
	}
	
	@GetMapping("/regout")
	public String userregout(HttpSession session,RedirectAttributes rttr) {
		UserVO id = (UserVO) session.getAttribute("userinfo");
		
		if(userservice.remove(id.getUserid())) {
			rttr.addFlashAttribute("message","ȸ�� Ż�� �Ϸ�");
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
			rttr.addFlashAttribute("namecheck","���̵� ã�� ����");
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
			rttr.addFlashAttribute("idcheck","��й�ȣ ã�� ����");
		}
		
		return "redirect:/user/userfind";
	}
	
//	@GetMapping()
//	public void Test(HttpServletRequest request) {
//		HttpSession session = request.getSession();
//	}
}
