package com.scp.thread;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		PrintThread printThread1 = (PrintThread) applicationContext.getBean("printThread");
		printThread1.setName("PrintThread 1");
		
		PrintThread printThread2 = (PrintThread) applicationContext.getBean("printThread");
		printThread1.setName("PrintThread 2");
		
		PrintThread printThread3 = (PrintThread) applicationContext.getBean("printThread");
		printThread1.setName("PrintThread 3");
		
		PrintThread printThread4 = (PrintThread) applicationContext.getBean("printThread");
		printThread1.setName("PrintThread 4");
		
		PrintThread printThread5 = (PrintThread) applicationContext.getBean("printThread");
		printThread1.setName("PrintThread 5");
		
		printThread1.start();
		printThread2.start();
		printThread3.start();
		printThread4.start();
		printThread5.start();
	}
}
