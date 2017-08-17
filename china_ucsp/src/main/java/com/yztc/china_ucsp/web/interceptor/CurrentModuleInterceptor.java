package com.yztc.china_ucsp.web.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class CurrentModuleInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		String uri = request.getRequestURI();
		String moduleName = uri.substring(0, uri.lastIndexOf("/"));		
		
		//登录账户访问的模块
		int currentModule = 0;
		if("/china_ucsp/role".equals(moduleName)){
			currentModule = 1;
		}
		if("/china_ucsp/admin".equals(moduleName)){
			currentModule = 2;
		}
		if("/china_ucsp/fee".equals(moduleName)){
			currentModule = 3;
		}
		if("/china_ucsp/account".equals(moduleName)){
			currentModule = 4;
		}
		if("/china_ucsp/service".equals(moduleName)){
			currentModule = 5;
		}
		System.out.println(currentModule);
		request.getSession().setAttribute("currentModule", currentModule);
		
		return true;
		
	}

}
