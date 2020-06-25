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
	
	/**
	 * app产品增加
	 * @param appInfo
	 * @return
	 */
	Integer save(AppInfo appInfo);
	
	/**
	 * 修改 要先查询出来单个app信息
	 * @param id
	 * @return
	 */
	AppInfo findAppInfoById(Long id);
	
	/**
	 * 修改app信息
	 * @param appInfo
	 * @return
	 */
	Integer modify(AppInfo appInfo);
	
	/**
	 * 根据id查找应用 显示文字一二三级分类
	 * @param id
	 * @return
	 */
	AppInfo selectByPrimaryKey1(Long id);
}
