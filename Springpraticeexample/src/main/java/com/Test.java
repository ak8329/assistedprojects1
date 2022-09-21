package com;

import org.apache.naming.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

 public class Test {

	public static void main(String[] args) {
		
		//Employee emp1 = new Employee();
		//emp1.display();

		Resource rs = new ClassPathResource("beans.xml");  // loadin the xml file
		BeanFactory bb = new BeanFactory();
	    Question q2=(Question)bb.getBean("q1");  
	    q2.displayInfo();  
	      
		
	}
	}