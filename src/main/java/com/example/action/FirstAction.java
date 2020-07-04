package com.example.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bean.LoginBean;
import com.example.model.TUser;
import com.example.service.LoginService;


@Controller
@RequestMapping("/")
public class FirstAction {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/login")
	public String index(@ModelAttribute(value="model") LoginBean loginBean,Model model){
		model.addAttribute("j_username", "");
		model.addAttribute("j_password","");
		return "login";
	}
	
	@RequestMapping("/allPage")
	public String mResponse(@ModelAttribute(value="model") LoginBean loginBean, Model model) {
		System.out.println(loginBean.getJ_username());
		System.out.println(loginBean.getJ_password());
		if(loginBean.getJ_username()==null){
			return "index.html";
		}
		if(loginBean.getJ_password()==null){
			return "index.html";
		}
		TUser user = new TUser();
		user.setLoginName(loginBean.getJ_username());
		user.setPassword(loginBean.getJ_password());
		loginBean = loginService.loginByPassword(user);
		model.addAttribute("j_username", loginBean.getJ_username());
		model.addAttribute("j_password", loginBean.getJ_password());
		model.addAttribute("login_msg", loginBean.getLogin_msg());
		model.addAttribute("login_status", loginBean.isLogin_status());
		if(loginBean.isLogin_status() == false) return "login";
		System.out.println(loginBean.getLogin_msg());
		return "myCommunity";
	}
	@RequestMapping("/index")
	public String defaultResponse() {
		return "index";
	}
}
