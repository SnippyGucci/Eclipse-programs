package gameOfChance;
import java.util.*;

public class GOCmethods {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int points = 25;
		String quit = "N";
		
		do {
			int dice = (int) (Math.random() * 12 + 1);
			int set = 0, ante = 0;
			boolean skip = false;
			quit = "N";
			
			System.out.print("You rolled a " + dice + ". ");

			if (dice == 2 || dice == 3 || dice == 12) {
				points--;
				System.out.println("You lost 1 point.");
				System.out.println("You have " + points + " points.");
				skip = true;
				
			} else if (dice == 7 || dice == 11) {
				points += 2;
				System.out.println("You gained 2 points.");
				System.out.println("You have " + points + " points.");
				skip = true;	
				
			} else {
				set = dice; 
				dice = 0;
				System.out.println("Ante Round!\n");
				
			}
			
			if (skip == false)
				points = inRoundLoop(dice, points, ante, set, skip, quit, input);
						
			System.out.print("Do you play to run another game? ");
			quit = input.next().toUpperCase();
			System.out.println();
			
		} while (quit.equals("Y") && points > 0);
		
		System.out.println("You ended with " + points + " points.");

	}
	
	private static int inRoundLoop (int dice, int points, int ante, int set, boolean skip, String quit, Scanner input) {
		while (dice != set && dice != 7 && quit.equals("N")) {
			dice = (int) (Math.random() * 12 + 1);
			ante++;
			
			System.out.println("You rolled a " + dice + ". ");
			
			if (dice != set && dice != 7) {
				System.out.print("Do you want to quit? (y/n) ");
				quit = input.next().toUpperCase();
				System.out.println();
								
			}	
			
		}
		
		if (dice == set) {
			points += ante;
			System.out.println("\nYou gained " + ante + " point(s).");
			System.out.println("You have " + points + " points.");
			return points;			
			
		} else if (dice == 7 || quit.equals("Y")) {
			points -= ante;
			System.out.println("\nYou lost " + ante + " point(s).");
			System.out.println("You have " + points + " points.");
			return points;
			
		}
		
		return points;
		
	}

}
