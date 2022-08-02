import java.util.Scanner;

public class pass {

	public static void main(String[] args) {
		Scanner guess = new Scanner(System.in);
		
		String pass = "Nu(13@R";
		int counter = 3;
		
		System.out.println("Oh no! A Nuclear Missile is about to launch and obliterate your city!");
		System.out.println("You can avoid this by enabling the shield reactor; however, the previous mayor forgot to hand over the password!");
		System.out.println("However, he did leave you with some hints to guess the password. \nBut, if you guess the the wrong password three times, the shield will self destruct\nand the missile will destroy the city!");
		System.out.println("\nThese are the hints he left you with:");
		System.out.println("1. The password is some variation of 'Nuclear'\n2. The first 'L' and 'E' are numbers with the sum of 4\n3. The first 'C' is the shift of nine\n4. The 'A' is the shift of two\n5. The 'N' and 'R' are not lowercase");
		System.out.println("Good luck!");
		
		for (counter = 2; counter >= 0; counter--) {
			System.out.print("\nEnter password: ");
			String userans = guess.nextLine();
			
			if (userans.equals(pass)) {
				System.out.print("Congratulations, you have initiated the shield! The city is saved!");
				System.exit(0);
			} else {
				System.out.print("That is not the answer! You have " + counter + " more tries! ");
			}
		} 
		if (counter < 0) {
			System.out.println("The shield has self destructed! Your city will be destroyed!");
			System.out.print("Restart to try again.");
		}
		
	}

}
