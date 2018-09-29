package com.pp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 
 * @author gourav rajput
 *
 */
@Component
public class LoggingInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
	/*	UserDTO user=(UserDTO) request.getSession().getAttribute("login");
		if (user == null ) {
			response.sendRedirect("login");
		}*/
	//System.out.println("prehandle");
		return true;
		}
		
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler, ModelAndView modelAndView) throws Exception {
		//System.out.println("posthandle");

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
			Object handler, Exception ex) throws Exception {
		System.out.println("aftercompletion");

	}
}