package Com.Class7;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		int secretNumber;
		secretNumber = 18;
		int guess;
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.println("Guess a Secret Number (1 - 20)");
			guess = sc.nextInt();

			if (guess == secretNumber) {
				System.out.println("Your guess is correct. Congratulations!");
			} else if (guess < secretNumber) {
				System.out.println("Your guess is smaller than secret number");
			} else if (guess > secretNumber) {
				System.out.println("Your guess is greater than secret number");

			}
		} while (guess != secretNumber);
		
		/*
		* Write a guessing game where the user has to guess a secret number between 1 and 20.
		* After every guess input, the program tells the user whether their number was too large
		* or too small. The program will keep asking the user to enter the number until
		* he finds the correct number. When the correct answer is found
		* the system should display "Congratulations!!. You got it!".
		*/
		        Scanner scan;
		        int secret, userNumber;
		        
		        secret=13;
		        scan=new Scanner(System.in);
		        System.out.println("Please enter any number from 1 to 20");
		        do {
		            
		            userNumber=scan.nextInt();
		            
		            if (userNumber<secret) {
		                System.out.println("Number is too small, try again");
		            }else if (userNumber>secret){
		                System.out.println("Number is too large,  try again");
		            }
		        }while(secret!=userNumber);
		        
		        System.out.println("Congratulations!!You got it!");
	}
}
