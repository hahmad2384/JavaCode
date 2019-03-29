package Com.Class4;

import java.util.Scanner;

public class NewTask1 {

	public static void main(String[] args) {

		double n1;
		double n2;
		double n3;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		n1 = sc.nextDouble();

		System.out.println("Enter number 2");
		n2 = sc.nextDouble();

		System.out.println("Enter number 3");
		n3 = sc.nextDouble();
		if (n1 >= n2 && n1 >= n3) {
			System.out.println(n1 + " is the largest number");
		} else if (n2 >= n1 && n2 >= n3) {
			System.out.println(n2 + " is the largest number");
		} else {
			System.out.println(n3 + " is the largest number");
		}

	}

}
