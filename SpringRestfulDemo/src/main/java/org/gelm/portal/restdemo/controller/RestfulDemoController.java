package org.gelm.portal.restdemo.controller;

import java.util.List;

import org.gelm.portal.restdemo.entity.Agent;
import org.gelm.portal.restdemo.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfulDemoController {

	@Autowired
	private AgentRepository agentDao;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome Great Eastern";
	}
	
	@GetMapping(name = "/agents")
	public List<Agent> getAllAgents() {
		return agentDao.findAll();
	}
	
	
	
}
