package com.yztc.china_ucsp.web.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/**
 * 
 * TODO 权限验证的拦截器
 * 
 */
public class PrivilegeInterceptor extends HandlerInterceptorAdapter{
	@SuppressWarnings("unchecked")
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
int currentModule = (Integer)request.getSession().getAttribute("currentModule");
		
		List<Integer> privilegeIds = (List<Integer>) request.getSession().getAttribute("privilegeIds");
		
		//登录账户具备的权限
		for(Integer privilegeId : privilegeIds){
			if(currentModule==privilegeId){
				return true;
			}
		}	
		System.out.println(privilegeIds);
		response.sendRedirect("/china_ucsp/login/toNoPower.do");
		return false;
	}
}
