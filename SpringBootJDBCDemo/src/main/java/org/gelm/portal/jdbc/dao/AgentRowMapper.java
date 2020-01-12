package org.gelm.portal.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.gelm.portal.jdbc.model.Agent;
import org.springframework.jdbc.core.RowMapper;

public class AgentRowMapper implements RowMapper<Agent>{

	@Override
	public Agent mapRow(ResultSet rs, int rowNum) throws SQLException {
		Agent agent=new Agent();
		agent.setAgentId(rs.getString("agent_id"));
		agent.setAgentName(rs.getString("agent_name"));
		agent.setAgentBranch(rs.getString("agent_branch"));
		return agent;
	}

}
