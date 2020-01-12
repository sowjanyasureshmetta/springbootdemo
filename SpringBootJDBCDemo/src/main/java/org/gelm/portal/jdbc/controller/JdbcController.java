package org.gelm.portal.jdbc.controller;

import java.util.List;

import org.gelm.portal.jdbc.model.Agent;
import org.gelm.portal.jdbc.service.JdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class JdbcController {

	@Autowired
	private JdbcService jdbcService;
	
	public List<Agent> getAllAgentDetails(){
		return jdbcService.getAllAgentDetails();
	}
	public List<Agent> getAllAgentDetailsForAgentId(){
		return jdbcService.getAllAgentDetailsForAgentId();
	}
	
	public Agent insertAgentDetails() {
		return jdbcService.insertAgentDetails();
	}
	
}
