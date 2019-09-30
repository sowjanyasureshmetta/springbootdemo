package org.gelm.portal.client; 

import org.gelm.portal.controller.SpringBootDemoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoClient {

	public static void main(String[] args) {

		SpringBootDemoController controller = (SpringBootDemoController) SpringApplication
				.run(SpringBootDemoController.class, args).getBean(SpringBootDemoController.class);
		controller.welcome();

	}

}
