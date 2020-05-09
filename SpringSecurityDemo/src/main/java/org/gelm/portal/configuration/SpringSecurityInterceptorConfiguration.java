package org.gelm.portal.configuration;

import org.gelm.portal.interceptors.SpringSecurityInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringSecurityInterceptorConfiguration implements WebMvcConfigurer{

	@Autowired
	private SpringSecurityInterceptor interceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(interceptor)
		//.addPathPatterns("/demo/*")
		;
	}
	
}
