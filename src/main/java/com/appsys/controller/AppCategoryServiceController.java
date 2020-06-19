package com.appsys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.appsys.pojo.AppCategory;
import com.appsys.service.AppCategoryService;

@Controller
@RequestMapping("/category")
public class AppCategoryServiceController {
	@Autowired private AppCategoryService appCategoryService;
	
	@RequestMapping("/l1")
	@ResponseBody
	public List<AppCategory> listCategorylevel1(){
		return appCategoryService.listCategorylevel1();
		
	}
}
