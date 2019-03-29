package Com.Class4;

import java.util.Scanner;

public class NewTask {

	public static void main(String[] args) {
		int height;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Height In Inches");
		
		height = sc.nextInt();
		
		if (height < 5) {
			System.out.println("You are short");
			
		}else if (height == 5 || height <= 6 ) {
			System.out.println("You are medium");
			
		}else if (height >= 6) {
			System.out.println("You are Tall");
			
		}else {
			System.out.println("please enter valid height");
		}
	}

}
