package org.gelm.portal.controller;

import org.gelm.portal.service.SpringBootDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@Controller
@ComponentScan(basePackages  = "org.gelm.portal.*")
public class SpringBootDemoController {

	@Autowired
	private SpringBootDemoService demoService;
	
	public void welcome() {
		demoService.welcome();
	}
	
}
