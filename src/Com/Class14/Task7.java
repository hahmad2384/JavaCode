package Com.Class14;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		/*
		 * Write a java program to check whether a given number 
		 * is prime or not?
		 */
       
       Scanner sc = new Scanner (System.in);
       System.out.println("Please enter number");
       int num = sc.nextInt();
       int temp = 0;
       
       
       for (int i = 2; i<num-1; i++) {
    	   if (num % i == 0) {
    	   temp++;
      }
    	   
       }
       if (temp == 0) {
    	   System.out.println(num+ " is prime number ");
       }else {
    	   System.out.println(num+" is not a prime number");
       }
	}

}
