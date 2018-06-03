package com.scp.springjsondemo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class UserController {

  
	static{
		System.out.println("inside UserController");
	}
	
    /**
     * 
     * http://localhost:8090/springmvcJavaConfig/usersList  -- For Json Data
     * http://localhost:8090/springmvcJavaConfig/users  -- For SpringMVC
     * 
    * Request mapping for user
    */
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ModelAndView getUsersView() {
        ModelAndView mv= new ModelAndView("usersView");
        mv.addObject("usersModel",DummyData.getListOfUsers() );
        return mv;
    }
     
    /**
    * Rest web service
    */
    @RequestMapping(value = "/usersList", method = RequestMethod.GET)
    public @ResponseBody List<User> getUsersRest() {
        return DummyData.getListOfUsers();
    }

	public UserController() {
		super();
		System.out.println("inside usercontroller constructor");
	}
    
    
}
