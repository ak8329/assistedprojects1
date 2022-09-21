package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) 
	{
//	ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("p.xml");
//	address a=(address)ac.getBean("address");
//		System.out.println(a);
//		emp r=(emp)ac.getBean("emp");
//		System.out.println(r);
//	System.out.println("from key board\n");
//     a.setCity("kanigiri");
//     a.setState("andhra");
//     r.setAdd(a);
//     r.setId(200);
//     r.setName("krishna");
//     r.setSalary(2000);
//     System.out.println(a);
//     System.out.println(r);
//	
		//Enable using config class
		AnnotationConfigApplicationContext p=new AnnotationConfigApplicationContext(Myconfig.class);
		address a=(address)p.getBean("address");
		System.out.println(a);
		emp r=(emp)p.getBean("emp");
		System.out.println(r);
		emp r2=(emp)p.getBean("emp");
		System.out.println(r2);
		Product y=(Product)p.getBean("pp");
	  y.produtinf0();
	}

}
