package org.gountu.series.student.msg.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class StudentMessageConfiguration {

	@Bean
	public MessageSource messageSource() {
		
		ReloadableResourceBundleMessageSource studentMessageSource=new ReloadableResourceBundleMessageSource();
		studentMessageSource.setBasename("classpath:messages");
		studentMessageSource.setDefaultEncoding("UTF-8");
		return studentMessageSource;
	}
	
	@Bean
	public LocalValidatorFactoryBean configureMessageSourceToValidator() {
		LocalValidatorFactoryBean validator=new LocalValidatorFactoryBean();
		validator.setValidationMessageSource(messageSource());
		return validator;
	}
	
}
