package Com.Class14;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Write a program to swap 2 numbers without a temporary variable? Swap 2
		 * strings without a temporary variable?
		 */

		int a = 10;
		int b = 5;
		System.out.println("Before Swap:" + " a = " + a + ", b = " + b + "\n");
		// Code to swap 'a' and 'b'
		a = a + b; // a becomes 15
		b = a - b; // b becomes 10
        a = a -b;  // a becomes 5
		System.out.println("After Swap:" + " a = " + a + ", b = " + b);
		System.out.println();

		String c = "Hussain";
		String d = "Ahmad";

		// Print String before swapping
		System.out.println("Strings before swap: c = " + c + " and d = " + d + "\n");

		c = c + d; //HussainAhmad

		d = c.substring(0, c.length() - d.length()); //Hussain

		c = c.substring(d.length()); // Ahmad

		System.out.println("Strings after swap: c = " + c + " and d = " + d);
	}

}
