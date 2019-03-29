package Com.Class11;

public class Task3 {

	public static void main(String[] args) {
		
		/*
		 * Create an array of countries. While retrieving 
		 * all values from an array
		 *  print capital for each country. (use 2 different loops).
		 */
		
		String [] country = {"Pakistan", "USA", "Turkey", "Spain"};
		for (int i = 0; i<country.length; i++) {
		
			if (country[i].equals("Pakistan")) {
				System.out.println("Islamabad");
			}else if (country[i].equals("USA")) {
				System.out.println("Washington DC");
				
			}else if (country[i].equals("Turkey")) {
				System.out.println("Ankara");
			}else if(country[i].equals("Spain")) {
				System.out.println("Madrid");
			}
		}
		String [] countries = {"India", "USA", "Turkey", "Afghanistan"};
		for (String capitol:countries) {
			switch(capitol) {
				case "India":
					System.out.println("Delhi");
					break;
				case "USA":
					System.out.println("Washington DC");
					break;
				case "Turkey":
					System.out.println("Ankara");
					break;
				case "Afghanistan":
					System.out.println("Kabul");
					break;
			}
		}
	}

}
