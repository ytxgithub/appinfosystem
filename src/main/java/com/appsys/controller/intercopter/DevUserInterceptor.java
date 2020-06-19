package com.appsys.controller.intercopter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.appsys.pojo.DevUser;

public class DevUserInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		DevUser devUser=(DevUser) session.getAttribute("DEV_USER");
		if(devUser!=null){
			return true;
		}
		throw new RuntimeException("登录未授权");
	}
		

}
