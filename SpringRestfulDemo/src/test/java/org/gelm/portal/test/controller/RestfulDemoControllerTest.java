package org.gelm.portal.test.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.gelm.portal.restdemo.controller.RestfulDemoController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
public class RestfulDemoControllerTest {

	private MockMvc mockMVC;
	@InjectMocks
	private RestfulDemoController restFulDemoController;
	@Before
	public void setUp() {
		mockMVC=MockMvcBuilders.standaloneSetup(restFulDemoController).build();
	}
	@Test
	public void testWelcomeRestController() throws Exception {
	mockMVC.perform
	(MockMvcRequestBuilders.get("/welcome"))
						   .andExpect(MockMvcResultMatchers.content().string("Welcome Great Eastern"));
	}
	@Test
	public void testAgentRestController() throws Exception {
		ResultActions result=mockMVC.perform(MockMvcRequestBuilders.get("/agents"));
		result.andExpect(jsonPath("$.agentId", org.hamcrest.Matchers.is("SURESH KUMAR METTA")));
	}
}
