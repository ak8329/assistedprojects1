package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class demo {
public static void main(String[] args)
{
	Configuration con = new Configuration();
	con.configure("hibernate.cfg.xml");				// load the xml file
	SessionFactory sf = con.buildSessionFactory();		// Connection con;
	Session se = sf.openSession();	
	Transaction tran=se.getTransaction();
	Question q=new Question();
	Question q1 = new Question();
	q.setQid(4);
	q.setQuestion("What is sastra");
	String ans[]= {"sas is clg","bike is school","sas is dependent","sas is safe"};
	q.setAnswers(ans);
	q.setCorrectAnswer("sas is v");
	
	tran.begin();
		se.save(q);
	tran.commit();
	System.out.println("Stored");
	
	
	}
}
