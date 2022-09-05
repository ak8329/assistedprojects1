package hpp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demotest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();		// Connection con;
		Session se = sf.openSession();	
		Transaction tran=se.getTransaction();
		//Trainer t=new Trainer();
		//t.setTid(102);
		//t.setTname("akr");
		//tran.begin();
		 //se.save(t);
		 //tran.commit();
		 //System.out.println("good");
		//Student s=new Student();
		//s.setRid(3);
		//s.setName("fkljn");
		//s.setAge(14);
		//tran.begin();
		// se.save(s);
		// tran.commit();
	 // Course i=new Course();
	 // i.setCname("java");
	 // i.setFee(35000);
	  Student s=se.get(Student.class,1);
	  if(s==null)
		  System.out.print("hoofss");
	  else 
		tran.begin();
	      s.setTsid(104);
	      se.update(s);
		  tran.commit();
		  
		   System.out.print("hoofss");
		
		

	}

}
