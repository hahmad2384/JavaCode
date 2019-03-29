package Com.Class9;

import java.util.Scanner;

public class NestedLoopsTask1 {

	public static void main(String[] args) {
		
String item;
double price, payment, totalPayment, balance;
totalPayment = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Please enter the item you want to buy");
item = sc.nextLine();

System.out.println("Please enter the price of item");
price = sc.nextDouble();

do {
	System.out.println("Please enter payment amount");
	payment = sc.nextDouble();
	totalPayment = totalPayment + payment;
	balance = price - totalPayment;
	
	System.out.println("Your change is $"+balance);
	
}while (totalPayment != price);
        System.out.println("Thank you for shopping with us");
	}

}
