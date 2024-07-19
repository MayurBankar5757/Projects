package com.criteria;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class CriteriaMain {
	public static void main(String[]args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Criteria c = session.createCriteria(Item.class);
//		c.add(Restrictions.between("qty",100,300));
//		c.add(Restrictions.gt("qty",50));
//		c.add(Restrictions.like("itemName","C%"));
//		c.add(Restrictions.ilike("itemName","C%"));  case-sensitive
//		c.add(Restrictions.eq("itemName","Mouse"));
//		c.add(Restrictions.ne("category","Furniture"));
//		c.add(Restrictions.lt("qty",100));
//		c.add(Restrictions.isNull("itemName"));
		
		// pagination
		c.setFirstResult(1);
		c.setMaxResults(9);
		
		







		List<Item> l = c.list();
		
		for(Item i : l) {
			System.out.println(i.getItemId() + " " + i.getQty()+" "+ i.getItemName());
		}
		
		tx.commit();
		session.close();
		factory.close();
		
		
	}


}
