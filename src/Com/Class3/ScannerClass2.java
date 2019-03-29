package Com.Class3;

import java.util.Scanner;

public class ScannerClass2 {
	//take 2 numbers from a user and compare those numbers

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter first number");
		
		num1 = input.nextInt();
		
		System.out.println("Please enter second number");
		
		num2 = input.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		
		
		if (num1 > num2) {
			System.out.println(num1+"is larger than "+num2);
			
		}else {
			System.out.println(num1+" is smaller than "+num2);
		}
	}

}
