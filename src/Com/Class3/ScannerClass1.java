package Com.Class3;

import java.util.Scanner;

public class ScannerClass1 {

	public static void main(String[] args) {

		Scanner userinput = new Scanner(System.in);
		
		String firstName = userinput.nextLine();
		
		String lastName = userinput.nextLine();
		
		String city = userinput.nextLine();
		
		String state = userinput.nextLine();

		
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("City: " + city);
		System.out.println("State: " + state);
		

		

	}

}
