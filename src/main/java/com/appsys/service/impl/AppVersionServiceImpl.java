package com.appsys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsys.mapper.AppVersionMapper;
import com.appsys.pojo.AppVersion;
import com.appsys.service.AppVersionService;
@Service
public class AppVersionServiceImpl implements AppVersionService {
	@Autowired private AppVersionMapper appVersionMapper;
	@Override
	public int saveVersion(AppVersion appVersion) {
		// TODO Auto-generated method stub
		return appVersionMapper.insertSelective(appVersion);
	}
	@Override
	public List<AppVersion> findAppId(Long appid) {
		// TODO Auto-generated method stub
		return appVersionMapper.findAppId(appid);
	}
	@Override
	public AppVersion findById(Long id) {
		// TODO Auto-generated method stub
		return appVersionMapper.selectByPrimaryKey(id);
	}
	@Override
	public int modifyVersion(AppVersion appVersion) {
		// TODO Auto-generated method stub
		return appVersionMapper.updateByPrimaryKeySelective(appVersion);
	}

}
