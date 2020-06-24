package com.appsys.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.appsys.pojo.AppInfo;
import com.appsys.pojo.AppVersion;
import com.appsys.service.AppInfoService;
import com.appsys.service.AppVersionService;

@Controller
@RequestMapping("/appversion")
public class AppVersionController {
	@Autowired private AppVersionService appVersionService;
	@Autowired private AppInfoService appInfoService;
	@RequestMapping("/newversion_form")
	public String newVersionForm(@ModelAttribute("appVersion") AppVersion appVersion,Long appid,
			Model model){
		appVersion.setAppid(appid);
		model.addAttribute("appVersion", appVersion);
		return "dev/dev_version";
	}
	
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
		appVersionService.saveVersion(appVersion);
		AppInfo appInfo=appInfoService.findAppInfoById(appVersion.getAppid());
		//之所以能获取id 有主键回填
		appInfo.setVersionid(appVersion.getId());
		appInfoService.modify(appInfo);
		return "redirect:/appinfo/applist";
	}
}