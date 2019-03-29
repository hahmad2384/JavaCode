package Com.Class11;

public class Recap {

	public static void main(String[] args) {
		int[][] num = { { 1, 2, 3 }, { 10, 20, 30 }, { 100, 200, 300 } };

		// how many total arrays

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {//0 //1 //2
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-------For Each Loop-------------");
		//loop through each element inside 2D Array---> each element =array
		for (int[] singleArray:num) {
			// loop through each single array
			for (int numbers:singleArray) {//{1,2,3}//{10,20,30}//{100,200,300}
				System.out.print(numbers+" ");
			}
			System.out.println();
		}
	}

}
