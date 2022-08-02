import java.util.Scanner;
import java.util.Random;

public class hilo {

	public static void main(String[] args) {
		
		Scanner guess = new Scanner(System.in);
		Random rand = new Random();
		
		int numguess = 1;
		int maxval = 100;
		int various;
		int restart = 0;
		
		System.out.println("Number Guesser");
		various = rand.nextInt(maxval);
		
		while (restart!=1) {
			System.out.print("Choose a number between 1-100: ");
			numguess = guess.nextInt();
			
			if (numguess > 100 || numguess < 1) {
				System.out.println("Please choose a valid number");
			} else if (numguess > various) {
				System.out.println("Too high. Try Again");
			} else if (numguess < various) {
				System.out.println("Too low. Try Again");
			} else {
				System.out.println("You have chosen the right number!");
				System.out.println("Press 0 if you want to try again. Press 1 if you want to terminate program.");
				restart = guess.nextInt();
				
				if (restart == 0) {
					various = rand.nextInt(maxval);
				} else if (restart != 0 && restart != 1) {
					System.out.print("Please insert a valid number");
				}
				
			}
			
		}
		
		System.out.print("Successfully terminated program!");

	}

}
