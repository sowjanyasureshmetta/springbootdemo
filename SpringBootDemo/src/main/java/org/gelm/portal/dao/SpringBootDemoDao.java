package org.gelm.portal.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class SpringBootDemoDao {
	
	private static Logger daologger=LoggerFactory.getLogger(SpringBootDemoDao.class);
	
	public void welcome() {
		daologger.info("Welcome to Spring Core Demo Application");
	}
}
