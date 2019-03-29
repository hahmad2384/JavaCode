package Com.Class11;

public class Task1 {

	public static void main(String[] args) {
		
		/*
		 * Create an array of cars and store 6 elements into it. 
		 * Using 2 different loops print all values from the array.
		 */
		String [] cars = {"Honda", "Toyota", "BMW", "Corolla", "Ferrair", "Bugati"};
		
		for (String Model : cars) {
			System.out.println(Model);
		}
		System.out.println();
     for (int i = 0; i< cars.length; i++) {
    	 System.out.println(cars[i]);
     }
	}

}
