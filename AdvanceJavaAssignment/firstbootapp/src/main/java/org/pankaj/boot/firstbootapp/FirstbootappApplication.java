package org.pankaj.boot.firstbootapp;

import org.pankaj.boot.firstbootapp.beans.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = {"org.pankaj.boot.firstbootapp.beans"} )
public class FirstbootappApplication implements CommandLineRunner 
{
	@Autowired
	Users objUser;
	
	@Autowired
	ApplicationContext applicationContext;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstbootappApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("First Spring Boot Applicatoin "+  objUser);
		
		//applicationContext.getBean(null)
	}

}
