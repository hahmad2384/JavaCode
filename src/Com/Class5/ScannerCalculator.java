package Com.Class5;

import java.util.Scanner;

public class ScannerCalculator {

	public static void main(String[] args) {
		
		double first, second, solution;
		char operator;
        
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 2 numbers");
		first = sc.nextDouble();
		second = sc.nextDouble();
		System.out.println("Enter (+, -, *, /): ");
		operator = sc.next().charAt(0);
		
		switch (operator) {
		case '+':
			solution = first + second;
			break;
		case '-':
			solution = first - second;
			break;
		case '*':
			solution = first * second;
			break;
		case '/':
			solution = first / second;
			break;
		default:
			System.out.println("Error");
			return;
		}
		System.out.println("Solution is "+ solution);
	} 

}
