package org.gountu.series.student.interceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class StudentInterceptorBinding extends WebMvcConfigurationSupport
{
	@Autowired
	private StudentInterceptor studentInterceptor;
	
	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(studentInterceptor);
	}
	
	@Bean
	public InternalResourceViewResolver configureViewResolver() {
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/web/jsp/StudentAdmission/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
}
