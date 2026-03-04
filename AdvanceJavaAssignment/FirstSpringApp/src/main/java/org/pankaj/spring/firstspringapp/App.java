package org.pankaj.spring.firstspringapp;

import org.pankaj.spring.firstspringapp.beans.Users;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    
    		try(ClassPathXmlApplicationContext applicationContext 
    				= new ClassPathXmlApplicationContext("spring.xml"))
    		{
    			
    			Users objUser = (Users)applicationContext.getBean("objUser");
    			System.out.println(objUser);
    			objUser.setUserName(null);
    			Users o2=(Users)applicationContext.getBean("objUser2");
    			System.out.println(o2);
    			Users o3=(Users)applicationContext.getBean("objUser");
    			System.out.println(o3);
    			Users o4=(Users)applicationContext.getBean("objUser2");
    			System.out.println(o4);
    			
    		}
    	
    	
    	
    }
}
