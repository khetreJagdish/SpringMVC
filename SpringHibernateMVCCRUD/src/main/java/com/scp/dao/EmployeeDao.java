package com.scp.dao;

import java.util.List;

import com.scp.bean.Employee;

public interface EmployeeDao {
	Employee addEmployee(Employee employee);
	Employee getEmployee(int empID);
	List<Employee> getAllEmployee();
	

}
