package Com.Class6;

public class ForLoopTask3 {

	public static void main(String[] args) {
		// Print Even Numbers from 20 to 1
		
		for (int d = 20; d >=1; d-=2) {
			System.out.println(d);
		}
      // 2nd way
		
		for (int e = 20; e >=1; e--) {
			if (e %2 ==0) {
				System.out.println(e);
			}
		}
	}

}
