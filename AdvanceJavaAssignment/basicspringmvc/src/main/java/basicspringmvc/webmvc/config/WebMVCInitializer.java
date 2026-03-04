package basicspringmvc.webmvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class WebMVCInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext applicationContext =
					new AnnotationConfigWebApplicationContext();
		applicationContext.setServletContext(servletContext);
		
		ServletRegistration.Dynamic frontController =
				servletContext.addServlet("frontController", 
						new DispatcherServlet(applicationContext));

		// Mappings
		//a. Path Mapping        -  /spring/*
		//b. Extension Mapping   - *.

		frontController.setLoadOnStartup(1);
		frontController.addMapping("/spring/*");
		applicationContext.register(AppConfigurator.class);
		
		
	}

}
