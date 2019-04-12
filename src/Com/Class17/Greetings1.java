package Com.Class17;

public class Greetings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greetings1 obj = new Greetings1();
		
		obj.askHowAreYou("Omer"); // call a method
	}

	void askHowAreYou(String name) {
		System.out.println("How are you " + name + " ?");
	}

}
