package Com.Class13;

public class ReverseStringInterview {

	public static void main(String[] args) {
		// Reverse a string without using a reverse function
		// 1 using toCharArray();
		String original = "Today is Java Class";
		String reverse = "";
		
	char[] array = original.toCharArray();
	for (int i =array.length-1;i>=0; i--) {
		reverse= reverse+array[i];
	}
	System.out.println("Reverse String is: "+reverse);

	//2 charAt();
	
	String reverse1 = "";
	
	for (int i=original.length()-1; i>=0; i--) {
		reverse1 += original.charAt(i);
	}
	System.out.println(reverse1+ "");
	
	//3 using substring()
	String reverse2 = "";
	
	for (int i =original.length(); i>0; i--) {
		reverse2 += original.substring(i-1,i);
	}
	System.out.println(reverse2);
	
	}

}
