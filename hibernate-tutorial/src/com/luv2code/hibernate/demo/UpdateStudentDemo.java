package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		
		// create a session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			int studentId = 1;
			
			// get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve student based on the id: primary key
			System.out.println("\nGetting student with id: " + studentId);
			
			Student myStudent = session.get(Student.class, studentId);
			myStudent.setFirstName("Scooby");
			System.out.println("Updating student...");
			
			// commit transaction
			session.getTransaction().commit();
			
			// NEW CODE
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// update email for all students 
			System.out.println("Updating email for all students");
			
			session.createQuery("update Student set email='foo@gmail.com'")
				.executeUpdate();
			
			// commit transaction
			session.getTransaction().commit();
			
			
			System.out.println("Done!!");
			
		}
		finally {
			factory.close();
		}

	}

}
