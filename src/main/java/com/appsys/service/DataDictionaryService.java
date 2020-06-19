package com.appsys.service;

import java.util.List;

import com.appsys.pojo.DataDictionary;

public interface DataDictionaryService {
	/**
	 * 查询所属平台
	 * @return
	 */
	List<DataDictionary> listFlatform();
}
