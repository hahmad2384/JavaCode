package Com.Class11;

public class Array2DTask1 {

	public static void main(String[] args) {
	/*Create a 2D array where you will store the following values:
	 *  Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		After storing values print the following:
			Mrs Smith, Mr Obama, Ms Jackson.	*/
  String [][] a = {
		           {"Mr","Mrs","Ms","Miss"},
		           {"Smith","Jordan","Jackson","Obama"}
                         };
  
  System.out.println(a[0][1]+" "+a[1][0]);
  System.out.println(a[0][0]+" "+a[1][3]);
  System.out.println(a[0][2]+" "+a[1][2]);
  System.out.println(a[0][3]+" "+a[1][1]);
  
	}

}
