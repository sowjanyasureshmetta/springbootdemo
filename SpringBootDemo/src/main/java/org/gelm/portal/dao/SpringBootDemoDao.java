package org.gelm.portal.dao;

import org.gelm.portal.configprop.SpringBootDemoPropertyConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

@Repository
@PropertySource(value = "classpath:/welcomemsg.properties")
public class SpringBootDemoDao {
	@Value("${welcome.msg}")
	private String welcomemsg;
	
	@Autowired
	private SpringBootDemoPropertyConfig propConfig;
	
	private static Logger daologger=LoggerFactory.getLogger(SpringBootDemoDao.class);
	 
	
	public void welcome() {
		daologger.info(welcomemsg);
		daologger.info(propConfig.getDriverName()+"\t"+propConfig.getUrl()+"\t"+
					   propConfig.getUsername()+"\t"+propConfig.getPassword());	
	}
}
