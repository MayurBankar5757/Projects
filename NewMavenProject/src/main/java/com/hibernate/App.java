package com.hibernate;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
	    Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
	    Session session = factory.openSession();
	    Transaction tx = session.beginTransaction(); // Start a transaction

	    // Uncomment the lines below to save new Student and Person objects
	    /*
	    Student st = new Student(1, "Amol", "Pune", 23);
	    session.save(st);
	    Student st1 = new Student(2, "Onkar", "Pune", 22);
	    session.save(st1);
	    Student st2 = new Student(3, "Rohan", "Pune", 22);
	    session.save(st2);
	    Person p1 = new Person("ABC", 22, new Date(), 45000);
	    session.save(p1);
	    */

	    Person p3 = new Person("ABcd", 23, new Date(), 45000);
	    session.save(p3);
	    Student st = session.load(Student.class, 3);
	    st.setAge(22);
	    st.setCity("pune");
	    st.setStud_name("Onkar");
	    session.update(st);
	    Student st1 = new Student(2,"Rohan","Pune",22);
	    session.save(st1);
	    tx.commit(); // Commit the transaction
	    session.close(); // Close the session
	    factory.close(); // Close the session factory

	    System.out.println("Process Done.....");
	}

}
