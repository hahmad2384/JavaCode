package Com.Class3;

import java.util.Scanner;

public class ScannerTask1 {

	public static void main(String[] args) {
		
		double loan;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the amount");
		
		loan = input.nextDouble();
		
		
		if (loan < 200000) {
			System.out.println("Lend the money");
		}else {
			System.out.println("Reject the money");
		}
	}

}
