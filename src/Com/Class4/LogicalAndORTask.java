package Com.Class4;

import java.util.Scanner;

public class LogicalAndORTask {

	public static void main(String[] args) {
		int height;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Height");

		height = sc.nextInt();
		if (height <= 5) {
			System.out.println("Short");

		} else if (height > 5 && height <= 6) {
			System.out.println("Medium");

		} else {
			System.out.println("Tall");
		}

	}
}
