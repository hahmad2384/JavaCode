package Com.Class17_2;

public class NestedLoops {

	public static void main(String[] args) {
		
		for (int i = 0; i <3; i++) {
			System.out.println(i+ " ---Outer loop");//3
			
			for (int j = 0; j<3; j++) {
				System.out.println(j + " ---Inner loop");
			}
		}
/* 0 - outer loop
 * 0- inner loop
 * 1- inner loop
 * 2- inner loop
 * 1- outer loop
 * 0- inner loop
 */
	}

}
