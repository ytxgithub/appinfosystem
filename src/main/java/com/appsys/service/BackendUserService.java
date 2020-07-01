package com.appsys.service;

import com.appsys.pojo.BackendUser;

public interface BackendUserService {
	/**
	 * 管理员登录
	 * @param backendUser
	 * @return
	 */
	BackendUser login(BackendUser backendUser);

}
