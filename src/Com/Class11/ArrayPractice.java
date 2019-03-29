package Com.Class11;

public class ArrayPractice {

	public static void main(String[] args) {
		//let's create an array of names and retrieve all values from it
		// store 5 elements. Create an array using new keyword
		
		String[] names = new String [7];
		
		names[0] = "Hussain";
		names[1] = "Hassan";
		names [2] = "Ahmad";
		names [3] = "Iman";
		names [4] = "Saad";
		names [5] = "Abdul";
		names [6] = "Ghuffar";
	for (int i = 0; i<names.length; i++) {
		System.out.println(names[i]);
	}
	//2 create an array using array literal
	
	String [] studentsNames = {"Rafat", "Olga", "Ken", "Fahri", "Hussain"};
	 for (int i=0; i<=studentsNames.length-1; i++) {
		 System.out.println(studentsNames[i]);
	 }
	 // retrieve values using: advanced for loop, for each loop, enhanced for loop
	 String [] studentsNames1 = {"Rafat", "Olga", "Ken", "Fahri", "Hussain"};
	 for (String student: studentsNames1) {
		 System.out.println(student);
	 }
	}

}
