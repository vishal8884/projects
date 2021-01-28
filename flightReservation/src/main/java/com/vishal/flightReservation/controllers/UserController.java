package com.vishal.flightReservation.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vishal.flightReservation.entities.User;
import com.vishal.flightReservation.repos.UserRepository;
import com.vishal.flightReservation.services.SecurityService;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Autowired
	private SecurityService securityService;
	
	
	@RequestMapping("/showReg")
	public String showRegistrationPage()
	{
		LOGGER.info("inside showRegistrationPage()");
		return "login/registerUser";
	}
	
	@RequestMapping(value="registerUser" , method = RequestMethod.POST)
	public String register(@ModelAttribute("user") User user)
	{
		LOGGER.info("inside register()"+user);
		
		user.setPassword(encoder.encode(user.getPassword()));
		
		userRepository.save(user);
		return "login/login";
		
	}
	
	@RequestMapping("/showLogin")
	public String showLoginPage()
	{
		LOGGER.info("inside showLoginPage()");
		return "login/login";
	}
	
	@RequestMapping(value="/login" , method=RequestMethod.POST)
	public String login(@RequestParam("email") String email , @RequestParam("password") String password , ModelMap modelMap)
	{
		LOGGER.info("inside login() and email is "+email);
//		LOGGER.error("ERROR");
//		LOGGER.warn("WARN");
//		LOGGER.info("INFO");
//		LOGGER.debug("DEBUG");
//		LOGGER.trace("TRACE");
		
		boolean loginResponse = securityService.login(email, password);
		
		if(loginResponse)
		{
			return "login/findFlights";
		}
		else {
			modelMap.addAttribute("msg", "Invalid user name or password .. please try again");
		}
		return "login/login";
	}
	
	
	
	
	
	
	
	
	
	
	
}
