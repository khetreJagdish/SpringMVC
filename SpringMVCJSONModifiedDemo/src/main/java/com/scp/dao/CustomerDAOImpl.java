package com.scp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scp.entity.CustomersEntity;
import com.scp.model.CustomersBean;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	
	@Autowired
	 SessionFactory sessionFactory;
	
	public CustomerDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	static {
		
		System.out.println("Inside CustomerDAOImpl");
	}
	
	public CustomerDAOImpl(SessionFactory sessionFactory) {
				this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public boolean addCustomer(CustomersEntity customerEntity) {
		
		Session session =sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(customerEntity);
		session.flush();
		tr.commit();
		session.close();
		return true;
		
		
	}
	
	
	@Override
	@Transactional
	public List<CustomersEntity> getListOfCustomers() {
		Session session =sessionFactory.openSession();
		List<CustomersEntity> listOfCustomersEntities = session.createQuery("from CustomersEntity").list();
		session.close();
		return listOfCustomersEntities;
	}

	@Override
	public void deleteCustomer(int id) {
		
		Session session = sessionFactory.openSession();
		List<CustomersEntity> listOfCustomersEntities = session.createQuery("from CustomersEntity").list();
		for(CustomersEntity customersEntity: listOfCustomersEntities) {
			if(customersEntity.getCustomerID() == id) {
			session.delete(customersEntity);
			break;
			}
		}
	}
	

}
