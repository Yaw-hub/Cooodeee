package school.management.system;
/**
 * This class is responsible for keeping track 
 * of teachers name, id, & salary
 * @author yawos
 *
 */

public class Teacher {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	/**
	 * Creates new Teacher Object
	 * @param id of the teacher: Unique.
	 * @param name of the teacher.
	 * @param salary of the teacher.
	 */
	public Teacher (int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		salaryEarned = 0;
	}
	
	/**
	 *@return Id of teacher
	 */
	
	public int getId() {
		return id;
	}
	
	/**
	 * @return name of teacher
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * @return the salary
	 */
	
	public int getSalary() {
		return salary;
	}
	
	/**
	 * Sets the salary of the teacher
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	/**
	 * Adds to the salary.
	 * Removes from the total money earned by the school.
	 * @param salary
	 */
	public void receiveSalary(int salary) {
		salaryEarned += salary;
		School.updateTotalMoneySpent(salary);
	}
	
	
}
