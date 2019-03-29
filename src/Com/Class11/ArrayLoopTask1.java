package Com.Class11;

public class ArrayLoopTask1 {

	public static void main(String[] args) {
		/*
		 * Create an array of cars: 
		 * american cars, german cars, korean cars, italian cars.
		 * Then retrieve all values from that array.
		 */

		String [][] cars = {
				{"Ford","Tesla","Dodge","GMC"},
				{"Mercedes-Benz","Volkswagen","Porsche"},
				{"Hyundai","Kia Sorento", "Chevrolet Spark"},
				{"Lamborghini","Alfa Romeo","Lancia"}
		};
		
		for (int i = 0; i<cars.length; i++) {
			for (int j =0; j<cars[i].length; j++){
				System.out.print(cars[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
