package Com.Class20;

public class Task1 {

	public static void main(String[] args) {
	Task1 obj = new Task1();
	System.out.println(obj.reverse("Syntax"));

	
	}
	
	
	String reverse (String a) {
	String reversed = "";
	for (int i = a.length()-1; i>=0; i--) {
		 reversed = reversed+a.charAt(i);
		 
	}
	
	return reversed;
	
	
}
}
