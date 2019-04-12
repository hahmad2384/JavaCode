package Com.Class21;

public class Employee {

	String eID;
  int salary;
	public static String CEO = "Sumair";
	public static void main(String[] args) {

		Employee eID1 = new Employee();
		eID1.eID = "10215673";
		eID1.salary = 60000;
	
		Employee eID2 = new Employee();
		 eID2.eID = "10121234";
		 eID2.salary = 75000;
		 
		 
		 System.out.println("Employee ID is "+eID1.eID+" his salary is "+eID1.salary+" and his CEO is "+Employee.CEO);
		 System.out.println("Employee ID is "+eID2.eID+" his salary is "+eID2.salary+" and his CEO is "+Employee.CEO);
		 
	}
	

}
