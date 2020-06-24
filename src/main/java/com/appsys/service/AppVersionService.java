package com.appsys.service;

import com.appsys.pojo.AppVersion;

public interface AppVersionService {
	/**
	 * 增加应用的版本
	 * @param appVersion
	 * @return
	 */
	int saveVersion(AppVersion appVersion);
}
