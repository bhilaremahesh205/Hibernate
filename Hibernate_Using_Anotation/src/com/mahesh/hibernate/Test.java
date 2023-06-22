package com.mahesh.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf =  cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee employee = new Employee();
		employee.setEmpId(121);
		employee.setEmpName("Mahesh Bhilare");
		employee.setEmpSalary("45000");
		employee.setEmpAddress("mahabaleshwar");
		
		
		Employee employee2 = new Employee();
		employee2.setEmpId(1121);
		employee2.setEmpName("Manish Bhilare");
		employee2.setEmpSalary("4000");
		employee2.setEmpAddress("pune");
		
		
		Employee employee3 = new Employee();
		employee3.setEmpId(1111);
		employee3.setEmpName("Manish Bhilare");
		employee3.setEmpSalary("40000");
		employee3.setEmpAddress("satara");
		
		session.save(employee);
		session.save(employee2);
		session.save(employee3);
		
		
		transaction.commit();
		session.close();
		
		System.out.println("inserted successfully");
		
		
	}

}
