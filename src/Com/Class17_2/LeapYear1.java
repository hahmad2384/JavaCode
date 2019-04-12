package Com.Class17_2;

import java.util.Scanner;

public class LeapYear1 {

	public static void main(String[] args) {
/*Ask a user to input a leap year. Give the user 
10 chances to enter a correct leap year. As soon as the user
enters the correct leap year exit the loop */
		//Correct One
		int year;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i<=10; i++) {
			System.out.println("Please enter a guessed leap year");
			year = sc.nextInt();
			
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				System.out.println(year + " is a leap year");
				break;
			}else {
				System.out.println(year + " is not a leap year");
			}
		}
		
		
	}

}
