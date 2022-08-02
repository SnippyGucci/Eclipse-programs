import java.util.*;

public class deal {

	public static void main(String[] args) {
		Random suitRAND = new Random();
		Random valRAND = new Random();
		
		for (int x = 0; x < 20; x++) {
			int suit = suitRAND.nextInt(4)+1;
			int val = valRAND.nextInt(13)+1;
			
			switch (val) {
				case 1:
					System.out.print("Ace");
				break;
				case 11:
					System.out.print("Jack");
				break;
				case 12:
					System.out.print("Queen");
				break;
				case 13:
					System.out.print("King");
				break;
				default:
					System.out.print(val);
				break;
			}
			
			switch (suit) {
				case 1:
					System.out.print(" of Spades\n");
				break;
				case 2: 
					System.out.print(" of Hearts\n");
				break;
				case 3:
					System.out.print(" of Diamonds\n");
				break;
				case 4:
					System.out.print(" of Clubs\n");
				break;
			}
			
		}
		
		
	}

}
