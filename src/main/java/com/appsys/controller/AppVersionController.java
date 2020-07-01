package com.appsys.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.appsys.pojo.AppInfo;
import com.appsys.pojo.AppVersion;
import com.appsys.pojo.DevUser;
import com.appsys.service.AppInfoService;
import com.appsys.service.AppVersionService;

@Controller
@RequestMapping("/appversion")
public class AppVersionController {
	@Autowired private AppVersionService appVersionService;
	@Autowired private AppInfoService appInfoService;
	
	/**
	 * 跳转到新增加版本列表 并显示版本列表
	 * @param appVersion
	 * @param appid
	 * @param model
	 * @return
	 */
	@RequestMapping("/newversion_form")
	public String newVersionForm(@ModelAttribute("appVersion") AppVersion appVersion,Long appid,
			Model model){
		appVersion.setAppid(appid);
		List<AppVersion> versionList=appVersionService.findAppId(appid);
		model.addAttribute("appInfo",appInfoService.findAppInfoById(appid));
		model.addAttribute("versionList", versionList);
		model.addAttribute("appVersion", appVersion);
		return "dev/dev_version";
	}
	
	/**
	 * 添加新的版本 并把新的版本号 显示在app列表上
	 * @param appVersion
	 * @param file
	 * @param request
	 * @return
	 */
	@RequestMapping("/newversion")
	public String newVersion(AppVersion appVersion, MultipartFile file, HttpServletRequest request) {
		String newFileName = "";
		String savePathFile = "";
		if (file != null && !file.isEmpty()) {
			/* 把文件上传到哪里 */
			String targetFolder = request.getServletContext().getRealPath("/uploads");
			/* 上传文件的新名字的前缀 */
			String prefixFileName = String.valueOf(System.currentTimeMillis());
			// 上传文件的扩展名
			String extName = file.getOriginalFilename().split("\\.")[file.getOriginalFilename().split("\\.").length
					- 1];
			/* 上传文件的新名字 */
			newFileName = prefixFileName + "." + extName;
			/* 保存到哪里 */
			savePathFile = targetFolder + File.separator + newFileName;
			try {
				file.transferTo(new File(savePathFile));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (!newFileName.equals("") && !savePathFile.equals("")) {
			appVersion.setApklocpath(savePathFile);
			appVersion.setApkfilename(newFileName);
		}
		appVersion.setPublishstatus(3L);
		
		DevUser devUser=(DevUser) request.getSession().getAttribute("DEV_USER");
		appVersion.setCreatedby(devUser.getId());
		appVersion.setCreationdate(new Date());
		appVersion.setModifyby(devUser.getId());
		appVersion.setModifydate(new Date());
		
		appVersionService.saveVersion(appVersion);
		//增加版本后，将最新版本关联到应用
		AppInfo appInfo=appInfoService.findAppInfoById(appVersion.getAppid());
		//之所以能获取id 有主键回填
		appInfo.setVersionid(appVersion.getId());
		appInfoService.modify(appInfo);
		//增加新版本 应用状态修改为待审核
		appInfoService.audit(appInfo.getId());
		return "redirect:/appinfo/applist";
	}
	
	/**
	 * 跳转到修改app版本界面
	 * @return
	 */
	@RequestMapping("/modify_form")
	public String modifyForm(@ModelAttribute("appVersion") AppVersion appVersion,Long appid,Model model){
		/*根据id查询app*/
		AppInfo appInfo=appInfoService.findAppInfoById(appid);
		/*根据app的版本id查询最新版本*/
		appVersion=appVersionService.findById(appInfo.getVersionid());
		/*版本列表*/
		List<AppVersion> versionList=appVersionService.findAppId(appid);
		model.addAttribute("versionList", versionList);
		model.addAttribute("appVersion", appVersion);
		model.addAttribute("appInfo", appInfo);
		return "dev/dev_modify_version";
	}
	
	/**
	 * 修改app版本信息
	 * @param appVersion
	 * @param file
	 * @return
	 */
	@RequestMapping("/modifyversion")
	public String modifyVersion(AppVersion appVersion,MultipartFile file,HttpServletRequest request){
		String newFileName = "";
		String savePathFile = "";
		if (file != null && !file.isEmpty()) {
			/* 把文件上传到哪里 */
			String targetFolder = request.getServletContext().getRealPath("/uploads");
			/* 上传文件的新名字的前缀 */
			String prefixFileName = String.valueOf(System.currentTimeMillis());
			// 上传文件的扩展名
			String extName = file.getOriginalFilename().split("\\.")[file.getOriginalFilename().split("\\.").length
					- 1];
			/* 上传文件的新名字 */
			newFileName = prefixFileName + "." + extName;
			/* 保存到哪里 */
			savePathFile = targetFolder + File.separator + newFileName;
			try {
				file.transferTo(new File(savePathFile));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (!newFileName.equals("") && !savePathFile.equals("")) {
			appVersion.setApklocpath(savePathFile);
			appVersion.setApkfilename(newFileName);
		}
		DevUser devUser=(DevUser) request.getSession().getAttribute("DEV_USER");
		appVersion.setModifyby(devUser.getId());
		appVersion.setModifydate(new Date());
		appVersionService.modifyVersion(appVersion);
		
		//修改最新版本 应用状态修改为待审核
		appInfoService.audit(appVersion.getAppid());
		return "redirect:/appinfo/applist";
		
	}
	
}