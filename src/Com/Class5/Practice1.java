package Com.Class5;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		
		double a, b, c;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 3 distinct double values");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		if (a > b && a > c) {
			System.out.println(a + " is larger number");
		}else if (b > a && b > c) {
			System.out.println(b + " is larger number");
		}else {
			System.out.println(c + " is larger number");
		}
	}

}
