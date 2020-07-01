package com.appsys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appsys.pojo.BackendUser;
import com.appsys.service.BackendUserService;

@Controller
public class BackendUserLoginController {
	@Autowired private BackendUserService backendUserService;
	
	@RequestMapping("/backenduser_form")
	public String backendUserForm(){
		return "backend/be_login";
		
	}
	
	@RequestMapping("/backenduser_login")
	public String backendUserForm(BackendUser backendUser,HttpServletRequest request){
		if(backendUser.getUsercode()!=null && !backendUser.getUsercode().trim().equals("")
		&& backendUser.getUserpassword()!=null && !backendUser.getUserpassword().trim().equals("")){
			BackendUser backendUser2=backendUserService.login(backendUser);
			if(backendUser2!=null){
				HttpSession session=request.getSession();
				session.setAttribute("BE_USER",backendUser2);
				return "redirect:/backend/main";
			}
			
		}
		return "backend/be_login";
		
	}
}
