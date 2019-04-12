package Com.Class21;

public class Car {
	
	public String color;//null value by default
	public  static int totalCars; //0 value by default 0+1=1+1=2

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.color = "white";
		totalCars++;
		
		Car car2 = new Car();
		car2.color = "black";
		totalCars++;
		
		System.out.println("Total car we made is "+totalCars);

	}

}
