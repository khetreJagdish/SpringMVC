package com.scp.configure;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages={"com.scp"})
public class WebConfigure  extends WebMvcConfigurerAdapter{
	
	static {
		System.out.println("Inside WebConfigure Addapter");
		
	}
	
		
	public WebConfigure() {
		super();
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
			
		configurer.enable();
	}
	
	
	@Bean
    public InternalResourceViewResolver jspViewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setPrefix("/WEB-INF/");
        bean.setSuffix(".jsp");
        return bean;
    }
	
	@Bean(name = "messageSource")
    public ReloadableResourceBundleMessageSource getMessageSource() {
        ReloadableResourceBundleMessageSource resource = new ReloadableResourceBundleMessageSource();
        resource.setBasename("classpath:messages");
        resource.setDefaultEncoding("UTF-8");
        return resource;
    }
	
	
/*	@Bean(name = "dataSource")
	public DataSource getDataSource() {
	    BasicDataSource dataSource = new BasicDataSource();
	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/usersdb");
	    dataSource.setUsername("root");
	    dataSource.setPassword("secret");
	 
	    return dataSource;
	}*/
	
	@Bean(name = "dataSource")
    public DataSource getDataSource() {
 
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername("system");
        dataSource.setPassword("root");
        dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        return dataSource;
    }
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
	    LocalSessionFactoryBean localSessionFactroy = new LocalSessionFactoryBean();
	    localSessionFactroy.setDataSource(getDataSource());
	    localSessionFactroy.setPackagesToScan(new String[] {"com.scp.entity"});
	    localSessionFactroy.setHibernateProperties(getHibernateProperties());
	    return localSessionFactroy;
	}
	
/*	private Properties getHibernateProperties() {
	    Properties properties = new Properties();
	    properties.put("hibernate.show_sql", "true");
	    properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
	    return properties;
	}*/
	
	private Properties getHibernateProperties() {
	    Properties properties = new Properties();
	    properties.put("hibernate.show_sql", "true");
	    properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle9Dialect");
	    properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
	    return properties;
	}
	
	
}
