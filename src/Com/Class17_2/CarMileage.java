package Com.Class17_2;

public class CarMileage {

	public static void main(String[] args) {
		// 99,999
		CarMileage obj = new CarMileage();
		obj.mileage();
		
	}
 void mileage() {
	 for (int a =0; a <= 9; a++) {
			
			for (int b = 0; b <=9; b++) {
				
				for (int c =0; c <=9; c++)
				System.out.println(a+""+b+ ""+c);
			}
		}
 }
}
