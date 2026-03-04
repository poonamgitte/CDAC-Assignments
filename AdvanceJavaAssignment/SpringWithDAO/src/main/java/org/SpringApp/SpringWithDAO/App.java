package org.SpringApp.SpringWithDAO;

import java.util.Iterator;

import org.SpringApp.SpringWithDAO.config.AppConfigurator;
import org.SpringApp.web.Entity.Category;
import org.SpringApp.web.dao.CategoryDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        try(AnnotationConfigApplicationContext applicationContext 
        		= new AnnotationConfigApplicationContext(AppConfigurator.class)){
        	
        	CategoryDAO dao = (CategoryDAO)applicationContext.getBean("categoryDAO");
        	System.out.println(dao);
        	
//        	Iterator<Category> iter = dao.findAll();
//        	while(iter.hasNext()) {
//        		System.out.println(iter.next());
//        	}
        
        }
    }
    
    
}
