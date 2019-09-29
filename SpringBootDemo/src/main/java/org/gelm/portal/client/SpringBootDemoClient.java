package org.gelm.portal.client;

import org.gelm.portal.controller.SpringBootDemoController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBootDemoClient {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext springContext=new AnnotationConfigApplicationContext();
		springContext.register(SpringBootDemoController.class);
		springContext.refresh();
		SpringBootDemoController controller=(SpringBootDemoController)springContext.getBean(SpringBootDemoController.class);
		controller.welcome();
		springContext.close();
	}
	
}
