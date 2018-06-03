package com.scp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	static SessionFactory sessionFactory;
	
	public  static SessionFactory getSesssionFactory() {
		
		if(null ==sessionFactory ) {
			sessionFactory =new Configuration().configure().buildSessionFactory();
			return sessionFactory;
			
		}
		
		
		return sessionFactory;
	}

}
