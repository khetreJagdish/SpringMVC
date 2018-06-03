package com.scp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.scp.model.Employee;
import com.scp.service.Services;

@Controller
@RequestMapping("/hello")
public class HelloUserController {
	
	@Autowired
	Services services;
	
	static {
		
		System.out.println("Inside HelloUserController");
	}
	
	/**
	 *     OUTPUT :
	 *      
	 *      Spring 3.0 MVC Framework Hello World Example!

			Jagdish

	 * 
	 * */
	@RequestMapping(method=RequestMethod.GET)
	public String sayHelloWorld(ModelMap map) {
		map.addAttribute("message","Spring 3.0 MVC Framework Hello World Example!");
		map.addAttribute("Jagdish", "Jagdish");
		return "hello";
		
			
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/callModelAndView")
	public ModelAndView callModelAndView(Employee employee) {
		
		return new ModelAndView("springView", "springViewMessage", services.addEmployee(employee));
		
	}

}
