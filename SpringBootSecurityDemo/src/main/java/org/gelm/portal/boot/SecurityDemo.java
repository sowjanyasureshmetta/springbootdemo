package org.gelm.portal.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"org.gelm.portal.*"})
@EnableJpaRepositories(basePackages = {"org.gelm.portal.*"})
@EntityScan(basePackages = {"org.gelm.portal.*"})
public class SecurityDemo {

	public static void main(String[] args) {
		SpringApplication.run(SecurityDemo.class, args);
	}
	
}
