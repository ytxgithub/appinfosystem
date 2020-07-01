package com.appsys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.appsys.pojo.AppInfo;
import com.appsys.pojo.AppVersion;
import com.appsys.service.AppInfoService;
import com.appsys.service.AppVersionService;
import com.appsys.service.BackendUserService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/backend")
public class BackendUserController {
	@Autowired 
	private BackendUserService backendService;
	@Autowired 
	private AppInfoService appInfoService;
	@Autowired
	private AppVersionService appVersionService;
	
	@RequestMapping("/main")
	public String main(){
		return "backend/be_main";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request){
		HttpSession session=request.getSession();
		if(session.getAttribute("BE_USER")!=null){
			session.setAttribute("BE_USER",null);
			session.invalidate();
		}
		return "redirect:/backenduser_form";
		
	}
	
	@RequestMapping("/backendlist")
	public String backendlist(){
		return "backend/be_list";
	}
	
	@RequestMapping("/list")
	public ModelAndView applist(@RequestParam(required = false, defaultValue = "1") Integer pageIndex,
			@RequestParam(required = false, defaultValue = "6") Integer pageSize, AppInfo appInfo,
			HttpServletRequest request) {
		// 页面传过来小于一 就是第一页
		if (pageIndex < 1) {
			pageIndex = 1;
		}
		appInfo.setDevid(0L);
		PageInfo<AppInfo> pageInfo = appInfoService.search(appInfo, pageIndex, pageSize);
		ModelAndView model = new ModelAndView("backend/be_list");
		// 分页后的集合
		model.addObject("appInfoList", pageInfo.getList());
		model.addObject("pageCount", pageInfo.getPages());
		// 带回参数
		model.addObject("appinfo", appInfo);
		model.addObject("par", "&" + request.getQueryString());
		return model;
	}
	
	@RequestMapping("/audit_form")
	public String auditForm(Long appid,Model model){
		AppInfo appInfo=appInfoService.selectByPrimaryKey1(appid);
		AppVersion appVersion=appVersionService.findById2(appInfo.getVersionid());
		model.addAttribute("appVersion", appVersion);
		model.addAttribute("appInfo",appInfo);
		return "backend/be_audit_form";
		
	}
	
	
	//审核通过或未通过
	@RequestMapping("/audit")
	public String audit(Long appid,Boolean pass){
		if(pass){
			appInfoService.pass(appid);
		}else{
			appInfoService.nopass(appid);
		}
		return "redirect:/backend/list";
	}
	
	
	@RequestMapping("/backendlistsearch")
	public ModelAndView applist1(@RequestParam(required=false,defaultValue="1")Integer pageIndex,
								@RequestParam(required=false,defaultValue="6")Integer pageSize,
								AppInfo appInfo,HttpServletRequest request){
		//页面传过来小于一  就是第一页
		if(pageIndex<1){
			pageIndex=1;
		}
		
		appInfo.setDevid(0L);
		PageInfo<AppInfo> pageInfo=appInfoService.search(appInfo, pageIndex, pageSize);
		ModelAndView model=new ModelAndView("backend/be_list");
		//分页后的集合
		model.addObject("appInfoList", pageInfo.getList());
		model.addObject("pageCount", pageInfo.getPages());
		//带回参数
		model.addObject("appinfo", appInfo);
		model.addObject("par","&"+request.getQueryString());
		return model;
	}
	
	
}
