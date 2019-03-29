package Com.Class5;

import java.util.Scanner;

public class TaskNe {

	public static void main(String[] args) {
		boolean rain, snow, sunny;
		int temp;
		String activity;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature");
		temp = sc.nextInt();

		if (temp >= 40 && temp < 80) {
			System.out.println("Is it raining?");
			rain = sc.nextBoolean();
			if (rain) {
				activity = "Stay Home";

			} else {
				activity = " Go for Hiking";

			}
		} else if (temp >= 25 && temp < 40) {
			System.out.println("Is it Snowing?");
			snow = sc.nextBoolean();
			if (snow) {
				activity = "Go for Snowboarding";
			} else {
				activity = "Do Coding";
			}
		} else if (temp > 80) {
			System.out.println("Is it Sunny?");
			sunny = sc.nextBoolean();
			if (sunny) {
				activity = "Go to Beach";
			} else {
				activity = "Will not go to beach";
			}
		} else {
			System.out.println("Enter different temperature");
			activity = "unknown";
		}
		System.out.println("Activity: "+ activity);
	}
}
