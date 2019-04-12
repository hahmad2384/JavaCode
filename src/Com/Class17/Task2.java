package Com.Class17;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a method that will print whether given string is Palindrome or not
		 */

String a = "sis";

Task2 obj = new Task2();
obj.Palindrome(a);
	
		
	}
	
	void Palindrome(String a) {
		String reverse = "";
		for (int i =a.length()-1; i>=0; i--) {
			reverse += a.charAt(i);	
		}
		if (reverse.equalsIgnoreCase(a)) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
	}
	

}
