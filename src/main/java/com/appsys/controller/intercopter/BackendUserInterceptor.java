package com.appsys.controller.intercopter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.appsys.pojo.BackendUser;

public class BackendUserInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session=request.getSession();
		BackendUser backendUser=(BackendUser) session.getAttribute("BE_USER");
		if(backendUser!=null){
			return true;
		}
		throw new RuntimeException("登录未授权");
	}
	
}
