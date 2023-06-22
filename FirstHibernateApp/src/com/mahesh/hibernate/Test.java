package com.mahesh.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = new Employee();
		employee.setName("Mahesh");
		employee.setSalary(45000);
		employee.setAddress("Mahabaleshwar");
		session.save(employee);
		transaction.commit();
		session.close();
		System.out.println("Inserted successfully");
		
		
		

	}

}
