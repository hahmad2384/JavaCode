package Com.Class6;

public class WhileLoop {

	public static void main(String[] args) {
		//to eliminate repetition we use loops
		
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		
		//loops in Java:
		//while
		//do while
		//for 
		//enhanced for loop (for each loop)//collections or arrays
			
			int a = 1;
			while (a < 10) {
				System.out.println("Good morning");
				a++;
			}
			
			int b = 1;
			
			while (b <= 5) {
				System.out.println("I am inside while loop " + b);
				
				b++;
			}
				System.out.println("I am outside of the while loop");
				
				//I want to print values from 10 to 20 inclusive
				
				int z = 10;
				
				while (z <=20) {
					System.out.println(z);
					z++;
					
				}
				
				int c = 1;
				
				while (c <= 20) {
					System.out.print(c+ " ");
					c++;
				}
				
				int d = 10;
				while (d >= 1) {
					System.out.println( d+ " ");
					d--;
				}
				
	}
}


