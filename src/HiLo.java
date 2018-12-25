
import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playAgain = "";

		do {

			// Create a random number for  the  user to guess
			int theNumber = (int)(Math.random() * 100 + 1);

			//System.out.println(theNumber);
			int guess = 0;

			while (guess != theNumber) {
				System.out.println("Guess a number between 1 and 100:");
				guess = scan.nextInt();
				if (guess < theNumber)
					System.out.println(guess + " is too Low. Please Try again.");
				else if (guess > theNumber)
					System.out.println(guess + " is too High. Please Try again.");
				else
					System.out.println(guess + " is correct. You Win.");
				System.out.println("You entered " + guess + ".");
			}
			// End of while loop for guessing
			System.out.println("Would you like to play again (y/n)");
			playAgain = scan.next();
		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("Game Over! Thank you for playing! Goodbye.");
		scan.close();

	}
}