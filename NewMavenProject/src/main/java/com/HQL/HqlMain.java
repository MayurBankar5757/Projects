package com.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HqlMain {
	public static void main(String []args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
//        String query = "from Bank ";

//		String query = "from Bank where bankName=:x";
//		String query = "from Bank where bal>=:y and bankName=:x";
//		String query = "delete from Bank where acc_no=:p";
//		String query = "from Bank where custName>=:y and acc_no=:x";
        
        String query = "update from Bank set custName=:z where acc_no=:p ";

		
		
		
		Query q = session.createQuery(query);
//		q.setParameter("x",3);
//		q.setParameter("y", "HDFC");
		q.setParameter("p",4);
		q.setParameter("z","John");
		int count = q.executeUpdate();
		System.out.println(count +"  Records are updated");
//		q.setParameter("x", "BOI");
//		q.setParameter("y", 50000);
//		List <Bank>list = q.list();
//		
//		for(Bank i:list) {
//			System.out.println(i.getAcc_no()+" "+ i.getAcc_type()+" "+ i.getBankName());
//		}
		tx.commit();
//		
		factory.close();
		session.close();
		

		
		
	}
	}