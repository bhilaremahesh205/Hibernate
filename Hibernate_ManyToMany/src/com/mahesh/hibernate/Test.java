package com.mahesh.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class Test {

	public static void main(String[] args) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Categories c1= new Categories();
		c1.setCategoryName("MI");
		Categories c2 = new Categories();
		c2.setCategoryName("Samsung");
		
		Item i1 = new Item();
		i1.setItemName("Mobile");
		
		Item i2 = new Item();
		i2.setItemName("Laptop");
		
		Set s = new HashSet();
		s.add(i1);
		s.add(i2);
		
		c1.setItems(s);
		c2.setItems(s);
		
		session.save(c1);
		session.save(c2);
		
		transaction.commit();
		session.close();
		
		System.out.println("many to many done succssfull");
		
		
	
	}

}
