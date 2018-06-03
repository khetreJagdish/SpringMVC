package com.scp.services;

import java.util.List;

import com.scp.bean.Employee;

public interface EmployeeService {
	
	Employee addEmployee(Employee employee);
	Employee getEmployee(int empID);
	List<Employee> getAllEmployee();
	
}
