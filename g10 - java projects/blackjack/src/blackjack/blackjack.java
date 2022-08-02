package blackjack;
import java.util.*;

public class blackjack {

	public static void main(String[] args) {
		Scanner hitORfold = new Scanner(System.in);
		Random valRAND = new Random();
		
		System.out.println("Blackjack");
		
		int valPLAYER = valRAND.nextInt(10)+2;
		int valDEALER = valRAND.nextInt(10)+2;
		int hidden_valDEALER = valRAND.nextInt(10)+2;
		int hidden_valPLAYER = valRAND.nextInt(10)+2;
		int sumDEALER = valDEALER + hidden_valDEALER;
		int sumPLAYER = valPLAYER + hidden_valPLAYER;
		
		
		System.out.println("The dealer has dealt you two cards. Your visible number is: " + valPLAYER);
		System.out.println("The dealer has dealt himself two cards. His visible number is: " + valDEALER);
	
		while (sumDEALER < 17) {
			valDEALER = valRAND.nextInt(10)+2;
			sumDEALER = valDEALER + sumDEALER;
		}
		
		System.out.println("Do you want to \"Hit\" or \"Fold\"?");
		String hitfold = hitORfold.nextLine();
		
		while (hitfold.equals("Hit") || hitfold.equals("hit")) {
			if (hitfold.equals("Hit") || hitfold.equals("hit")) {
				valPLAYER = valRAND.nextInt(10)+2;
				sumPLAYER = valPLAYER + sumPLAYER;
				int sumPLAYER_nohide = sumPLAYER - hidden_valPLAYER;
				
				System.out.println("The current sum of your deck is " + sumPLAYER_nohide);
				if (sumPLAYER_nohide > 20) {
					System.out.println("\nYou have lost. :(");
					System.out.println("Your total: " + sumPLAYER);
					System.out.println("Dealer's total: " + sumDEALER);
					System.exit(0);
				}
				
				System.out.println("Do you want to \"Hit\" or \"Fold\"?");
				hitfold = hitORfold.nextLine();
			}
			
		} if (hitfold.equals("Fold") || hitfold.equals("fold")) {
			 if (sumPLAYER == sumDEALER) {
				System.out.println("\nTie.");
				System.out.println("Your total: " + sumPLAYER);
				System.out.println("Dealer's total: " + sumDEALER);
			} if (sumPLAYER > 21 || sumDEALER == 21) {
				System.out.println("\nYou have lost. :(");
				System.out.println("Your total: " + sumPLAYER);
				System.out.println("Dealer's total: " + sumDEALER);
			} if (sumPLAYER < 21 && sumDEALER < 21 && sumPLAYER > sumDEALER) {
				System.out.println("\nYou have won. :)");
				System.out.println("Your total: " + sumPLAYER);
				System.out.println("Dealer's total: " + sumDEALER);
			} if (sumPLAYER < 21 && sumDEALER < 21 && sumPLAYER < sumDEALER) {
				System.out.println("\nYou have lost. :(");
				System.out.println("Your total: " + sumPLAYER);
				System.out.println("Dealer's total: " + sumDEALER);
			} if (sumPLAYER == 21) {
				System.out.println("\n21!");
				System.out.println("Your total: " + sumPLAYER);
				System.out.println("Dealer's total: " + sumDEALER);
			}
		}
		
		hitORfold.close();

	}

}
