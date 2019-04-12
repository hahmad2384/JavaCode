package Com.Class17_2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 *  Write a program that reads a range of integers (start and end point), 
		 *  provided by a user 
		 *  and then from that range prints the 
		 *  sum of the even and odd integers.
		 */

		int start, end;
		int sumEven = 0;
		int sumOdd = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter range");
		start = sc.nextInt();
		end = sc.nextInt();
		if (start < end) {
		for (int i = start; i<=end; i++) {
			if (i %2 ==0) {
				sumEven+= i;
			}else {
				sumOdd += i;
			}
		}
		}
		System.out.println("The sum of even integers from "+ start + " to " +end + " is "+sumEven);
		System.out.println("The sum of odd integers from "+ start+ " to " +end + " is "+sumOdd);
	}

}
