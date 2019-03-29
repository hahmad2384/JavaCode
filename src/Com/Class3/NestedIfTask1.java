package Com.Class3;

public class NestedIfTask1 {

	public static void main(String[] args) {
		
		double rate = 4;
		double expectedrate = 4.5;
		int price = 180000;
		int expectedprice = 200000;
		
		if (rate < expectedrate) {
			System.out.println("I am buying house");
			if (price > expectedprice) {
				System.out.println("I will get a loan");
				
			}else {
				System.out.println("I will pay cash");
			}
			
		}else {
			System.out.println("I am not buying house");
			
		}
		
	}

}
