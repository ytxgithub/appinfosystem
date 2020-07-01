package com.appsys.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.appsys.mapper.AppInfoMapper;
import com.appsys.mapper.AppVersionMapper;
import com.appsys.pojo.AppInfo;
import com.appsys.service.AppInfoService;
import com.appsys.service.AppVersionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public class AppInfoServiceImpl  implements AppInfoService{
	@Autowired private AppInfoMapper appInfoMapper;
	@Autowired private AppVersionMapper appVersionMapper;
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
	@Override
	public AppInfo selectByPrimaryKey1(Long id) {
		// TODO Auto-generated method stub
		return appInfoMapper.selectByPrimaryKey1(id);
	}
	@Override
	public int deleteById(Long appid) {
		// TODO Auto-generated method stub
		int rCount=appInfoMapper.deleteByPrimaryKey(appid);
		if(rCount>0){
			rCount=appVersionMapper.deleteByAppId(appid);
		}
		return rCount;
	}
	@Override
	public int onSale(Long appid) {
		// TODO Auto-generated method stub
		AppInfo appInfo=new AppInfo();
		appInfo.setId(appid);
		appInfo.setStatus(4L);
		appInfo.setOnsaledate(new Date());
		return appInfoMapper.updateStatus(appInfo);
	}
	@Override
	public int offSale(Long appid) {
		// TODO Auto-generated method stub
			AppInfo appInfo=new AppInfo();
			appInfo.setId(appid);
			appInfo.setStatus(5L);
			appInfo.setOffsaledate(new Date());
			return appInfoMapper.updateStatus(appInfo);
	}
	@Override
	public int pass(Long appid) {
		// TODO Auto-generated method stub
		AppInfo appInfo=new AppInfo();
		appInfo.setId(appid);
		appInfo.setStatus(2L);
		appInfo.setOffsaledate(new Date());
		return appInfoMapper.updateStatus(appInfo);
	}
	@Override
	public int nopass(Long appid) {
		AppInfo appInfo=new AppInfo();
		appInfo.setId(appid);
		appInfo.setStatus(3L);
		appInfo.setOffsaledate(new Date());
		return appInfoMapper.updateStatus(appInfo);
	}
	@Override
	public int audit(Long appid) {
		AppInfo appInfo=new AppInfo();
		appInfo.setId(appid);
		appInfo.setStatus(1L);
		appInfo.setOffsaledate(new Date());
		return appInfoMapper.updateStatus(appInfo);
	}
	

	
	
}
