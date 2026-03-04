package org.pankaj.jpa.firsthibernateapp;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.pankaj.jpa.firsthibernateapp.entity.Users;


public class App {
    public static void main(String[] args) 
    {
    		Configuration hibernateConfiguration = new Configuration();
    		hibernateConfiguration.configure("firsthibernate.cfg.xml");
    		
    		try(SessionFactory hibernateFactory = hibernateConfiguration.buildSessionFactory();
    				Scanner scanner = new Scanner(System.in))
    		{
    			//store(hibernateFactory, scanner);
    			
    			System.out.println("Enter ther username");
    			String userName = scanner.next();
    			
    			Session hibernateSession = hibernateFactory.openSession();
    			
    			Users objUser = hibernateSession.find(Users.class, userName);
    			System.out.println(objUser);
    			
    		}catch(HibernateException hbe)
    		{
    			hbe.printStackTrace();
    		}
    		
    		
    		
    }

	private static void store(SessionFactory hibernateFactory, Scanner scanner) {
		System.out.println("Etner the username");
		String userName = scanner.next();
		System.out.println("Etner the password");
		String password = scanner.next();
		
		Users objUser = new Users(userName, password, "default","default@default","123456","ROLE_USER");
		
		Session hibernateSession = hibernateFactory.openSession();
		
		Transaction transaction = hibernateSession.beginTransaction();
		
		hibernateSession.persist(objUser);
		
		transaction.commit();
		
		System.out.println("User registered");
	}
}
