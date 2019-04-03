package Com.Class14;

public class Task8 {

	public static void main(String[] args) {
		/* Write a Java Program to print first 
		10 numbers of Fibonacci series.*/
		//previous sum of two numbers ----> fibonacci series
	int a =0;
	int b = 1;
	System.out.print(a+" "+b);
	int c =0;
	
	for (int i =1; i<=10; i++) {
		c = a + b;
		a =b;
		b=c;
		System.out.print(" "+c);

	}

	}

}
