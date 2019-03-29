package Com.Class3;

import java.util.Scanner;

public class ScannerClassTask3 {
	/* Ask user to enter city and temp in Fahrenheit
	 * Your Program should convert F----> C
	 Your Program should say "The Temp in the city is*/ 

	public static void main(String[] args) {
	
	String cityName;
	int temp;
	
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your city");
	
	cityName = input.nextLine();
	
	System.out.println("Please enter temperature in Fahrenheit");
	
	temp = input.nextInt();
	
	int convertedTemp = (temp -32)* 5 / 9;
	
	System.out.println("The tempearture in the city "+cityName+" is "+convertedTemp+ " C");
	
	
	
		
	}

}
