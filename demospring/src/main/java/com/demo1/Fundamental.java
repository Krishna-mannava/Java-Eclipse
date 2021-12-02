package com.demo1;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
public class Fundamental {


	  
 
	public static void main(String[] args) {  
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	    Student student=(Student)applicationContext.getBean("studentbean");  
	    student.displayInfo();  
	}  
	}  



