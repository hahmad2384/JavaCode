package Com.Class4;

import java.util.Scanner;

public class LogicalTask2 {

	public static void main(String[] args) {
		int quiz;
		int midterm;
		int finalscore;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quiz");
		quiz = sc.nextInt();
		System.out.println("Midterm");
		midterm = sc.nextInt();
		System.out.println("FinalScore");
		finalscore = sc.nextInt();
		int avgScore = (quiz + midterm + finalscore) / 3;
		System.out.println("Average Score is "+ avgScore);

		if (avgScore >= 90) {
			System.out.println("Grade A");
		} else if (avgScore >= 70 && avgScore < 90) {
			System.out.println("Grade B");
		} else if (avgScore >= 50 && avgScore < 70) {
			System.out.println("Grade C");
		} else {
			System.out.println("Grade F");
		}
	}

}
