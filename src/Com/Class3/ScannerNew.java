package Com.Class3;

import java.util.Scanner;

public class ScannerNew {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    System.out.println("Input the boolean value");
	    boolean boo = input.hasNext();
	    System.out.println("This value is " + boo);
	}

}
