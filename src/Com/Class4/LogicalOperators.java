package Com.Class4;

public class LogicalOperators {

	public static void main(String[] args) {
		/*
		 * if number is b/w 1-10 --> number is small if number is b/w 11-100 --> number
		 * is medium if number is b/w 101-1000 --> number is large
		 */

		int num = 15;
		// true And False --> False
		if (num >= 1 && num <= 10) {
			System.out.println("number is small");
			// true And true --> True
		} else if (num >= 11 && num <= 100) {
			System.out.println("number is medium");
			// false And true --> False
		} else if (num >= 101 && num <= 1000) {
			System.out.println("number is large");
		} else {
			System.out.println("number is not in range");
		}
	}

}
