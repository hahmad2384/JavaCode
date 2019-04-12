package Com.Class19;

public class Human {
	static String eyeColour = "Brown";
	int height = 6;         //-----> Instance variables
	int weight = 180;
	String gender = "F";
	
	String programmingLanguage = "java";
	
	void speak() {
		String language = "English"; // -----> Local Variable
		
		System.out.println("Humans can speak "+ language);
	}
	void coding() {
		System.out.println("Syntax students can code "+ programmingLanguage);
	}
 void print() {
	 System.out.println(eyeColour);
 }
}
