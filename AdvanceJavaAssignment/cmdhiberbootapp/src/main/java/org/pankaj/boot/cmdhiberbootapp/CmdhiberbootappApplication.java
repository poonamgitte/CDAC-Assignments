package org.pankaj.boot.cmdhiberbootapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.pankaj.boot.cmdhiberbootapp.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"org.pankaj.boot.cmdhiberbootapp.entity"})
public class CmdhiberbootappApplication implements CommandLineRunner 
{
	@Autowired
	SessionFactory hibernateFactory;

	public static void main(String[] args) {
		SpringApplication.run(CmdhiberbootappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		try(Session hibernateSession = hibernateFactory.openSession())
		{
			Category objCategory = (Category)hibernateSession.find(Category.class, 1);
			if(objCategory!=null)
			{
				System.out.println(objCategory.getCategoryName());
				System.out.println(objCategory.getCategoryDescription());
			}
			else
				System.out.println("No such Category");
		}
	}
}
