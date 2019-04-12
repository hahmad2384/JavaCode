package Com.Class17_2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		int payment, price, totalamount = 0;
		String item;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the item you want to buy");
		item = sc.nextLine();
		System.out.println("Please enter the price of item");
		price = sc.nextInt();

		while (totalamount < price) {
			System.out.println("Your need to pay " + "$" + (price - totalamount));

			System.out.println("Please enter payment");
			payment = sc.nextInt();
			totalamount = totalamount + payment;
		}
		if (totalamount == price) {
			System.out.println("Thank you for shopping!");
		} else {
			System.out.println("Thank you! and Here is your change " + "$" + (totalamount - price));
		}

	}

}
