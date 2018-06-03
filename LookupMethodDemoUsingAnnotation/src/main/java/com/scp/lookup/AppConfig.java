package com.scp.lookup;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean
	public MyPrototypeBean prototypeBean() {
		
		return new MyPrototypeBean();
	}
	
	@Bean
	public MySingletonBean singletonBean() {
		return new MySingletonBean();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MySingletonBean mySingletonBean =context.getBean(MySingletonBean.class);
		mySingletonBean.showMessage();
		
		Thread.sleep(2000);
		
		mySingletonBean = context.getBean(MySingletonBean.class);
		mySingletonBean.showMessage();
	}
	
}
