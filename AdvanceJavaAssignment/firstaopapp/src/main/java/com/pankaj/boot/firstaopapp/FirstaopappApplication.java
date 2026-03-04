package com.pankaj.boot.firstaopapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.pankaj.boot.firstaopapp.entity.Users;
import com.pankaj.boot.firstaopapp.services.UsersService;

@SpringBootApplication(scanBasePackages = {
		"com.pankaj.boot.firstaopapp.entity",
		"com.pankaj.boot.firstaopapp.services",
		"com.pankaj.boot.firstaopapp.aop"
})
public class FirstaopappApplication implements CommandLineRunner 
{
	@Autowired
	UsersService usersService;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstaopappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		System.out.println("****************** " + usersService);
		boolean status = usersService.authenticate(new Users("1cdac","dac"));
		System.out.println("Main Function Status :"  + status);
		
	}

}
