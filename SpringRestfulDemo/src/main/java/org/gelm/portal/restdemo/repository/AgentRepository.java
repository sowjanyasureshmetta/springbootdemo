package org.gelm.portal.restdemo.repository;

import java.io.Serializable;

import org.gelm.portal.restdemo.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Serializable>{

}
