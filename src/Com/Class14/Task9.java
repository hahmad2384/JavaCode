package Com.Class14;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// Palindrone Number
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter the number");
		int no =sc.nextInt();
		int Quo =no;
		int rev=0,rm;
		
		while (Quo !=0) {
			rm = Quo % 10;
			rev = rev*10+rm;
			Quo = Quo/10;
			
			
		}
		System.out.println(rev);
		
      if (no==rev) {
    	  System.out.println(no+ " is palindrone number");
      }else {
    	  System.out.println(no+ " is not a palindrone number");
      }
	}

}
