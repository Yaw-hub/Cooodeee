package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		
		// create a session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			// start a transaction
			session.beginTransaction();
			
			// query students
			List<Student> theStudents = session.createQuery("from Student").getResultList();
					
			// display the students
			displayStudents(theStudents);
			
			// query student lastname = "Doe"
			theStudents = session.createQuery("from Student s where s.lastName='Doe'").getResultList();
			
			// display the student
			System.out.println("\n\nStudents who have the last name of Doe");
			displayStudents(theStudents);
			
			// query students: lastName = 'Doe' OR firstName='Daffy'
			theStudents = 
					session.createQuery("from Student s where s.lastName ='Doe' "
							+ "OR s.firstName='Daffy'").getResultList();
			
			// display the student
			System.out.println("\n\nStudents who have the last name of Doe OR first name Daffy");
			displayStudents(theStudents);
			
			// query students where email LIKE '%luv2code.com'
			theStudents = 
					session.createQuery("from Student s "
							+ "where s.email LIKE '%gmail.com'").getResultList();
			
			// display the student
			System.out.println("\n\nStudents who have email like gmail.com");
			displayStudents(theStudents);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!!!");
		}
		finally {
			factory.close();
		}

	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

}
