package Com.Class21;

public class InstanceVariables {
	
	 String name = "John"; //----- Instance Variable ---- can have access modifiers
	//To print name John we need to create Object and then access name
	public static void main(String[] args) {
		
		String name = "Anna"; // ------Local Variable
		
		System.out.println(name);
		name = "Olga";
		System.out.println("---Changing value of local variable----");
		System.out.println(name);
		
		//Instance ----- everyone get it's own copy change won't affect other instance
		
		//Creating 1 object
		InstanceVariables obj = new InstanceVariables();
		System.out.println(obj.name);
		System.out.println("---Changing value of instance variable----");
		obj.name = "Jack";
		System.out.println(obj.name);
		
		//creating second object
		
		InstanceVariables obj1 = new InstanceVariables();
		System.out.println(obj1.name);
			
		
	}
public void hello() {
	System.out.println("Hello "+name);
}
}
