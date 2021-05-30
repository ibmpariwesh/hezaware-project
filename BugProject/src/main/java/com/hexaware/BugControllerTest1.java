package com.hexaware;

import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.hexaware.controller.BugController;
import com.hexaware.entity.BugRequest;
import com.hexaware.service.BugRepository;
import com.hexaware.service.BugService;
// Not working
//@AutoConfigureMockMvc
@ContextConfiguration(classes = { BugController.class, BugService.class})
@WebMvcTest

@ExtendWith(MockitoExtension.class)
//@SpringBootTest
class BugControllerTest1 {
	@Autowired
	private MockMvc mockMvc;
	@Mock BugRepository userRepository;
	@BeforeEach
	public void setUp() throws Exception {
	}

	@Test
	void testGetBug() {
		fail("Not yet implemented");
	}

//	@Test
//	void testGetAllBug() {
//		fail("Not yet implemented");
//	}

	@Test
	void testCreateNewBug() throws Exception {
		BugRequest bugRequest = new BugRequest();
		MvcResult result = mockMvc
				.perform(MockMvcRequestBuilders.post("/birthday/dayOfWeek").content("test")
						.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isCreated()).andReturn();
		String resultSS = result.getResponse().getContentAsString();
	}

	@Test
	void testHandleException() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateBug() {
		fail("Not yet implemented");
	}

}
