package Com.Class7;

public class NestedLoops1 {

	public static void main(String[] args) {
		
		
     /*I want to print pattern
      * 12345 --> 4 rows & 5 columns //i will print rows
      * 12345
      * 12345
      * 12345
      */
	
		for (int i=1; i<5; i++) {
			for (int y=1; y<=i; y++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		int rows = 4;
		for (int a =1; a<=rows; a++) {
			for (int b =1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
}

}
