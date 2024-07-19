package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OnetooneMain {
	public static void main(String []args) {

    Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory factory = cfg.buildSessionFactory();
    Session session = factory.openSession();
    Transaction tx = session.beginTransaction();
    Question q1 = new Question();
    q1.setQid(1);
    q1.setQuestion("What is java");
    
    Question q2 = new Question();
    q2.setQid(2);
    q2.setQuestion("What is hibernate ");

    
    Answer a1 = new Answer();
    a1.setAid(123);
    a1.setAnswer("Java is a Prgramming Language");
    
    Answer a2 = new Answer();
    a2.setAid(124);
    a2.setAnswer("Hibernate is a orm tool");
    
    q1.setAns(a1);
    q2.setAns(a2);
    a1.setQues(q1);
    a2.setQues(q2);
    
    session.save(a2);
    session.save(a1);
    session.save(q1);
    session.save(q2);
    tx.commit();
    session.close();
    factory.close();
}
}
