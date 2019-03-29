package Com.Class12;

public class StringManipulation3 {

	public static void main(String[] args) {
		
		//char();----> returns a character at specified index

	String str = "Students";
//		char character = str.charAt(7);
//		System.out.println(character);
		
		for (int i =0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
		
		// indexOf()----> returns an index of specified character
		
		System.out.println("<-----IndexOf---->");
		String str1 = "Sunday";
		
		int index  = str1.indexOf("n");
          System.out.println(index);
          
          String str2 ="Syntax Technologies";
          System.out.println(str2.indexOf("Syntax"));
          System.out.println(str2.indexOf("Technologies"));
          System.out.println(str2.indexOf("w"));
          
          //substring()---> gives another string from your current string
          
          System.out.println("------Substring ---------");
          
          String str3 = "Today is Sunday Java class";
          String newString = str3.substring(9);
          System.out.println(newString);
          
         System.out.println(str3.substring(0, 5));//Today
         System.out.println(str3.substring(16, 20));//Java
         System.out.println(str3.substring(9, 20));//Sunay Java
         System.out.println(str3.substring(21));//class
	}

}
