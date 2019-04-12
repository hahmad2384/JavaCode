package Com.Class17_2;

public class Task6 {
int rows = 7;
int colm = 7;
	public static void main(String[] args) {
		Task6 obj = new Task6();
		obj.printNumber();
	}

	void printNumber() {
		for (int rows = 1; rows <= 7; rows++) {
			for (int colm = 1; colm <= 7; colm++) {
				
				System.out.print(rows);
			}
			System.out.println();
		}
	}
}
