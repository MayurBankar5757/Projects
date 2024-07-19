package com.tka;
import com.tka.Emp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class HibernateOp {
	public static void main(String[]args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory fac = cfg.buildSessionFactory();
		Session session = fac.openSession();
		Criteria c = session.createCriteria(Emp.class);
		// Select * from Emp
		List <Emp>l = c.list();
		for(Emp i :l) {
			System.out.println(i);
		}
		// to add condition ie. eName = Sanket
		System.out.println("Conditions added");
		c.add(Restrictions.eq("empName","Sanket"));
//     	c.add(Restrictions.eq("empId", l));
		l = c.list();
		for(Emp i:l) {
			System.out.println(i);
		}
		
		
		
		
		}

}