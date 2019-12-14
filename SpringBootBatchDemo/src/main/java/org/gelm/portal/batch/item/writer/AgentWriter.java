package org.gelm.portal.batch.item.writer;

import java.util.List;

import org.gelm.portal.batch.model.Agent;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;
@Component
public class AgentWriter implements ItemWriter<Agent> {

	@Override
	public void write(List<? extends Agent> items) throws Exception {
	
		for(Agent a :items) {
			System.out.println(a.getAgentId()+"\t"+a.getAgentName());
		}
		
	}

}
