package com.appsys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.appsys.mapper.DevUserMapper;
import com.appsys.pojo.DevUser;
import com.appsys.service.DevUserService;
@Service
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
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
