package com.scp.lookup;

public class Employee {
	
	Address address;
	
	int empId;
	String empName;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + ", empId=" + empId + ", empName=" + empName + "]";
	}
	
	
}
