package com.scp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scp.bean.Employee;

@Repository
public class EmployeeDaoImpl  implements EmployeeDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public Employee addEmployee(Employee employee) {
		Session session =sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		transaction.commit();
		session.close();
		return employee;
	}

	public Employee getEmployee(int empID) {
		Session session =sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = session.get(Employee.class, empID);
		transaction.commit();
		session.close();
		return employee;
	}

	public List<Employee> getAllEmployee() {
		Session session =sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Employee> listOfEmployee =session.createQuery("from Employee").list();
		transaction.commit();
		session.close();
		return listOfEmployee;
	}

}
