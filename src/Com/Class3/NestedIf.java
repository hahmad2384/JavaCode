package Com.Class3;

public class NestedIf {
	/*
	 * declare variables for gpa and having a diploma if user has a diploma - ->
	 * congratulations - -> if gpa is higher than 3.5 -> hire person else don't hire
	 * 
	 */
	public static void main(String[] args) {

		double gpa = 3.6;
		double expectedgpa = 3.5;

		boolean hasDiploma = true;
		if (hasDiploma) {
			System.out.println("Congrats");
			if (gpa > expectedgpa) {
				System.out.println("You are hired");
			} else {
				System.out.println("We can't hire you");
			}

		} else {
			System.out.println("Get your degree first");

		}
	}

}
