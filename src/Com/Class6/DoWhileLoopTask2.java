package Com.Class6;

import java.util.Scanner;

public class DoWhileLoopTask2 {

	public static void main(String[] args) {
		
		/*Ask user to pay for a soda
     *keep asking user to pay for soda until entered price is not equal to 1.99
     *after user got a write amount print "Please enjoy your soda"*/
		
	
		double price;
	      
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
			System.out.println("Please pay for soda");
			price = sc.nextDouble();
		}while(price != 1.99);
			System.out.println("Enjoy your soda!");
		}
		
	}


