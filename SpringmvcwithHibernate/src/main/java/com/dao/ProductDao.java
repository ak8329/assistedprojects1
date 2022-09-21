package com.dao;

import java.util.List;


import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.products;

@Repository
public class ProductDao {

	@Autowired
	SessionFactory sf;				// DI from spring configuration file with help of LocalSessionFactoryBean
	
	public int storeproduct(products ps) {
		try {
			//Configuration con = new Configuration();
			//con.configure("hibernate.cfg.xml");
			//SessionFactory sf = con.buildSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
						session.save(ps);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	public int deleteproduct(int pid) {
		
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			products ps=session.get(products.class,pid);
			if(ps==null)
				return 0;
			else
			tran.begin();
						session.delete(ps);
			tran.commit();
			return 1;
		
	}
	public int updateProduct(products product) {
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		products p = session.get(products.class, product.getPid());
		if(p==null) {
			return 0;
		}else {
			tran.begin();
				p.setPrice(product.getPrice());
				p.setUrl(product.getUrl());
				session.update(p);
			tran.commit();
			return 1;
		}
	}

	public products searchProductById(int pid) {
		Session session = sf.openSession();
		products p = session.get(products.class, pid);
		return p;
	}

	public List<products> getAllProduct() {
		Session session = sf.openSession();
		TypedQuery qry = session.createQuery("select p from products p");
		List<products> listOfProduct = qry.getResultList();
		return listOfProduct;
	}
	
	
}	
