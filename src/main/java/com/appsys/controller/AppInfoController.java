package com.appsys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.appsys.pojo.AppInfo;
import com.appsys.pojo.DevUser;
import com.appsys.service.AppInfoService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/appinfo")
public class AppInfoController {
	@Autowired private AppInfoService appInfoService;
	@RequestMapping("/applist")
	public ModelAndView applist(@RequestParam(required=false,defaultValue="1")Integer pageIndex,
								@RequestParam(required=false,defaultValue="6")Integer pageSize,
								AppInfo appInfo,HttpServletRequest request){
		HttpSession session=request.getSession();
		DevUser devUser = (DevUser) session.getAttribute("DEV_USER");
		appInfo.setDevid(devUser.getId());
		PageInfo<AppInfo> pageInfo=appInfoService.search(appInfo, pageIndex, pageSize);
		ModelAndView model=new ModelAndView("dev/dev_app_list");
		model.addObject("appInfoList", pageInfo.getList());
		model.addObject("pageCount", pageInfo.getPages());
		return model;
	}
}
