package Com.Class11;

public class NestedLoopsArray2D {

	public static void main(String[] args) {

		 int [][] num = {
				 {11,12,13,14}, //4 size
				 {21,22,23}, //3    //
				 {31,32,33,34} //4  //
				 
		 };
		// int rows=num.length;
		 //System.out.println(rows);
		 
		//int cols= num[1].length;
		//System.out.println(cols);
		
		for (int row=0; row<num.length; row++) {
			for (int col=0; col<num[row].length; col++) {
				System.out.print(num[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		String [] []food = {//3,4,4
				{"burger", "fries","hot dog","meatloaf"},//1 array or 1row
				{"lo mein","fried rice"},
				{"biryani","korma","naan","chick peas"}
		                                                 };
		for (int i =0; i<food.length; i++) {
			for (int j=0; j<food[i].length; j++) {
				System.out.print(food[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	}

}
