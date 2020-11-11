package school.management.system;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		/*
		 *Creates new Teacher Objects with:
		 *Id, name, & salary parameters.
		 */
		
		Teacher mary = new Teacher(1, "Mary", 500);
		Teacher kofi = new Teacher(1, "Kofi", 520);
		Teacher jane = new Teacher(1, "Jane", 900);
		
		/*
		 * Creates an ArrayList of teachers called teacherlist
		 * & adds the created teacher objects to it
		 * 
		 */
		
		List<Teacher> teacherlist = new ArrayList<>();
		teacherlist.add(mary);
		teacherlist.add(kofi);
		teacherlist.add(jane);
		
		/*
		 *Creates new Student Objects with:
		 *Id, name, & grade parameters.
		 *
		 */
		
		Student yaw = new Student(1, "Yaw", 6);
		Student ebenezer = new Student(2, "Ebenezer", 12);
		Student mimi = new Student(3, "Mimi", 11);
		
		/*
		 * 
		 * Creates an ArrayList of students called studentlist.
		 * & adds the created student objects to it.
		 * 
		 */
		
		List<Student> studentlist = new ArrayList<>();
		studentlist.add(yaw);
		studentlist.add(ebenezer);
		studentlist.add(mimi);
		
		School ghs = new School(teacherlist, studentlist);
		System.out.println("GHS has earned: " + ghs.getTotalMoneyEarned());
		
		yaw.payFees(10000);
		ebenezer.payFees(2000);
		System.out.println("GHS has earned: " + ghs.getTotalMoneyEarned());
		
		System.out.println("----MAKING GHS SCHOOL PAY SALARY----");
		mary.receiveSalary(mary.getSalary());
		System.out.println("GHS has spent " + ghs.getTotalMoneySpent() + " on " + mary.getName()
		+ " and now has " + ghs.getTotalMoneyEarned());
		
		
		}
	}



