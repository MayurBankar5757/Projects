package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QuesAnsMain {
	
	public static void main(String[]args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Question1 q1 = new Question1();
		q1.setQid(1);
		q1.setQuestion("What is java");
		
		Answer1 a1 = new Answer1();
		a1.setAid(123);
		a1.setAnswer("Java is a Programming Language");
		Answer1 a2 = new Answer1();
		a2.setAid(124);
		a2.setAnswer("Java is platform Independent Language");
		
		Answer1 a3 = new Answer1();
		a3.setAid(125);
		a3.setAnswer("Java is a robust and secure language");
		
		List <Answer1> list = new ArrayList<>();
		list.add(a3);
		list.add(a2);
		list.add(a1);
		
		q1.setAns(list);
		a1.setQues(q1);
		a2.setQues(q1);
		a3.setQues(q1);
		
		session.save(q1);
		session.save(a1);
		session.save(a2);
		session.save(a3);

		
		tx.commit();
		session.close();
		factory.close();


		
		
		
		
		
		
	}
}
