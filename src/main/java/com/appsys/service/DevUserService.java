package com.appsys.service;

import com.appsys.pojo.DevUser;

public interface DevUserService {
	/**
	 * 开发者登录
	 * @param devUser
	 * @return
	 */
	DevUser login(DevUser devUser);
	
	/**
	 * 修改开发者密码
	 * @param newPassword
	 * @return
	 */
	int changePassword(Long devId,String newPassword);
}
