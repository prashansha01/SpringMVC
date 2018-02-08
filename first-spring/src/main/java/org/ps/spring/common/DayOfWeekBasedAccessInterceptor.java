package org.ps.spring.common;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter{
	//before called the handler i. i the controller
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
		
		response.getWriter().write("Access prohibited from interceptor");
		return false;
		//return true;
	}
	//after handler execution, before redirecting to view
	@Override
	public void postHandle(
			HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		String viewName = modelAndView.getViewName();
		System.out.println("Inside postHandle... Redirecting to view: "+viewName);
	}

	//after rendering the view
	@Override
	public void afterCompletion(
			HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("Inside afterCompletion ");
	}

}
