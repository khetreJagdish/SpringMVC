package com.scp.dao;

import java.util.List;

import com.scp.entity.CustomersEntity;

public interface CustomerDAO {
	
	public boolean addCustomer(CustomersEntity customerEntity);
	public List<CustomersEntity> getListOfCustomers();
	public void deleteCustomer(int id);

}
