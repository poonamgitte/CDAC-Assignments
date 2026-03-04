package org.SpringApp.SecondSpringApp.config;

import org.SpringApp.SecondSpringApp.Account;
import org.SpringApp.SecondSpringApp.AmazonAccount;
import org.SpringApp.SecondSpringApp.FacebookAccount;
import org.SpringApp.SecondSpringApp.beans.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;


// Configurator class to create bean objects
// It is replacement of Spring.xml file

@Configuration
@PropertySources(@PropertySource("classpath:application.properties"))
public class AppConfigurator {
	
// Providing default values to bean 
//	@Bean
//	public Users firstUser(@Value("default")String uName, 
//							@Value("defPwd") String pwd)
//	{
//		return new Users(uName, pwd) ;
//	}
	
	//Providing values from application.properties
//	@Bean
//	public Users firstUser(@Value("${default.user.username}")String uName, 
//							@Value("${default.user.password}") String pwd)
//	{
//		return new Users(uName, pwd) ;
//	}
	
	// Create bean object of faebookAccount 
	// internally it will call user bean first and create object (i.e, facebookUser)
	@Bean
	public Account newFacebookAccount() {
		return new FacebookAccount();
	}
	
	// Create bean object of amazonAccount 
	// internally it will call user bean first and create object (i.e, amazonUser)
	@Bean
	public Account newAmazonAccount() {
		return new AmazonAccount();
	}
	
	@Autowired
	Environment env;
	
	@Bean
	public Users facebookUser()
	{
		String uName = env.getProperty("facebookuser.username");
		String pwd = env.getProperty("facebokuser.password");
		return new Users(uName, pwd) ;
	}
	
	@Bean
	public Users amazonUser() {
		
		String uName = env.getProperty("amazonuser.username");
		String pwd = env.getProperty("amazonuser.password");
		return new Users(uName, pwd);
	}
}
