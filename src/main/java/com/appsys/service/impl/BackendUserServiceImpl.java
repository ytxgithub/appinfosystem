package com.appsys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.appsys.mapper.BackendUserMapper;
import com.appsys.pojo.BackendUser;
import com.appsys.service.BackendUserService;
@Service
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public class BackendUserServiceImpl implements BackendUserService  {
	@Autowired private BackendUserMapper backendUserMapper;
	@Override
	public BackendUser login(BackendUser backendUser) {
		// TODO Auto-generated method stub
		return backendUserMapper.findByBackendUser(backendUser);
	}

}
