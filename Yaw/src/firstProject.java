
public class firstProject {
	public static void main(String[] args) {
		secondProject second = new secondProject();
		System.out.println(second.toMilTime());
		System.out.println(second.toRegTime());
		
		second.setTime(13, 27, 6);
		System.out.println(second.toMilTime());
		System.out.println(second.toRegTime());
	}
}
