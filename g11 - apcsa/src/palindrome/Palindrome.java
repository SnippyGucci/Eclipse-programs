package palindrome;
import java.util.*;

public class Palindrome {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a word: ");		
		String original = input.nextLine();
		
		String original1 = original.toLowerCase();
		
		int startTime = (int) System.nanoTime();
				
		if (algorithm1(original1)) {
			System.out.println("It is a palindrome.");

		} else {
			System.out.println("It is NOT a palindrome.");
		}
		
		int endTime = (int) System.nanoTime();
		int timeElapsed = endTime - startTime;
		System.out.println("This took " + timeElapsed + " nanoseconds");
		
		String original2 = original.toLowerCase();
		int startTime2 = (int) System.nanoTime();
		
		if (algorithm2(original2)) {
			System.out.println("It is a palindrome.");

		} else {
			System.out.println("It is NOT a palindrome.");
			
		}

		int endTime2 = (int) System.nanoTime();
		int timeElapsed2 = endTime2 - startTime2;
		System.out.println("This took " + timeElapsed2 + " nanoseconds");
		
		int differenceTime = Math.abs(timeElapsed-timeElapsed2);
		
		if (timeElapsed < timeElapsed2) {
			System.out.println("\nAlgorithm 1 was faster by " + differenceTime + " nanoseconds."); //should never run
		} else {
			System.out.println("\nAlgorithm 2 was faster by " + differenceTime + " nanoseconds."); //should always run
		}

	}

	public static boolean isLetter (char c) {		
		if (c >= 97 && c <= 122) {
			return true;

		} else {
			return false;

		}

	}

	public static boolean algorithm1 (String orig1) {
		System.out.println("\nAlgorithm 1:");
		
		String forwards = "";
		String backwards = "";
		boolean alphabet = true;

		for (int n = 0; n <= orig1.length()-1; n++) {
			char c1 = orig1.charAt(n);
			alphabet = isLetter(orig1.charAt(n));

			if(alphabet) {
				forwards = forwards + c1;

			}
		}

		for (int n = orig1.length()-1 ; n >= 0; n-- ) {
			char c = orig1.charAt(n);
			alphabet = isLetter(orig1.charAt(n));
			
			if(alphabet) {
				backwards = backwards + c;

			}
		}

		if (forwards.equals(backwards))
			return true;
		else
			return false;

	}

	public static boolean algorithm2 (String orig2) {
		System.out.println("\nAlgorithm 2:");
		
		int forwards = 0;
		int backwards = orig2.length() - 1;
		boolean palindromeness = true;;

		for (forwards = 0; forwards <= orig2.length() - 1; forwards ++, backwards--) {
			while (!isLetter(orig2.charAt(forwards))) {
				forwards++;
			} while (!isLetter(orig2.charAt(backwards))) {
				backwards--;
			}

			if (orig2.charAt(forwards) != orig2.charAt(backwards)) {
				palindromeness = false;
			}
				
		}

		return palindromeness;

	}
}
