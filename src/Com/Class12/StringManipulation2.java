package Com.Class12;

public class StringManipulation2 {

	public static void main(String[] args) {
		
		//contains()---> checks for Specific value in the string
		// if value is present--->true, else---> false
		
		String str = "Good Morning, students";
		boolean contains = str.contains("Morning");
		System.out.println(contains);
		
		String present = "Welcome, Hussain";
		String value = "WELCOME";
		boolean found = present.contains(value);
		System.out.println(found);
		
		
		boolean found1= present.toUpperCase().contains(value);
		System.out.println(found1);
		
		// Startswith(), endswith()----> will return true if string starts with specific value
		// else ---> return false
		
		System.out.println("------StartWith & EndsWith-----");
		String str1 = "syntax";
		boolean starts= str1.startsWith("s");
		System.out.println(starts);
		
		System.out.println(str1.endsWith("i"));
		
		//isEmpty() if length of a string is =0---> string is empty 
		//else---> it is no empty
		
		System.out.println("-----isEmpty------");
		String str2 = "";
		boolean isEmpty= str2.isEmpty();
		System.out.println(isEmpty);
		
		//concat() ---> will concatenate 1 string to the end of another
		System.out.println("------Concat----");
		String str3 = "Hello ";
		String str4 = "Ali ";
		String str5 = "Ahmad ";
		System.out.println(str3+str4);
		System.out.println(str3.concat(str4).concat(str5));
		
		//trim() ----> will remove spaces at the beginning and at the end of your string
		System.out.println("--------___-------");
		String expected = "You are qualify for loan!";
		String actual = ("You are qualify for loan! ");
		
		actual = actual.trim();
		System.out.println(expected.equals(actual));
		
		
	}

}
