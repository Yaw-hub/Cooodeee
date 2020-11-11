package school.management.system;
import java.util.List;

/**
 * 
 * School can have many Teachers, Students.
 * @author yawos.
 * 
 */

public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	/**
	 * @param teachers List of teachers in the school.
	 * @param students List of students in the school.
	 */
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}
	
	/**
	 * @returns list of teachers in the school.
	 */
	
	public List<Teacher> getTeachers() {
		return teachers;
	}
	
	/**
	 * Adds a teacher to the school.
	 * @param teacher adds the teacher to be added.
	 */
	
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	
	/**
	 *@returns list of Students. 
	 */
	
	public List<Student> getStudents() {
		return students;
	}
	
	/**
	 *Adds a Student to the school.
	 *@param teacher adds the student to be added. 
	 */
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	/**
	 *@returns Total money earned by the school 
	 */
	
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
	/**
	 * 
	 *updates totalMoneyMoneyEarned 
	 *
	 */
	
	public static void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}
	
	/**
	 * 
	 *@returns total money spent by the school
	 *
	 */
	
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	
	/**
	 * updates total money spent by the school which. 
	 * is the salary given by the school to its teachers.
	 * @param moneySpent the money spent by school.
	 */
	
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned -= moneySpent;
	}
	
}
