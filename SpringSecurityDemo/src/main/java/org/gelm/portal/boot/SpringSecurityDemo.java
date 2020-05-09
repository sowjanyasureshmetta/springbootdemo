package org.gelm.portal.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.gelm.portal.*"})
public class SpringSecurityDemo {	

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDemo.class, args);
	}
}
