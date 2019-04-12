package Com.Class20;


public class Task2 {

	public static void main(String[] args) {
		String a = "mom";

		Task2 obj = new Task2();
		obj.Palindrome(a);
		
			
				
			}
			
			public String Palindrome(String a) {
				String reverse = "";
				for (int i =a.length()-1; i>=0; i--) {
					reverse += a.charAt(i);	
				}
				if (reverse.equalsIgnoreCase(a)) {
					System.out.println("It is palindrome");
				}else {
					System.out.println("It is not a palindrome");
				}
				return reverse;

	}

}
