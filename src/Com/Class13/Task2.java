package Com.Class13;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a String that should be combination of letters, 
		 * numbers and special characters. 
		 * Find out how many alpha characters are there in the String.
		 */

		String str = "123Java Class12&**&";
		String newstr = str.replaceAll("[^A-z]", "");
		System.out.println(newstr.length());
		
	}

}
