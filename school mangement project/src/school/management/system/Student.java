package school.management.system;
/**
 * @author yawos
 * This class is responsible for 
 * Tracking Students, fees, Id, name, & fees
 * 
 */
public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/**
	 * To create a new Student object by initializing:
	 * fees for every Student is $20,000 a year.
	 * fees paid initially is 0.
	 * @param id for Student: unique
	 * @param name of Student
	 * @param grade of Student
	 */
	public Student(int id, String name, int grade) {
		feesPaid = 0;
		this.feesTotal = 20000;
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	//Not going to alter student's name, students id.
	
	/**
	 * 
	 * @param grade new grade of the student
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	/**
	 * Keep adding the fees to feesPaid field
	 * Add the fees to the fees paid
	 * The school is going to receive the funds
	 * 
	 * @param fees that the student pays
	 */
	
	public void payFees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}
	
	/**
	 * @returns student Id
	 */
	
	public int getId() {
		return id;
	}
	
	/**
	 * @returns student name
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * @return student grade
	 */
	
	public int getGrade() {
		return grade;
	}
	
	/**
	 * @return student fees paid
	 */
	
	public int getfeesPaid() {
		return feesPaid;
	}
	
	/**
	 * @return student total fees
	 */
	
	public int getfeesTotal() {
		return feesTotal;
	}
	/**
	 * 
	 * @return the remaining fees
	 */
	public int getRemainingFees() {
		return feesTotal - feesPaid;
	}
	
}
