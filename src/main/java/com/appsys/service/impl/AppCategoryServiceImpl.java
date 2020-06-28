package com.appsys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.appsys.mapper.AppCategoryMapper;
import com.appsys.pojo.AppCategory;
import com.appsys.service.AppCategoryService;

@Service
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public class AppCategoryServiceImpl implements AppCategoryService {
	@Autowired private AppCategoryMapper appCategoryMapper;
	@Override
	public List<AppCategory> listCategorylevel1() {
		// TODO Auto-generated method stub
		return appCategoryMapper.listCategorylevel1();
	}
	@Override
	public List<AppCategory> listCategorylevel2(Integer parentId) {
		// TODO Auto-generated method stub
		return appCategoryMapper.listCategorylevel2(parentId);
	}
	@Override
	public List<AppCategory> listCategorylevel3(Integer parentId) {
		// TODO Auto-generated method stub
		return appCategoryMapper.listCategorylevel3(parentId);
	}

	
	
}
