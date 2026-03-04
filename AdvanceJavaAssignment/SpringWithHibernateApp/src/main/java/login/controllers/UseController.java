package login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import login.dao.UsersDAO;
import login.model.Users;

@Controller
public class UseController {
	
	@Autowired
	UsersDAO usersDAO;
	
	@RequestMapping("/login")
	public void prepareLogin(Model data) {
		data.addAttribute("objUser", new Users());
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String validateUser(@Valid @ModelAttribute("objUser"))
}
