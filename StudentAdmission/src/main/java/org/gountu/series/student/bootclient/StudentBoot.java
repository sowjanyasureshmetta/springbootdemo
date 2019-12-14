package org.gountu.series.student.bootclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.gountu.series.*"})
public class StudentBoot {

	public static void main(String[] args) {
		
		SpringApplication.run(StudentBoot.class, args);
	}
	
}
