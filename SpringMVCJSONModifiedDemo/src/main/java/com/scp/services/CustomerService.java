package com.scp.services;

import java.util.List;

import com.scp.model.CustomersBean;

public interface CustomerService {
	
			public boolean addCustomer(CustomersBean customer);
			public List<CustomersBean> getListOfCustomers();
			public void deleteCustomer(int id);

}
