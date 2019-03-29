package Com.Class5;

import java.util.Scanner;

public class Task1 {
	/*Write a program that prints out if it is good weather to go for any activity or not
* If the temperature is between 40 degrees and 80 degrees inclusive & no rain--> we will go for hiking
* otherwise--> we will not go hiking
* If temperature is between 25 and 40 inclusive & snowing -->going snowboarding otherwise
* we are not going snowboarding
* it if temperature is more than 80 & sunny--> go to the beach
* otherwise --> not go to the beach
	 * 
	 */

	public static void main(String[] args) {
		boolean sunny, snow, rain;
		int temp;
		String activity = null;
		
		Scanner sc  = new Scanner (System.in);
		
		System.out.println("Enter Tempearture");
		temp = sc.nextInt();
		
		if (temp > 40 && temp < 80) {
			System.out.println("Is it raining?");
			rain = sc.nextBoolean();
			if (rain) {
				activity = "will not go for hiking";
			}else {
				activity = "Will go for hiking";
			}
		}else if (temp > 25 && temp < 40) {
			System.out.println("Is it snowing?");
			snow = sc.nextBoolean();
			if (snow) {
				activity = "Go for snowboarding";
			}else {
				activity = "Will not go for snowboarding";
			}
		}else if (temp > 80) {
			System.out.println("Is it Sunny?");
			sunny = sc.nextBoolean();
			if (sunny) {
				activity = "Go to Beach";
			}else {
				activity = "Will not go to Beach";
			}
			
		}
		System.out.println("Activity: " + activity);
	
	 }
	}


