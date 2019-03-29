
package Com.Class12;

public class StringManipulation {

	public static void main(String[] args) {
        //length()---> number of characters 
		String str = "Syntax";
		int lengthofString = str.length();
		System.out.println(lengthofString);

		String str1 = "Syntax Technologies";
		int lengthof2String = str1.length();
		System.out.println(lengthof2String);

		String str2 = "Welcome, students!";
		System.out.println(str2.length());
		
		// toUpperCase()--> convert all characters to UpperCase
		String str3 = "Hello";
		String newString = str3.toUpperCase();
		System.out.println(newString);
		
         // tolowercase()--> convert all characters to lowercase
		String lowerCaseString = newString.toLowerCase();
		System.out.println(lowerCaseString);
		
		//equals() - compares 2 strings,if strings are equal --->true, else --->false
		String str4 = "Hello";
		String str5 = "Hello";
		
		boolean equality= str4.equals(str5);
		System.out.println(equality);
		//equalsIgnoreCase() - compares 2 strings but ignores case
		String expectedBrowser = "Chrome";
		String actualBrowser = "chrome";
		
		boolean equals= expectedBrowser.equalsIgnoreCase(actualBrowser);
		System.out.println(equals);
	}

}
