package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FacultyMain {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(FacultySubject.class);
		cfg.addAnnotatedClass(Faculty.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Faculty f = new Faculty("Onkar");

		FacultySubject sub = new FacultySubject(" Java");
		FacultySubject sub1 = new FacultySubject("JavaScript");
		ArrayList<FacultySubject>s = new ArrayList<>();
		s.add(sub1);
		s.add(sub);
		f.setSub(s);
		session.save(f);
//		Faculty f = new Faculty(13,"Onkar");
//		Faculty f1 = new Faculty(16,"Onkar");
//
//		FacultySubject sub = new FacultySubject(14,"Core Java");
//		FacultySubject sub1 = new FacultySubject(15,"Advanced Java");
//		FacultySubject sub3 = new FacultySubject(18,"Advanced Java");
		// for getting values in hibernate
//		FacultySubject sub2 = session.get(FacultySubject.class, 17);
	
//		session.delete(sub2);
//		session.delete(sub1);
//		
//		session.delete(f);
//		session.delete(f1);
//		session.delete(sub);
//		session.delete(sub3);

		tx.commit();

	}

}
