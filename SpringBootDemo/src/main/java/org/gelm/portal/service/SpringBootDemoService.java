package org.gelm.portal.service;

import org.gelm.portal.dao.SpringBootDemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringBootDemoService {

	@Autowired
	private SpringBootDemoDao demoDao;
	
	public void welcome() {
		demoDao.welcome();
	}
}
