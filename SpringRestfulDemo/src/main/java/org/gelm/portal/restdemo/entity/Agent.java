package org.gelm.portal.restdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AGENT")
public class Agent {
	@Id
	@Column(name = "agent_id")
	private String agentId;
	@Column(name = "agent_name")
	private String agentName;
	@Column(name = "agent_branch")
	private String agentBranch;

	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getAgentBranch() {
		return agentBranch;
	}
	public void setAgentBranch(String agentBranch) {
		this.agentBranch = agentBranch;
	}
	
}
