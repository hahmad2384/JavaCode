package Com.Class13;

public class StringSplit {

	public static void main(String[] args) {
	//String.split();	

		String str = "Welcome Syntax Students Batch 4";
		String [] array = str.split(" ");
System.out.println(array.length);

for (String substr :array) {
	System.out.println(substr);
}
System.out.println();
for (int i =0; i<array.length;i++) {
	System.out.println(array[i]);
}
	}

}
