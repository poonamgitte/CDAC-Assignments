package org.SpringApp.SecondSpringApp;

import org.SpringApp.SecondSpringApp.beans.Users;
import org.SpringApp.SecondSpringApp.config.AppConfigurator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        // starts the Spring framework and loads all its configuration from Java classes 
        //(annotated with @Configuration) instead of relying on XML files.
        
        try(AnnotationConfigApplicationContext applicationContext = 
        		new AnnotationConfigApplicationContext(AppConfigurator.class)){
        	
//        	Users objUser = (Users)applicationContext.getBean("firstUser");
//        	System.out.println(objUser);
        	
        	Account firstFacebookAccount = (Account)applicationContext.getBean("newFacebookAccount");

        	Account firstAmazonAccount = (Account)applicationContext.getBean("newAmazonAccount");
      
        	System.out.println("facebook acount : "+firstFacebookAccount);
        	System.out.println("Amazon account : "+firstAmazonAccount);
        }
    }
}
