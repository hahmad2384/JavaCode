package Com.Class5;

import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		/*
		 * Prompt user to enter their country Based on the country --> specify favorite
		 * food
		 * 
		 */
		String country;
		String food;

		Scanner sc = new Scanner(System.in);
		System.out.println("Where are you from?");
		country = sc.nextLine();

		switch (country) {
		
		case "USA":
			food = "Burger";
			break;
		case "Afghanistan":
			food = "Palao";
			break;
		case "Russia":
			food = "Pelemni";
			break;
		case "Italy":
			food = "Pasta";
			break;
		case "Turkey":
			food = "Baklava";
			break;
		case "Morocco":
			food = "Couscous";
			break;
		case "Kazakhstan":
			food = "Beshparmak";
			break;
		case "Pakistan":
			food = "Biryani";
			break;
		default:
			food = "Unknown";

		}
		System.out.println("Your Favourite food is "+ food);
	}

}
