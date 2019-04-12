package Com.Class19;

public class Application1 {

	public static void main(String[] args) {

		Animals obj = new Animals();
		
System.out.println(obj.name);		
System.out.println(obj.breed);	
System.out.println(obj.age);
System.out.println(obj.weight);

System.out.println(obj.canBark());

System.out.println(Animals.isWild());

obj.name = "Buzzo";
obj.age = 40;

System.out.println(obj.age);
System.out.println();

		
Animals obj2 = new Animals();
obj2.name = "Buzzo";

System.out.println(obj2.name);		
System.out.println(obj2.breed);	
System.out.println(obj2.age);
System.out.println(obj2.weight);

System.out.println();

Animals obj3 = new Animals();
obj3.name = "Buzzo";

System.out.println(obj3.name);		
System.out.println(obj3.breed);	
System.out.println(obj3.age);
System.out.println(obj3.weight);

int my_array[] = { 10, 20, 30, 40, 500, 60, 70, 8, 90, 100 };

System.out.println("Printing the maximum value");

System.out.println(Minimum.maxOfValues(my_array));

System.out.println("Printing the minimum value");

System.out.println(Minimum.minOfValues(my_array));


	}

}
