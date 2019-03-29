package Com.Class3;

import java.util.Scanner;

public class NestedIfScanner {

	public static void main(String[] args) {
		
		double rate = 4.5;
		int price = 200000;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter Mortgage Rate");	
				rate = input.nextDouble();
				System.out.println("Price of House");
				price = input.nextInt();
				
				
				
				if (rate > 4.5) {
				System.out.println("User is not buying a house");	
					
				}else {
					System.out.println("User is buying a house ");
					
					if (price > 200000) {
						System.out.println("User will get loan");
					}else {
						System.out.println("User will pay cash");
					}
				}

	}

}
