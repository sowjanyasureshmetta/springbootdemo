package org.gelm.portal.jdbc.service;

import java.util.List;

import org.gelm.portal.jdbc.dao.JdbcDao;
import org.gelm.portal.jdbc.model.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JdbcService {

	@Autowired
	private JdbcDao jdbcDao;
	
	public List<Agent> getAllAgentDetails(){
		return jdbcDao.getAllAgentDetails();
	}
	public List<Agent> getAllAgentDetailsForAgentId(){
		return jdbcDao.getAllAgentDetailsForAgentId();
	}
	
	public Agent insertAgentDetails() {
		return jdbcDao.insertAgentDetails();
	}
	
}
