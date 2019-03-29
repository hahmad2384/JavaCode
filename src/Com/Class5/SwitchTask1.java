package Com.Class5;

import java.util.Scanner;

public class SwitchTask1 {

	public static void main(String[] args) {
		String country;
		String language;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Where are you from?");
		country = sc.nextLine();
		
		switch (country) {
		case "USA":
			language = "English";
			break;
		case "Dubai":
			language = "Arabic";
			break;
		case "Pakistan":
			language = "Urdu";
			break;
		case "India":
			language = "Hindi";
			break;
		case "China":
			language = "Chinese";
			break;
		case "Russia":
			language = "Russian";
			break;
			default:
				language = "I don't know";
				
		}
     System.out.println("You speak "+ language);
	}

}
