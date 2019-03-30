package Com.Class13;

import java.util.Scanner;

public class StringManipulations3 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads two people’s first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby: Example Output: Mom’s
		 * first name? Mary Dad’s first name? Daniel Boy or Girl? boy Suggested baby
		 * name: DANRY
		 * 
		 * Example Output: Mom’s first name? Mary Dad’s first name? Daniel Boy or Girl?
		 * girl Suggested baby name: MAIEL
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Moms first name?");
		String momsName = input.nextLine();
		System.out.println("Enter Dad’s first name?");
		String dadsName = input.nextLine();
		System.out.println("Is a Boy or Girl?");
		String Gender = input.nextLine();

		if (Gender.equalsIgnoreCase("boy")) {
			System.out.println("Suggested Baby name is " + dadsName.substring(0, dadsName.length() / 2)
					+ momsName.substring(momsName.length() / 2));
		} else if (Gender.equalsIgnoreCase("girl")) {
			System.out.println("Suggested Baby name is " + momsName.substring(0, momsName.length() / 2)
					+ dadsName.substring(dadsName.length() / 2));
		}

	}
}
