package org.gelm.portal.jdbc.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.gelm.portal.jdbc.model.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private NamedParameterJdbcTemplate namedJdbcTemplate;
	
	public Agent insertAgentDetails() {
		return new Agent();
	}
	public List<Agent> getAllAgentDetails() {
		return jdbcTemplate.query("select * from agent", new AgentRowMapper());
	}
	public List<Agent> getAllAgentDetailsForAgentId(){
		//return jdbcTemplate.query("select * from agent where agent_id=?", new AgentRowMapper(),"GELM01");
		Map<String,String> paramSource=new HashMap<String, String>();
		paramSource.put("id", "GELM02" );
		return namedJdbcTemplate.query("select * from agent where agent_id= :id ", paramSource, new AgentRowMapper());
	}
	
}
