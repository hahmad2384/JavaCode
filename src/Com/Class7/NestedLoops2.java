package Com.Class7;

public class NestedLoops2 {

	public static void main(String[] args) {
		int rows = 4;
		int columns = 6;

		for (int i = 1; i <= rows; i++) {

			for (int y = 1; y <= columns; y++) {

				if (i == 1 || i == 4 || y == 1 || y == 6) {

					System.out.print("*");

				} else {

					System.out.print(" ");
				}

			}
			System.out.println();

		}

	}

}
