package Com.Class5;

import java.util.Scanner;

public class LogicalOperators1 {

	public static void main(String[] args) {
		boolean isFalse;
		String result;

		Scanner scan = new Scanner(System.in);
		System.out.println("Is it weekend?");
		isFalse = scan.nextBoolean();

		if (!false) {
			result = "Manual testing";

		} else {
			result = "Java";
		}
		System.out.println("Today you will be learning " + result);

	}

}
