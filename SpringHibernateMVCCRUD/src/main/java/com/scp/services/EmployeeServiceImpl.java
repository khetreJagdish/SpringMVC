package com.scp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scp.bean.Employee;
import com.scp.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl  implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;
	
	public Employee addEmployee(Employee employee) {
	
		return employeeDao.addEmployee(employee);
	}

	public Employee getEmployee(int empID) {
		Employee employee =employeeDao.getEmployee(empID);
		return employee;
	}

	public List<Employee> getAllEmployee() {
		List<Employee> listOfEmployee =employeeDao.getAllEmployee();
		return listOfEmployee;
	}

}
