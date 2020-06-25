package com.appsys.service;

import java.util.List;

import com.appsys.pojo.AppVersion;

public interface AppVersionService {
	/**
	 * 增加应用的版本
	 * @param appVersion
	 * @return
	 */
	int saveVersion(AppVersion appVersion);
	
	/**
	 * 根据app的id查出历史一共的版本列表
	 * @param appid
	 * @return
	 */
	List<AppVersion> findAppId(Long appid);
	
	/**
	 * 根据id查找app版本
	 * @param id
	 * @return
	 */
	AppVersion findById(Long id);
	
	/**
	 * 修改app版本
	 * @param appVersion
	 * @return
	 */
	int modifyVersion(AppVersion appVersion);
}
