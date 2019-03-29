package Com.Class7;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		int year;
		Scanner sc = new Scanner(System.in);
		
		 
		for (int i =1; i <=10; i++) {
			System.out.println("Please enter a leap year");
			year = sc.nextInt();
			if (year % 4 !=0) {
				System.out.println(year + " is not a leap year");
			}else if (year % 4 ==0){
				System.out.println(year + " is  a leap year");
				break;
			}
		}
	}

}
