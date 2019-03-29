package Com.Class3;

public class NestedIfCondition {
	/*
	 * Write a program to check work eligibility
	 * if user is younger than <16 --> not allowed to work
	 * otherwise - - > allow to work if user is younger than 64 - -> go to work
	 * otherwise - -> enjoy your life	
	 */
		
	public static void main(String[] args) {
	
		int age = 18;
		
	    int eligibleage = 16;
	    
	    int retiredage = 64;
	    
	    if (age < eligibleage) {
	    	System.out.println("You are too young to work");
	    }else {
	    	System.out.println("You are eligible to work");
	    	if (age < retiredage) {
	    		System.out.println("Go work hard");
	    		
	    	}else {
	    		System.out.println("Enjoy");
	    	}
	    }

	}

}
