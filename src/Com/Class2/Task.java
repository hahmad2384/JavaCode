package Com.Class2;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 20.44;
		double b = 5.34;

		double sum = a + b;
		double sub = a - b;
		double mult = a * b;
		double div = a / b;

		System.out.println("The sum of a and b is " + sum);
		System.out.println("The sub of a and b is " + sub);
		System.out.println("The mult of a and b is " + mult);
		System.out.println("The div of a and b is " + div);

		float y = 3.9f;
		double square = y * y;

		System.out.println("The sqaure of 3.9 is " + square);

		int w = 5;
		int h = 8;

		int perimeter = 2 * (w + h);
		int area = w * h;

		System.out.println(
				"The perimeter of a rectangle with width 5 and height 8 is " + perimeter + "and area is " + area);

	}

}
