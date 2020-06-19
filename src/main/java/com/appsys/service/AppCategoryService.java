package com.appsys.service;

import java.util.List;

import com.appsys.pojo.AppCategory;

public interface AppCategoryService {
	/**
	 * 查询一级分类
	 * @return
	 */
	 List<AppCategory> listCategorylevel1();
}
