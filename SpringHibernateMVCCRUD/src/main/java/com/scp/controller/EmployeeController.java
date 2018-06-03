package com.scp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.scp.bean.Employee;

import com.scp.services.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public ModelAndView appLandingPage(){
		ModelAndView model = new ModelAndView();
		model.addObject("myUserBean",new Employee());
		return new ModelAndView("index");
	}
	
	
	@RequestMapping(value="/addEmployee",method=RequestMethod.POST)
	public void addEmployee(@ModelAttribute Employee employee) {
		
		employeeService.addEmployee(employee);
		
	}
	
	@RequestMapping(value="/getEmployee",method=RequestMethod.GET)
	public Employee getEmployee(@PathVariable int empId) {
		
		return employeeService.getEmployee(empId);
		
	}
	
	@RequestMapping(value="/getAllEmployee",method=RequestMethod.GET)
	public List<Employee> getAllEmployee(){
		
		return employeeService.getAllEmployee();
	}
}
