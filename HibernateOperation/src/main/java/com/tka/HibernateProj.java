package com.tka;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class HibernateProj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Emp.class);
		SessionFactory factory = cfg.buildSessionFactory();	
		Session session = factory.openSession();
		Criteria c = session.createCriteria(Emp.class);
		Projection p1 = Projections.property("empName");
		c.setProjection(p1);
		List<String> l= c.list();
		for(String e : l) {
			System.out.println(e);
		}
		System.out.println("More than One Column");
	
		Projection p2 = Projections.property("empSalary");
		ProjectionList p = Projections.projectionList();
		p.add(p1);
		p.add(p2);
		c.setProjection(p);
		List<Object[]> l1 = c.list();
		for(Object[] e:l1) {
			for(Object obj :e) {
				System.out.print(obj.toString()+" ");
			}
			System.out.println();
		}
		
		
	}

}
