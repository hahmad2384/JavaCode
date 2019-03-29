package Com.Class11;

public class ForEachIn2D {

	public static void main(String[] args) {
		/*
		 * Create a grocery list: fruits {} veggies{} dryfruits{} Retrieve all values
		 * using 2 different loops
		 */
		String[] content = { "Fruits", "Veggies", "DryFruits" };
		String[][] list = { { "Mango", "Banana", "Grapes" }, { "Potato", "Onion" }, { "Cashews", "Almonds" }

		};

		for (String[] singleArray : list) {
			
			for (String lists : singleArray) {
				System.out.print(lists + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < list.length; i++) {
			System.out.println("<-------- " + content[i] + "-------->");
			for (int j = 0; j < list[i].length; j++) {
				System.out.print(list[i][j] + " ");
			}
			System.out.println();
		}
	}

}
