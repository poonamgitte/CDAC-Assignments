package com.pankaj.boot.firstrestapp.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController 
{
	@PostMapping("/login")
	public boolean authenticate(
		 	@RequestParam("username") String userName, 
		 	@RequestParam("password") String password)
	{
		if(userName.equals("cdac") && password.equals("dac"))
			return true;
		else
			return false;
	}
}
