package org.gelm.portal.batch.item.processor;

import org.gelm.portal.batch.model.Agent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;
@Component
public class AgentItemProcessor implements ItemProcessor<Agent, Agent> {

	private static final Logger logger=LoggerFactory.getLogger(AgentItemProcessor.class);
	
	@Override
	public Agent process(Agent item) throws Exception {

		logger.info(item.getAgentId()+"\t"+item.getAgentName()+"\t"+item.getAgentBranch());
		
		return item;
	}

}
