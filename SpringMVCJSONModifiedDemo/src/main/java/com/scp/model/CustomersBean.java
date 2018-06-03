package com.scp.model;

public class CustomersBean {
	
	private int customerID;
	private String customerName;
	private String address;
	private String city;
	private String country;
	private int postalCode;
	
	
	
	public CustomersBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomersBean(int customerID, String customerName, String address, String city, String country, int postalCode) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.address = address;
		this.city = city;
		this.country = country;
		this.postalCode = postalCode;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
	
	

}
