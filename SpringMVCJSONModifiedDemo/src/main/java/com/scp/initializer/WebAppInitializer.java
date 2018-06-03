 package com.scp.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.scp.configure.WebConfigure;

public class WebAppInitializer implements WebApplicationInitializer{
	
	static{
		System.out.println("inside WebAppInitializer");
	}
	
	
    public WebAppInitializer() {
		super();
	}


	public void onStartup(ServletContext container) {
        AnnotationConfigWebApplicationContext dispatcherServlet = new AnnotationConfigWebApplicationContext();
        dispatcherServlet.register(WebConfigure.class);
        // Register and map the dispatcher servlet
        ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(dispatcherServlet));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
         
    }

}
