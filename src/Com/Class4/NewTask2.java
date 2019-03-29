package Com.Class4;

import java.util.Scanner;

public class NewTask2 {

	public static void main(String[] args) {

		int n1;
		int n2;
		int n3;
		int largest;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1");
		n1 = sc.nextInt();
		
		System.out.println("Enter number 2");
		n2 = sc.nextInt();
		
		System.out.println("Enter number 3");
		n3 = sc.nextInt();

		if(n1 > n2) {
            if(n1 > n3) {
                largest = n1;
		
            }else {
            	largest = n3;
            }
            }else if (n2 > n3) {
            	if (n2 > n1) {
            		largest = n2;
            	}else {
            		largest = n1;
            	}
            }else {
            	largest = n3;
            }
		
			System.out.println("The largest number is " + largest);
            			
 }
}