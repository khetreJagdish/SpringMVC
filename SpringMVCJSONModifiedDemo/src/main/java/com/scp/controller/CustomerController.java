package com.scp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.scp.dao.CustomerDAOImpl;
import com.scp.entity.CustomersEntity;
import com.scp.model.CustomersBean;
import com.scp.services.CustomerService;
import com.scp.services.CustomerServicesImpl;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	static {
		
		System.out.println("Inside CustomerController ");
	}
	
	
	
	public CustomerController() {
		super();
	}

	
	
	 @RequestMapping(value = "/index", method = RequestMethod.GET)
	    public ModelAndView getCustomerView() {
	        ModelAndView mv= new ModelAndView("usersView");
	        mv.addObject("customerModel", customerService.getListOfCustomers());
	        return new ModelAndView("index");
	    }
	 
	
	    @RequestMapping(value = "/customerList", method = RequestMethod.GET)
	    public @ResponseBody List<CustomersBean> getUsersRest() {
	    	
	    	return customerService.getListOfCustomers();	    	
	    	
	    }
	    	
	    @RequestMapping(value="/addCustomers", method=RequestMethod.POST)
	    @ResponseBody
	    public CustomersBean addCustomer(@RequestBody CustomersBean customersBean) {
	    	
	    	customerService.addCustomer(customersBean);
	    	return customersBean;
	    	   	
	    }
	    
	    @RequestMapping(value="/deleteCustomer/{id}",method=RequestMethod.DELETE)
	    public String deleteCustomer(@PathVariable("id") int custID) {
	    		
	    	List<CustomersBean> customersBeanList = customerService.getListOfCustomers();
	    	
	    	for(CustomersBean customersBean : customersBeanList) {
	    		
	    		if (customersBean.getCustomerID() == custID) {
					customerService.deleteCustomer(custID);
				}
	    	}
	    	return "redirect:/customerList";
	    }
}
