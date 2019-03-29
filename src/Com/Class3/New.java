package Com.Class3;

import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
	  	System.out.print("In:");
	  	
	  	int num = inp.nextInt();
	  	
	  	
	  	
       if(num > 0) {
    	   System.out.println(num+" is positive");
    	   
       }else {
    	   System.out.println(num+" is negative");
    	   
       }
       Scanner sc = new Scanner(System.in);
       System.out.print("In:");
       int num1 = sc.nextInt();
       if(num1 < 0) {
    	   System.out.println(num1+" is negative");
       }else {
    	   System.out.println(num1+" is positive");
       }
       System.out.println("In: 0");
	}

}
