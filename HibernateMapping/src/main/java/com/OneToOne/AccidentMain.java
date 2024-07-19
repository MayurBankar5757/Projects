package com.OneToOne;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AccidentMain {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Car.class);
	cfg.addAnnotatedClass(Accident.class);
	SessionFactory s= cfg.buildSessionFactory();
	Session sess=s.openSession();
	Transaction t=sess.beginTransaction();

	Car c=new Car("Kia");
	Accident a=new Accident("Pune");
	c.setA(a);
	
	sess.save(c);
	t.commit();
	
}
}
