package com.appsys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appsys.service.DevUserService;

@Controller
@RequestMapping("/dev")
public class DevUserController {
	@Autowired private DevUserService devUserService;
	
	/**
	 * 欢迎主界面
	 * @return
	 */
	@RequestMapping("/main")
	public String main(){
		return "dev/dev_main";
	}
	
	/**
	 *开发者app列表界面
	 * @return
	 */
	@RequestMapping("/list")
	public String list(){
		return "dev/dev_app_list";
	}
	
	/**
	 * 修改密码
	 * @param devid
	 * @param devpassword
	 * @param request
	 * @return
	 */
	@RequestMapping("/change_password")
	public String changePassword(Long devid,String devpassword,HttpServletRequest request){
		if(devpassword!=null && !devpassword.trim().equals("")
				&&devpassword.trim().length()>=6){
			devUserService.changePassword(devid, devpassword);
			HttpSession session=request.getSession();
			session.setAttribute("DEV_USER",null);
			session.invalidate();
			return "dev/dev_login";
		}
		return "redirect:/appinfo/applist";
		
	}
	
	@RequestMapping("/change_password_form")
	public String changePasswordForm(){
		return "dev/password";
		
	}
	
}
