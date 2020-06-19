package com.appsys.service;

import java.util.List;

import com.appsys.pojo.AppCategory;

public interface AppCategoryService {
	/**
	 * 查询一级分类
	 * @return
	 */
	 List<AppCategory> listCategorylevel1();
	 /**
	  * 查询二级分类
	  * @param parentId
	  * @return
	  */
	 List<AppCategory> listCategorylevel2(Integer parentId);
	 
	 /**
	  * 三级分类
	  * @param parentId
	  * @return
	  */
	 List<AppCategory> listCategorylevel3(Integer parentId);
}
