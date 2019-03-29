package Com.Class11;

public class Task2 {

	public static void main(String[] args) {
		
		/*
		 * Create an array on integers and
		 *  calculate the sum of all elements in an array.
		 */
		int sum = 0;
		
		int [] num = {40,50,60,10};
       for (int i = 0; i<num.length; i++ ){
    	   
    	   sum+=num[i];
       }
 System.out.println(sum);
		
		

	}

}
