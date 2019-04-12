package Com.Class20;

public class Task {

	public static void main(String[] args) {
/*
 * Create a method createEmail().
 * Based on provided users name, lastName and email type,
 * your method should return complete email Address;
 */
		Task obj = new Task();
		System.out.println(obj.createEmail("Hussain", "ahmad", "gmail"));
		Task obj1 = new Task();
		System.out.println(obj1.createEmail("Bob", "Snow", "outlook"));
		
		Task1 c = new Task1();
		System.out.println(c.reverse("Syntax"));
		
	}
	//return type methodName
  String createEmail(String userName, String lastName, String emailType) {
String emailAddress = userName + lastName +"@"+ emailType+".com";
return emailAddress.toLowerCase();
}
}
