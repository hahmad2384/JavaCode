package Com.Class5;

import java.util.Scanner;

public class SwitchTask2 {

	public static void main(String[] args) {
		char grade;
		String brief;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter Grade");
		grade = sc.next().charAt(0);
	
		switch (grade) {
		case 'A':
			brief = "Excellent!";
			break;
		case 'B':
			brief = "Good!";
			break;
		case 'C':
			brief = "Average";
			break;
		case 'D':
			brief = "Bad";
			break;
			default:
				brief = "very bad";
				
		}
		System.out.println("Your grade is "+ grade + " and you did "+ brief);
	}

}
