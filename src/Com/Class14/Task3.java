package Com.Class14;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Find out how many alpha characters present in a string?
		 */

	String str = "123We are the best456%%";
	String newstr = str.replaceAll("[^A-z]", "");
	
	System.out.println(newstr.length());
		
	}

}
