package com.threeteam.dango.controller.login;

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

import com.threeteam.dango.domain.login.LoginVO;
import com.threeteam.dango.service.login.LoginService;



/*
 * Task(�۾�)		URL(���)		Method		Parameter(�Ӽ�)	Form		URL�̵�
 * 
 * o�α���������		/login/loginPage	get			��� �׸�			�Է�ȭ�� �ʿ�	�̵�(home)
 * o�α׾ƿ�				/login/logout		get			USER_PW						�̵�(home)
 * o�α���Ȯ��			/login/home			post		
 * oȸ�����			/login/register		Post		��� �׸�			�Է�ȭ�� �ʿ�	�̵�(loginPage)
 * oȸ����������		/login/usermodify	Post		��� �׸�			�Է�ȭ�� �ʿ�  �̵�(home)
 * o����ó��			/login/remove		Get			USER_ID			�Է�ȭ�� �ʿ�	�̵�(loginPage)
 * oID ã��,PW ����	/login/findPage 	Get			USER_ID,USER_PW	�Է�ȭ�� �ʿ�	�̵�(findPage)
 */

@restController
@RequestMapping("/login/*")
public class LoginController {

	@Autowired
	LoginService loginService;
	
	//�α��� ������
	@GetMapping("/loginPage")
	public String loginPage() {
		return "/login/loginPage" ;
	}
	
	
	//�α��� Ȯ��
	//�Ķ���� id, �Ķ���� pw �� ���� �޾� loginService.loginCheck()�޼��� ���� �����Ѵ�.
	@PostMapping("/loginCheck")
	public String loginCheck(Model model ,String id, String pw,HttpSession session,RedirectAttributes rttr) {
		LoginVO userCheck = new LoginVO();
		userCheck.setUserid(id);
		userCheck.setUserpw(pw);
		LoginVO user = loginService.loginCheck(userCheck, session);
		
		if(session.getAttribute("userVO") == null) {
			rttr.addFlashAttribute("message","���� ���̵� �Դϴ�.");
			return "redirect:/login/loginPage";
		}
			model.addAttribute("user", user);
		
		return "/login/home";
	}
	
	//�α׾ƿ�
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		loginService.logOut(session);
		return "/login/loginPage";
	}
	
	//ȸ������
	@GetMapping("/register")
	public String register() {
		return "/login/register";
	}
	
	@GetMapping("/registerCheck")
	public String registerCheck(LoginVO login,Model model) {
		loginService.register(login);
		
		model.addAttribute("message","ȸ������ �Ϸ�");
		return "/login/loginPage";
	}
	
	//ȸ��Ż��
	@GetMapping("/regout")
	public String regout(String id,Model model) {
		loginService.remove(id);

		model.addAttribute("message","ȸ��Ż�� �Ϸ�");
		return "/login/loginPage";
	}
	//ȸ����������
	//���� ���̵� ���� �����ͼ� ȸ�� ��ü ������ ���
	@GetMapping("/usermodify")
	public String usermodify(String id,Model model) {
		
		LoginVO user = loginService.infoload(id);
		
		model.addAttribute("user",user);
		return "/login/usermodify";
	}
	
	//������ ������ ������ ������Ʈ
	@PostMapping("/usermodify")
	public String usermodify(LoginVO user,Model model) {
		loginService.usermodify(user);
		model.addAttribute("user",user);
		return "/login/home";
	}
	
	//���̵�,��й�ȣ ã��
	
	@GetMapping("/findPage")
	public String findPage() {
		return "/login/findPage";
	}
	
	@GetMapping({"/findID","/findPW"})
	public String findUserId(String name,String id,Model model) {
		if(name != null) {
			String username = loginService.FindID(name);
			if(username == null) {
				model.addAttribute("namecheck", "�ش� �̸��� ��ϵǾ�����ʽ��ϴ�");
				return "/login/findPage";
			}
			model.addAttribute("name",username);
			return "/login/findPage";
		}
		if(id != null) {
			String userid = loginService.FindPW(id);
			if(userid == null) {
				model.addAttribute("idcheck", "�ش� ���̵�� ��ϵǾ�����ʽ��ϴ�");
				return "/login/findPage";
			}
			model.addAttribute("id",userid);
			return "/login/findPage";
		}
		return "/login/findPage";
	}
}
