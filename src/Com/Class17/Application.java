package Com.Class17;

import Com.Class17_2.ScannerMethod;

public class Application {

	public static void main(String[] args) {
 ScannerMethod scnMthd = new ScannerMethod();
 
 System.out.println(scnMthd.sum(12, 35));
 
 

 

	}
   void example() {
	   System.out.println("No return value and No Parameters");
   }
   void example2(String name) {
	   System.out.println("No return value but with Parameter : "+name);
   }
   boolean example3() {
	   System.out.println(" With return value and No Parameters");
	   return true; 
   }
   String example4(String name) {
	   System.out.println("With return value but with Parameter : "+name);
	   return name;
   }
   boolean example5(String name) {
	   System.out.println("With return value but with Parameter : "+name);
	   return false;
   }
   long example6(char name) {
	   System.out.println("No return value but with Parameter : " + name);
	   return name;
   }
}
