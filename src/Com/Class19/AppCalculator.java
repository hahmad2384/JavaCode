package Com.Class19;

public class AppCalculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		System.out.println(calc.sum(12, 13, 14));
		System.out.println(calc.avg(12, 13, 14));
		System.out.println(calc.min(12, 13, 14));
		System.out.println(calc.max(12, 13, 14));
	}

}
