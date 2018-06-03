package com.scp.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scp.employeeserviceImpl.EmployeeDaoImpl;
import com.scp.springdemo.Employee;

public class EmpMainApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDaoImpl empDao = (EmployeeDaoImpl) context.getBean("employeeDaoImpl");
		  
		  System.out.println("------Records Creation--------" );
		  empDao.create("Dinesh", 25, 50000l);
		  empDao.create("Anamika", 23, 30000l);
		  empDao.create("Nimmo", 24, 30020l);
		  empDao.create("Adesh", 24, 30011l);
		  empDao.create("Vinesh", 22, 20011l);
		  
		  System.out.println("------Listing Multiple Records--------" );
		  List<Employee> employees = empDao.listEmployees();
		  for (Employee employee : employees) {
		          System.out.print(employee);
		     }
		  
		  System.out.println("----Updating Record with EMPID = 2 -----" );
		  empDao.update(2, 20);
		  
		  System.out.println("----Listing Record with ID = 2 -----" );
		  Employee employee = empDao.getEmployee(2);
		  System.out.print(employee);
		 }
}
