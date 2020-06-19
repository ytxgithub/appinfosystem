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
	
	/**
	 * 获取一级分类
	 * @return
	 */
	@RequestMapping("/l1")
	@ResponseBody
	public List<AppCategory> listCategorylevel1(){
		return appCategoryService.listCategorylevel1();
		
	}
	
	/**
	 * 获取二级分类
	 * @return
	 */
	@RequestMapping("/l2")
	@ResponseBody
	public List<AppCategory> listCategorylevel2(Integer parentId){
		List<AppCategory> lists = null;
		if(parentId!=0){
			lists=appCategoryService.listCategorylevel2(parentId);
		}
		return lists;
		
	}
	
	/**
	 * 获取三级分类
	 * @return
	 */
	@RequestMapping("/l3")
	@ResponseBody
	public List<AppCategory> listCategorylevel3(Integer parentId){
		List<AppCategory> lists = null;
		if(parentId!=0){
			lists=appCategoryService.listCategorylevel3(parentId);
		}
		return lists;
		
	}
}
