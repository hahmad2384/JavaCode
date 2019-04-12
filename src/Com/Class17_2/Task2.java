package Com.Class17_2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter the item they want to buy and the price for the item. Then
		 * ask user to pay for it. Every time user enters money accumulate the amount
		 * and tell user how much is left to pay off the amount. Whenever user done with
		 * payments tell them "Thank you for shopping!"
		 * 
		 */
		String item;
		int price, payment;
		int totalamount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the item you want to buy");
		item = sc.nextLine();
		System.out.println("Please enter the price of the item");
		price = sc.nextInt();

		do {
			System.out.println("Please enter payment amount");

			payment = sc.nextInt();

			totalamount = totalamount + payment;

			
			System.out.println("Your change is: " + (price - totalamount));

		} while (totalamount < price);
		System.out.println("Thank you for shopping");

	}

}
