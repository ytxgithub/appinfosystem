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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.appsys.pojo.AppInfo;
import com.appsys.pojo.AppVersion;
import com.appsys.pojo.DevUser;
import com.appsys.service.AppInfoService;
import com.appsys.service.AppVersionService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/appinfo")
public class AppInfoController {
	@Autowired private AppInfoService appInfoService;
	@Autowired private AppVersionService appVersionService;
	@RequestMapping("/applist")
	public ModelAndView applist(@RequestParam(required=false,defaultValue="1")Integer pageIndex,
								@RequestParam(required=false,defaultValue="6")Integer pageSize,
								AppInfo appInfo,HttpServletRequest request){
		//页面传过来小于一  就是第一页
		if(pageIndex<1){
			pageIndex=1;
		}
		//session中取出登录的id  查询所登录用户下的app产品
		HttpSession session=request.getSession();
		DevUser devUser = (DevUser) session.getAttribute("DEV_USER");
		appInfo.setDevid(devUser.getId());
		PageInfo<AppInfo> pageInfo=appInfoService.search(appInfo, pageIndex, pageSize);
		ModelAndView model=new ModelAndView("dev/dev_app_list");
		//分页后的集合
		model.addObject("appInfoList", pageInfo.getList());
		model.addObject("pageCount", pageInfo.getPages());
		//带回参数
		model.addObject("appinfo", appInfo);
		model.addObject("par","&"+request.getQueryString());
		return model;
	}
	
	/*跳转到增加app界面*/
	@RequestMapping("/appnew_form")
	public String appnNewForm(@ModelAttribute("appInfo") AppInfo appInfo){
		return "dev/dev_new";
	}
	
	/*app添加*/
	@RequestMapping("/newapp")
	public String newapp(AppInfo appInfo,HttpServletRequest request,MultipartFile file){
		String newFileName="";
		String savePathFile="";
		if(file!=null&&!file.isEmpty()){
			/*把文件上传到哪里*/
			String targetFolder=request.getServletContext().getRealPath("/uploads");
			/*上传文件的新名字的前缀*/
			String prefixFileName=String.valueOf(System.currentTimeMillis());
			//上传文件的扩展名
			String extName=file.getOriginalFilename().split("\\.")
					[file.getOriginalFilename().split("\\.").length-1];
			/*上传文件的新名字*/
			newFileName=prefixFileName+"."+extName;
			/*保存到哪里*/
			savePathFile=targetFolder+File.separator+newFileName;
			try {
				file.transferTo(new File(savePathFile));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(!newFileName.equals("")&&!savePathFile.equals("")){
				appInfo.setLogolocpath(savePathFile);
				appInfo.setLogopicpath(newFileName);
			}
			DevUser devUser=(DevUser) request.getSession().getAttribute("DEV_USER");
			appInfo.setDevid(devUser.getId());
			appInfo.setStatus(1L);
			appInfo.setDownloads(0L);
			appInfo.setCreatedby(devUser.getId());
			appInfo.setCreationdate(new Date());
			appInfoService.save(appInfo);
		}
		return "redirect:/appinfo/applist";
	}
	
	/*查询出一个app 跳转到修改界面*/
	@RequestMapping("/updateapp_form")
	public ModelAndView updateAppForm(@ModelAttribute("appInfo") AppInfo appInfo,Long appid){
		ModelAndView mView=new ModelAndView("dev/dev_modify");
		appInfo=appInfoService.findAppInfoById(appid);
		mView.addObject("appInfo",appInfo);
		return mView;
	}
	
	/**
	 * 修改app信息
	 * @return
	 */
	@RequestMapping("/updateappinfo")
	public String updateAppInfo(AppInfo appInfo,Model model,MultipartFile file,HttpServletRequest request){
		String newFileName="";
		String savePathFile="";
		if(file!=null&&!file.isEmpty()){
			/*把文件上传到哪里*/
			String targetFolder=request.getServletContext().getRealPath("/uploads");
			/*上传文件的新名字的前缀*/
			String prefixFileName=String.valueOf(System.currentTimeMillis());
			//上传文件的扩展名
			String extName=file.getOriginalFilename().split("\\.")
					[file.getOriginalFilename().split("\\.").length-1];
			/*上传文件的新名字*/
			newFileName=prefixFileName+"."+extName;
			/*保存到哪里*/
			savePathFile=targetFolder+File.separator+newFileName;
			try {
				file.transferTo(new File(savePathFile));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(!newFileName.equals("")&&!savePathFile.equals("")){
				appInfo.setLogolocpath(savePathFile);
				appInfo.setLogopicpath(newFileName);
			}
			DevUser devUser=(DevUser) request.getSession().getAttribute("DEV_USER");
			appInfoService.modify(appInfo);
			appInfo.setModifyby(devUser.getId());
			appInfo.setModifydate(new Date());
		}
		return "redirect:/appinfo/applist";
	}
	
	/**
	 * 查询app信息  并显示版本列表
	 * @param appid
	 * @param model
	 * @return
	 */
	@RequestMapping("/showappinfo")
	public String showAppInfo(Long appid,Model model ){
		System.out.println("------------------------------------");
		AppInfo appInfo=appInfoService.selectByPrimaryKey1(appid);
		List<AppVersion> versionList=appVersionService.findAppId(appid);
		for (AppVersion appVersion : versionList) {
			System.out.println(appVersion.getPublishstatusName()+"---------------------");
		}
		model.addAttribute("appInfo",appInfo);
		model.addAttribute("versionList", versionList);
		return "dev/dev_app_one";
	
	}
	
	/**
	 * 删除应用  也删除对应的版本 删除应用的上传的apk文件  还有版本的文件
	 * @param appid
	 * @return
	 */
	@RequestMapping("/delete")
	public String delete(Long appid,HttpServletRequest request){
		String folder=request.getServletContext().getRealPath("/uploads");
		AppInfo appInfo=appInfoService.findAppInfoById(appid);
		String fileName=appInfo.getLogopicpath();
		String path=folder+File.separator+fileName;
		File file=new File(path);
		if(file.exists()){
			file.delete();
		}
		List<AppVersion> appVersions=appVersionService.findAppId(appid);
		for (AppVersion appVersion : appVersions) {
			String apkFileName=appVersion.getApkfilename();
			String apkPath=folder+File.separator+apkFileName;
			File apkFile=new File(apkPath);
			if(apkFile.exists()){
				apkFile.delete();
			}
		}
		appInfoService.deleteById(appid);
		return "redirect:/appinfo/applist";
	}
	
	/**
	 * 应用的上架
	 * @param appid
	 * @return
	 */
	@RequestMapping("/on_sale")
	public String onSale(Long appid){
		appInfoService.onSale(appid);
		return "redirect:/appinfo/applist";
	}
	
	/**
	 * 应用的下架
	 * @param appid
	 * @return
	 */
	@RequestMapping("/off_sale")
	public String offSale(Long appid){
		appInfoService.offSale(appid);
		return "redirect:/appinfo/applist";
	}
	
}
