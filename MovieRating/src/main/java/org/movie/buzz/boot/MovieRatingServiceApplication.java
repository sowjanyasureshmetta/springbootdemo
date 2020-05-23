package org.movie.buzz.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(scanBasePackages = {"org.movie.buzz.*"})
@PropertySource(value = {"application.properties"})
public class MovieRatingServiceApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(MovieRatingServiceApplication.class, args);
	}
	
}
