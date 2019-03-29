package Com.Class6;

public class WhileLoopTask1 {

	public static void main(String[] args) {
		/*Print only odd numbers from 1 to 20 */
		
		int num = 10;
		
		while (num <= 100) {
			//System.out.println("I am inside while loop");
			if (num %2 ==0) {
				System.out.println(num);
				
			}
			num++;
		}

	}

}
