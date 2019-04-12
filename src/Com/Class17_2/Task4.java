package Com.Class17_2;

public class Task4 {

	public static void main(String[] args) {
		
		Task4 num = new Task4();
             num.printNumber();
    
    
		
	}
	void printNumber () {
          for(int i=1; i<=5 ;i++){
			
			for(int j=1; j <= i; j++){
				System.out.print(j+ " ");
			}
			
			System.out.println();
		}
	}
}
