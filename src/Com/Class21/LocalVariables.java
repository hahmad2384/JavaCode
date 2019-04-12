package Com.Class21;

public class LocalVariables {

	public static void main(String[] args) {
		
		String name = "John";
		//System.out.println(name);
		
		LocalVariables obj = new LocalVariables();
		obj.hello(name); //passing the variable that holds a value "John"
		System.out.println(name);
		//java run from top to bottom
		
	}
	
	public void hello(String name) { //local variable to hello method
		name = "Jack";
	System.out.println("Hello "+ name);
	}

}
