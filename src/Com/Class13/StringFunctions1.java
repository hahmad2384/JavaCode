package Com.Class13;

public class StringFunctions1 {

	public static void main(String[] args) {
		// toCharArray() - converts string to array of characters
		
		String str = "saturday";
		
		char [] array =str.toCharArray();
          for (int i=0; i<array.length; i++) {
        	  System.out.println(array[i]);
          }
          System.out.println();
          for (char c :array) {
        	  System.out.println(c);
          }
		System.out.println();
          for (int i=array.length-1; i>=0; i--) {
        	  System.out.print(array[i]);
          }
	}

}
