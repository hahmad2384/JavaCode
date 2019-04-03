package Com.Class14;

public class Task5 {

	public static void main(String[] args) {
		// Write a java program to reverse String? Reverse a string word by word?

		String str = "Syntax Technology is the best";
		String reverse = "";
		char [] newStr = str.toCharArray();
		
		for (int i = str.length()-1; i>=0; i--) {
			reverse += newStr[i];
			
		}
		System.out.println(reverse);
		System.out.println();
		
		String reverse1 ="";
		
		for (int i = str.length();i>0; i--) {
			reverse1 += str.substring(i-1,i);
		}
		System.out.println(reverse1);
	}
	

}
