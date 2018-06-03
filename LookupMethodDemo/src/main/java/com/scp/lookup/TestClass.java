package com.scp.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
		
	public static void main(String[] args) {
		
		
		
		/**
		 * 	Singleton - Singleton
		 *    changes are reflected in both beans.
		 *     Prototype - Singleton  - changes are reflected in only Singleton bean 
		 *   Singleton - Prototype   ->  here we need to go for lookup method cause (method Injection)
		 *   				problem - changes made in prototype bean get reflected we we call get bean method
		 *   						which is not expected behaviour for prototype scope bean
		 *   				solution - to overcome this problem we need to go for LookUp method or also called as Method Injection
		 * 
		 * 
		 * */
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Before Modifying");
		Employee employee =(Employee) applicationContext.getBean("emp");
		
		System.out.println(employee);
		System.out.println("After Modifying");
		employee.setEmpName("Amit");
		
		
		System.out.println();
		
	}
}
