package org.gelm.portal.jdbc.test.client;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.gelm.portal.jdbc.dao.JdbcDao;
import org.gelm.portal.jdbc.model.Agent;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
public class JdbcTestClient {

@Mock
private JdbcDao jdbcDao;
	
@Before	
public void setUp() {
	
	//MockitoAnnotations.initMocks(this);
	
	List<Agent> agentList=new LinkedList<Agent>();
	Agent a=new Agent();
	a.setAgentId("01");a.setAgentName("test");a.setAgentBranch("kl");
	agentList.add(a);
	
	Mockito.when(jdbcDao.getAllAgentDetailsForAgentId()).thenReturn(agentList);
}

@Test
public void getAgentDetailsForAnAgentIdTest() {
	assertEquals(jdbcDao.getAllAgentDetailsForAgentId().get(0).getAgentName(), "test1");
}
	 
}
