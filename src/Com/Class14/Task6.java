package Com.Class14;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to find whether a
		 *  String is palindrome or not?
		 *  
		 *  If original string and reverse string are same as 
		 *  per alphabetical order we say string is palindrome
		 */
		String reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String:");
        String str = sc.nextLine();
        
        for (int i = str.length()-1; i>=0;i--) {
        	reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
        	if (str.equalsIgnoreCase(reverse)) {
        		System.out.println("Given String is palindrome");
        	}else {
        		System.out.println("Given String is not palindrome");
        	}
        
     
        
	}
	
}
