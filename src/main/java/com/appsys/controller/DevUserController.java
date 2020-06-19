package com.appsys.controller;

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
	
}
