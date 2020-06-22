package com.appsys.service;

import com.appsys.pojo.AppInfo;
import com.github.pagehelper.PageInfo;

public interface AppInfoService {
	/**
	 *	搜索产品
	 * @param appInfo
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	PageInfo<AppInfo> search(AppInfo appInfo,Integer pageIndex,Integer pageSize);
}
