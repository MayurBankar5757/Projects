package com.tka;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.cfg.Configuration;

public class HibernateCrud {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Emp.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Criteria c = session.createCriteria(Emp.class);
		
		// For Inserting Record
		Transaction tx = session.beginTransaction();
		Emp e = new Emp(5,"Mane",40000);
		session.saveOrUpdate(e);
//		
    // for Deleting Record
		 session.delete(e);
		// Select * from Emp
		 List <Emp>l = c.list();
			for(Emp i :l) {
				System.out.println(i);
			}
			
			tx.commit();
	}

}
