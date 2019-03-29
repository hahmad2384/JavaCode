package Com.Class3;

public class NestedIfhw {

	public static void main(String[] args) {
		
		boolean creditcard = true;
		int balance = 1000;
		if (creditcard) {
			System.out.println("check the balance");
		if (balance >= 1000) {
			System.out.println("Pay off immediately");
		}else {
			System.out.println("you are good");
		}
		}else {
			System.out.println("Do you want a credit card");
			
		}
	}

}
