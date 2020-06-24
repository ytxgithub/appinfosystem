package com.appsys.service.impl;

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

}
