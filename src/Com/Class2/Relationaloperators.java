package Com.Class2;

public class Relationaloperators {

	public static void main(String[] args) {

		int a = 198;
		int b = 501;

		boolean result = a > b;
		boolean result1 = a == b;

		System.out.println(result);
		System.out.println(result1);

		// compare 2 numbers and if a is larger than b

		if (a != b) {

			System.out.println("Good Day");

		} else {
			System.out.println("Good Morning");

		}

		// declare price and if price is higher than expected price

		double shoesPrice = 32.99;
		double allowedPrice = 31.99;

		if (shoesPrice <= allowedPrice) {

			System.out.println("I am buying those shoes");

		} else {
			System.out.println("I am not buying those shoes");
		} 

	}

}
