package com.scp.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scp.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO{

	@Autowired
	private SessionFactory sessionFactory;
	public void addEmployee(Employee employee) {
		sessionFactory.getCurrentSession().saveOrUpdate(employee);
		
	}

	public List<Employee> getAllEmployees() {
		
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}

	public void deleteEmployee(Integer employeeId) {
		Employee employee = (Employee) sessionFactory.getCurrentSession().load(
                Employee.class, employeeId);
        if (null != employee) {
            this.sessionFactory.getCurrentSession().delete(employee);
        }
		
	}

	public Employee updateEmployee(Employee employee) {
		 sessionFactory.getCurrentSession().update(employee);
	        return employee;
	}

	public Employee getEmployee(int employeeid) {
		 return (Employee) sessionFactory.getCurrentSession().get(
	                Employee.class, employeeid);
	}
	
	
	
}
