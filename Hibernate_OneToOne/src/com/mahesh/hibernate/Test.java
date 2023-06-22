package com.mahesh.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction transaction = session.beginTransaction();
		Employee emp = new Employee();
    	emp.setName("Mahesh");
		emp.setSalary(45000);
		
		
		Address address = new Address();
		address.setCity("Mahabaleshwar");
		address.setState("Maharashtra");
		address.setCountry("India");
		
		
		address.setEmployee(emp);
		emp.setAddress(address);
		
		session.save(emp);
		transaction.commit();
		session.close();
		
		System.out.println("one to one done successful");
		
	}

}
