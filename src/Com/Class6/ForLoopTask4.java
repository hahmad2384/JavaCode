package Com.Class6;

public class ForLoopTask4 {

	public static void main(String[] args) {
		// Print even numbers between 20 and 50 2 ways
		
		for (int a = 20; a<=50; a+=2) {
			System.out.println(a);
		}
    // 2nd way to print
		
		for (int b = 20; b<=50; b++) {
			if (b % 2 ==0) {
				System.out.println(b);
			}
			// print odd numbers between 20 and 50 2 ways
			
			for (int i = 21; i<=50; i+=2) {
				System.out.println(i);
			}
			// 2nd way
			for (int f = 21; f<=50; f++) {
				if (f % 2 !=0) {
					System.out.println(f);
				}
			}
		}
		
	}

}
