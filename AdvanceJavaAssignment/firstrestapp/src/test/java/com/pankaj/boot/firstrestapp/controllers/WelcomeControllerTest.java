package com.pankaj.boot.firstrestapp.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static  org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static  org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(WelcomeController.class)
public class WelcomeControllerTest 
{
	@Autowired
	MockMvc mock;
	
	@Test
	public void testWelcomeMessageFromWelcomeController() throws Exception
	{
		mock.perform(get("/welcome"))
				.andExpect(status().isOk())
				.andExpect(content().string("Welcome1 to the First Rest API"));
	}
	
	
}
