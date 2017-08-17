package com.yztc.china_ucsp.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.yztc.china_ucsp.entity.Admin;
/**
 * 
 * TODO 验证用户是否登录的拦截器
 * 
 */
public class LoginInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		Admin admin = (Admin) session.getAttribute("admin");
		if(admin==null){
			response.sendRedirect(request.getContextPath()+"/login/toLogin.do");
			return false;
		}		
		return true;		
	}
}
