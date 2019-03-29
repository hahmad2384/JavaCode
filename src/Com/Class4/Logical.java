package Com.Class4;

import java.util.Scanner;

public class Logical {
	/*Write a java program to ask user enter daily sales amount
	 * Based on the sales range commission will be different;
	 * Example sale is <100 --> commission = 2%
	 * sales more than 100 and less than 200 commission = 5
	 */
	public static void main(String[] args) {
		int commission; //declare variables
		int sales;
		
		Scanner sc = new Scanner (System.in); //bringing scanner class enabling keyboard input
		
		System.out.println("Enter sales amount");
		sales = sc.nextInt();
		 //we capturing input
 
		if (sales > 0 && sales < 100) {
			commission = 2;
			
		}else if (sales >=100 && sales < 200 ) {
			commission = 5;
			
		}else if (sales >=200 && sales < 500) {
			commission = 10;
			
		}else if (sales >= 500) {
			commission = 20;
		}else {
			commission = 0;
		}
		System.out.println("Your commission is "+ commission);
	}

}
