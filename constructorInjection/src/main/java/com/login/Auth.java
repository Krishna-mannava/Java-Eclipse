package com.login;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
public class Auth{


	  
 
	public static void main(String[] args) {  
		Scanner sc=new Scanner(System.in);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Login login =(Login)applicationContext.getBean("auth");  
	    String user=sc.next();
	    String pwd=sc.next();
	    login.validate(user,pwd);  
	}  
	}  

