package com.scp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scp.dao.CustomerDAO;
import com.scp.entity.CustomersEntity;
import com.scp.model.CustomersBean;
@Service
public class CustomerServicesImpl implements CustomerService {

		@Autowired
		CustomerDAO customerDAO;
		
		
		static {
			
			System.out.println("Inside CustomerServiceImpl");
		}
		
		
public CustomerServicesImpl() {
			super();
			// TODO Auto-generated constructor stub
		}

@Override
public boolean addCustomer(CustomersBean customer) {
	
	return customerDAO.addCustomer(processBeanToEntity(customer));
	
}

@Override
public List<CustomersBean> getListOfCustomers() {
	
	
	return processEntitiesToBeans(customerDAO.getListOfCustomers());
}

public static CustomersEntity processBeanToEntity(CustomersBean customersBean){
	CustomersEntity customersEntity = new CustomersEntity();
	customersEntity.setCustomerName(customersBean.getCustomerName());
	customersEntity.setAddress(customersBean.getAddress());
	customersEntity.setCity(customersBean.getCity());
	customersEntity.setCountry(customersBean.getCountry());
	customersEntity.setPostalCode(customersBean.getPostalCode());
	customersEntity.setCustomerID(customersBean.getCustomerID());
	return customersEntity;
}



public static CustomersBean processEntityToBean(CustomersEntity customersEntity) {
	CustomersBean customersBean = new CustomersBean();
	customersBean.setCustomerName(customersEntity.getCustomerName());
	customersBean.setAddress(customersEntity.getAddress());
	customersBean.setCity(customersEntity.getCity());
	customersBean.setCountry(customersEntity.getCountry());
	customersBean.setPostalCode(customersEntity.getPostalCode());
	customersBean.setCustomerID(customersEntity.getCustomerID());
	return customersBean;
}

public static List<CustomersBean> processEntitiesToBeans(List<CustomersEntity> entities){
	CustomersBean customerBean =null;
	List<CustomersBean> listOfCustomers = new ArrayList<CustomersBean>();
	for (CustomersEntity customerEntity : entities) {
		customerBean = new CustomersBean();
		customerBean.setCustomerID(customerEntity.getCustomerID());
		customerBean.setCustomerName(customerEntity.getCustomerName());
		customerBean.setAddress(customerEntity.getAddress());
		customerBean.setCity(customerEntity.getCity());
		customerBean.setCountry(customerEntity.getCountry());
		customerBean.setPostalCode(customerEntity.getPostalCode());
		listOfCustomers.add(customerBean);
	}
		return listOfCustomers;
	}


public static List<CustomersEntity> processBeanToEntities(List<CustomersBean> entities){
	CustomersEntity customerBean =null;
	List<CustomersEntity> listOfCustomers = new ArrayList<CustomersEntity>();
	for (CustomersBean customerEntity : entities) {
		customerBean = new CustomersEntity();
		customerBean.setCustomerID(customerEntity.getCustomerID());
		customerBean.setCustomerName(customerEntity.getCustomerName());
		customerBean.setAddress(customerEntity.getAddress());
		customerBean.setCity(customerEntity.getCity());
		customerBean.setCountry(customerEntity.getCountry());
		customerBean.setPostalCode(customerEntity.getPostalCode());
		listOfCustomers.add(customerBean);
	}
		return listOfCustomers;
	}

@Override
public void deleteCustomer(int id) {
	
	customerDAO.deleteCustomer(id);
	
}

}
