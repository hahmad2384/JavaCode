package Com.Class17;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create a method that will take a number and prints whether the number is even
		 * or odd
		 */

		Task1 num = new Task1();
		num.evenOrOdd(2);
	}

	void evenOrOdd(int number) {
		if (number % 2 == 0) {
			System.out.println("It is even");
		} else {
			System.out.println("It is odd");
		}
	}

}
