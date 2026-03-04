package org.SpringApp.FirstSpringApp;

import org.SpringApp.FirstSpringApp.beans.Users;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {

		// Creating bean in spring.xml
		
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml")) {
			Users objUser = (Users) applicationContext.getBean("objUser");

			System.out.println(objUser);
			
		}
		
	}
}
