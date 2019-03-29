package Com.Class11;

public class Array2DTask2 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array that first row will contain 4 names and
		 *  second row will contain grades. Then you program should
		 *  print name of the students that has as an A and B grade
		 */
		
		String [][] a = {
				               { "Alex", "Peter","John","Mike"},
				                    {"A","B", "C", "D"}
		                         };
		
		System.out.println("Student name "+a[0][0]+" has a grade "+a[1][0]);
		System.out.println("Student name "+a[0][1]+" has a grade "+a[1][1]);
	}

}
