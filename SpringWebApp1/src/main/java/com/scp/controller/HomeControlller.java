package com.scp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value ="/")
public class HomeControlller {
	
	@RequestMapping(method=RequestMethod.GET )
	public String homePage() {
		
		return  "home";
	}
	
}
