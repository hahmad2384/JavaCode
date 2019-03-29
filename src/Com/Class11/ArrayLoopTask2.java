package Com.Class11;

public class ArrayLoopTask2 {

	public static void main(String[] args) {
		/*
		 * Create an array of countries: 
		 * north america countries, south america countries, 
		 * europe countries, asian countries, african countries. 
		 * Then print all values from that array.
		 */

		String [][] country = {
				{"USA", "Canada","Mexico"},
				{"Brazil", "Venezuela","Argentina","Colombia"},
				{"Germany", "France"},
				{"Pakistan", "China"},
				{"South Africa", "Nigeria"}
	};
		for (int i = 0; i<country.length; i++) {
			for (int j =0; j<country[i].length; j++) {
				System.out.print(country[i][j]+" ");
			}
			System.out.println();
		}
	}
}
