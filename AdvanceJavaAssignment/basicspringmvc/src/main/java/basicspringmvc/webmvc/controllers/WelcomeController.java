package basicspringmvc.webmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class WelcomeController 
{
	@RequestMapping("/welcome")
	public ModelAndView welcome()
	{
		
		return new ModelAndView("welcome","data","This is the first Welcome page of MVC");
	}
}
