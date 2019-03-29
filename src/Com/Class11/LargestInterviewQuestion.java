package Com.Class11;

public class LargestInterviewQuestion {

	public static void main(String[] args) {
		// create an array of integers and find largest number
		
		int [] num = {20,2000,30,40,500,600};
		
		int largest =num [0];
		int smallest = num [0];
		
		for (int i = 0; i<num.length; i++) {
			if (num[i] > largest) {
				largest = num[i];
			}
			for (int a = 0; a<num.length; a++) {
				if (num[a] < smallest) {
					smallest = num[i];
				}
			}
			
			}
		System.out.println("Largest number is "+ largest);
		System.out.println("Smallest number is "+ smallest);
	}

}
