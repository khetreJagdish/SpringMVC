package com.scp.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/")
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET )
	public String sayHelloWorld(ModelMap map) {
		map.addAttribute("message", "Spring 3.0 MVC Framework Hello World Example!");
		map.addAttribute("Jagdish", "Jagdish");
		return "hello";

	}

}
