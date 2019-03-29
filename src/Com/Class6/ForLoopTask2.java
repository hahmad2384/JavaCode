package Com.Class6;

public class ForLoopTask2 {

	public static void main(String[] args) {
		// Print odd numbers from 1 to 20 (2 ways)
		
		for (int i = 1; i<=20; i+=2) {
			System.out.println(i);
		}
// 2nd way to print odd numbers
		for (int c = 1; c<=20; c++) {
			
			if (c % 2!=0) {
				System.out.println(c);
			}
		}
	}

}
