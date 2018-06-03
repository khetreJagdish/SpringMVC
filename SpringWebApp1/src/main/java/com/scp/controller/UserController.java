package com.scp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
		
	@RequestMapping(value="/pageFromUser")
	public ModelAndView pageFromUser() {
		
		return new ModelAndView("UserehomePage", "homeMessage", "This is home Page from user");
	}
}
