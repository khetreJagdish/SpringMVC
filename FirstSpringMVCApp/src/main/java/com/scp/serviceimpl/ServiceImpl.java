package com.scp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scp.dao.EmployeeDao;
import com.scp.model.Employee;
import com.scp.service.Services;

@Service
public class ServiceImpl implements Services{

	@Autowired
	EmployeeDao employeeDao;
	
	public boolean addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
		return true;
	}


	
	

}
