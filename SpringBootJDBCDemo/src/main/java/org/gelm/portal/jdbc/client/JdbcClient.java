package org.gelm.portal.jdbc.client;

import org.gelm.portal.jdbc.controller.JdbcController;
import org.gelm.portal.jdbc.model.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.gelm.portal.*"})
public class JdbcClient implements ApplicationRunner{

	@Autowired
	private JdbcController jdbcController;
	
	public static void main(String[] args) {
		SpringApplication.run(JdbcClient.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception{
		/*
		 * for(Agent agent : jdbcController.getAllAgentDetails()) {
		 * System.out.println(agent.getAgentId()+"\t"+agent.getAgentName()); }
		 */
		for(Agent agent : jdbcController.getAllAgentDetailsForAgentId()) {
			System.out.println(agent.getAgentId()+"\t"+agent.getAgentName());
		}
	}
	
}
