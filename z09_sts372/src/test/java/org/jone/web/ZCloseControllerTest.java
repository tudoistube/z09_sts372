package org.jone.web;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(
		locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class ZCloseControllerTest {

	private static final Logger logger = 
			LoggerFactory.getLogger(SampleControllerTest.class);

	@Inject
    private WebApplicationContext wac;

    private MockMvc mockMvc;
    	
    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        logger.info("zweb.setup............");
    }
    
    @Test
    public void testListAll_close009() throws Exception{
    	mockMvc.perform(MockMvcRequestBuilders.get("/listAll_close009"));
    }

}
