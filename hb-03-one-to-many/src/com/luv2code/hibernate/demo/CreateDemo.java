package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {
		
		// create a session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			/*
			// create the objects 
			Instructor tempInstructor = 
					new Instructor("Charles", "Darby", "darby@luv2code.com");
			
			InstructorDetail tempInstructorDetail = 
					new InstructorDetail(
							"http://www.youtube.com/youtube", 
							"Luv 2 code!!!");
			*/
			Instructor tempInstructor = 
					new Instructor("Madhu", "Partel", "madhu@luv2code.com");
			
			InstructorDetail tempInstructorDetail = 
					new InstructorDetail(
							"http://www.youtube.com", 
							"Guitar");
			
			// associate the objects 
			tempInstructor.setInstructorDetail(tempInstructorDetail);
		
			// start a transaction
			session.beginTransaction();
			
			// save the instructor
			//
			// Note: this will also save details object 
			// because of cascadeType.ALL
			//
			System.out.println("Saving intructor: " + tempInstructor);
			session.save(tempInstructor);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!!");
		}
		finally {
			factory.close();
		}

	}

}
