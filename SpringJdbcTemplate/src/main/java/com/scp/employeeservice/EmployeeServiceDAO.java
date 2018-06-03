package com.scp.employeeservice;

import java.util.List;

import com.scp.springdemo.Employee;

public interface EmployeeServiceDAO {
	
	void create(String name, Integer age, Long salary);
	 
	 Employee getEmployee(Integer empid);
	 
	 List<Employee> listEmployees();
	 
	 void delete(Integer empid);
	 
	 void update(Integer empid, Integer age);
}
