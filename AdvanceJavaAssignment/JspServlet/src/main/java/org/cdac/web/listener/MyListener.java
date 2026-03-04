package org.cdac.web.listener;
import org.cdac.web.db.DBConnection;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;


@WebListener
public class MyListener implements ServletContextListener {

	 public void contextInitialized(ServletContextEvent servletContextEvent) {
		    ServletContext ctx = servletContextEvent.getServletContext();
	    	
		    String className = ctx.getInitParameter("DBClassName");
	    	String dbUrl = ctx.getInitParameter("DBURL");
	    	String user = ctx.getInitParameter("DBUSER");
	    	String password = ctx.getInitParameter("DBPWD");
	    	
	    	//create database connection from init parameters and set it to context
	    	DBConnection dbConnection = new DBConnection(className, dbUrl, user, password);
	    	ctx.setAttribute("globalConnection", dbConnection.getConnection());
	    	System.out.println("Database connection initialized for Application.");
	 }
	 
	 public void contextDestroyed(ServletContextEvent servletContextEvent) {
		 
		 
	 }
}
