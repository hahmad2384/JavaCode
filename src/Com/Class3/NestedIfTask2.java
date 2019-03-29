package Com.Class3;

import java.util.Scanner;

public class NestedIfTask2 {

	public static void main(String[] args) {

		int years;
		double salary;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of years worked");

		years = input.nextInt();

		System.out.println("Enter Annual Salary");

		salary = input.nextDouble();

		if (years >= 5) {
			System.out.println("User is eligible for bonus");
			if (salary > 50000) {
				System.out.println("User will get 5000 Bonus");
			}else {
				System.out.println("User will get 3000 Bonus");
			}
		}else {
			System.out.println("User is not eligible for bonus");
		}
			
		
	}

}
