package com.appsys.service;

import java.util.List;

import com.appsys.pojo.DataDictionary;

public interface DataDictionaryService {
	/**
	 * 查询所属平台
	 * @return
	 */
	List<DataDictionary> listFlatform();
	
	/**
	 * 可用状态
	 * @return
	 */
	List<DataDictionary> listAppStatus();
	
	/**
	 * 查询所有可用发布状态
	 * @return
	 */
	List<DataDictionary> listPublishstatus();
}
