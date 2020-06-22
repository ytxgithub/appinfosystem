package com.appsys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appsys.pojo.DevUser;
import com.appsys.service.DevUserService;

@Controller
public class DevUserLoginController {
	@Autowired private DevUserService devUserService;
	
	/*跳转到登录界面*/
	@RequestMapping("/dev_login_form")
	public String devLoginForm(){
		return "dev/dev_login";
	}
	
	
	/**
	 * 开发者登录 登录成功放入session中
	 * @param devUser
	 * @param request
	 * @return
	 */
	@RequestMapping("/dev_login")
	public String login(DevUser devUser,HttpServletRequest request){
		if(devUser.getDevcode()!=null&&!devUser.getDevcode().trim().equals("")&&devUser.getDevpassword()!=null&&!devUser.getDevpassword().trim().equals("")){
			DevUser devUser2=devUserService.login(devUser);
			if(devUser2!=null){
				HttpSession session=request.getSession();
				session.setAttribute("DEV_USER",devUser2);
				return "dev/dev_main";
			}
			
		}
		
		return "dev/dev_login";
	}
	
	/**
	 * 用户注销
	 * @param request
	 * @return
	 */
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request){
		HttpSession session=request.getSession();
		if(session.getAttribute("DEV_USER")!=null){
			session.setAttribute("DEV_USER",null);
			session.invalidate();
		}
		return "dev/dev_login";
	}
}
