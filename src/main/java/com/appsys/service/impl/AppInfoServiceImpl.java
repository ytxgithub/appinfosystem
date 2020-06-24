package com.appsys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsys.mapper.AppInfoMapper;
import com.appsys.pojo.AppInfo;
import com.appsys.service.AppInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class AppInfoServiceImpl  implements AppInfoService{
	@Autowired private AppInfoMapper appInfoMapper;
	@Override
	public PageInfo<AppInfo> search(AppInfo appInfo, Integer pageIndex, Integer pageSize) {
		PageHelper.startPage(pageIndex, pageSize);
		PageInfo<AppInfo> pageInfo=new PageInfo<AppInfo>(appInfoMapper.search(appInfo));
		return pageInfo;
	}
	@Override
	public Integer save(AppInfo appInfo) {
		// TODO Auto-generated method stub
		return appInfoMapper.insertSelective(appInfo);
	}
	@Override
	public AppInfo findAppInfoById(Long id) {
		// TODO Auto-generated method stub
		return appInfoMapper.selectByPrimaryKey(id);
	}
	@Override
	public Integer modify(AppInfo appInfo) {
		// TODO Auto-generated method stub
		return appInfoMapper.updateByPrimaryKeySelective(appInfo);
	}
	
}
