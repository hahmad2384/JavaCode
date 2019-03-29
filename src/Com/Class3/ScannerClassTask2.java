package Com.Class3;

import java.util.Scanner;

public class ScannerClassTask2 {

	public static void main(String[] args) {
		
		int age;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How old are you?");
		
		age = input.nextInt();
		
		if (age >= 18) {
			System.out.println("Issue License");
		}else {
			System.out.println("Get learner permit");
		}
	}

}
