package com.tka;

import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HibernateQuery {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Emp.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
//		Query query = session.createQuery(" from Emp");
//		List<Emp>lt1 = query.list();
//		for(Emp s:lt1) {
//			System.out.println(s);
//		}
//		Query query1 = session.createQuery("from Emp where empSalary = :empSalary");
//		query1.setParameter("empSalary", 120000);
//		List<Emp>lt = query1.list();
//		for(Emp e : lt) {
//			System.out.println(e);
//		}
//		Query query1 = session.createQuery("from Emp where empSalary = :s");
//		query1.setParameter("s", 120000);
//		List<Emp>lt = query1.list();
//		for(Emp e : lt) {
//			System.out.println(e);
//		}
		Query query1 = session.createQuery("from Emp where empSalary between : s and : e");
		query1.setParameter("s",13000 );
		query1.setParameter("e", 120000);
		List<Emp>lt = query1.list();
		for(Emp e : lt) {
			System.out.println(e);
		}
		
		
		
		
		
	}

}
