package org.gelm.portal.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gelm.portal.util.JwtUtil;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.classic.Logger;

@Component
public class SpringSecurityInterceptor implements HandlerInterceptor{

	private static Logger logger=(Logger) LoggerFactory.getLogger(SpringSecurityInterceptor.class);
	
	@Autowired
	private JwtUtil jwt;
	
	String token="";
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String token=(String)request.getAttribute("bearer");
		if(jwt.validateToken(token,request.getHeader("gelappuserid"))) {
		logger.info("Pre Handle : Token :"+token);
		return true;
		}
		else
			return false;
	}
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("Post Handle");
	}
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.info("After Completion");
	}
	
}
