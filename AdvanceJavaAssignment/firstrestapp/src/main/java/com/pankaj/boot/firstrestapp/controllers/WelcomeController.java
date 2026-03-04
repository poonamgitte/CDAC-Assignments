package com.pankaj.boot.firstrestapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController
{
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome to the First Rest API";
	}
	
	
	
}
