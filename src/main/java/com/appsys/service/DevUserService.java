package com.appsys.service;

import com.appsys.pojo.DevUser;

public interface DevUserService {
	/**
	 * 开发者登录
	 * @param devUser
	 * @return
	 */
	DevUser login(DevUser devUser);
}
