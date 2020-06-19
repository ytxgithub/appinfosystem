package com.appsys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsys.mapper.DevUserMapper;
import com.appsys.pojo.DevUser;
import com.appsys.service.DevUserService;
@Service
public class DevUserServiceImpl implements DevUserService {
	@Autowired private DevUserMapper devUserMapper;
	
	/**
	 * 开发者登录
	 */
	@Override
	public DevUser login(DevUser devUser) {
		// TODO Auto-generated method stub
		return devUserMapper.login(devUser);
	}

}
