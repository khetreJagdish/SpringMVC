package com.scp.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scp.dao.EmployeeDao;
import com.scp.model.Employee;

@Service
public class EmployeeDaoImpl  implements EmployeeDao{

	@Autowired
	SessionFactory sessionFactory;
	
	
	public String addEmployee(Employee employee) {
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	session.save(employee);
	session.flush();
	transaction.commit();
	session.close();
	return null;
	}

	

}
