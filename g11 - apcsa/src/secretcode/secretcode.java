package secretcode;
import java.util.*;

public class secretcode {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("String input = ");
		String ascii = input.next();
		
		isValidLength(ascii);
				

	} private static boolean isValidLength (String ascii) {
		if (ascii.length() >= 2 && ascii.length() <= 12) {
			charToAscii(ascii);
			return true;
			
		} if (ascii.length() <= 2 ){
			System.out.println("Enter more than 1 character!\n");
			main(null);
			return false;
			
		} else {
			System.out.println("Enter less than 13 characters!\n");
			main(null);
			return false;
		}
		
		
	} private static int charToAscii (String ascii) {
		int sumascii = 0;
		
		for (int i = 0; i < ascii.length(); i++) {
			int letter = (int) ascii.charAt(i);
			sumascii += letter;	
		}		
		
		System.out.println("Sum of ascii codes = " + sumascii);
		getNumDigits(sumascii);
		
		return 0;
		
	} private static int getNumDigits (int sumascii) {
		int counter = 1;
		double digiascii = (double) sumascii;
		
		while (digiascii >= 10) {
			digiascii = digiascii/10;
			counter++;
			
		} if (counter%2 != 0) {
			sumascii = sumascii*10;
			System.out.println("Odd number of digits = " + sumascii);
			
		} else {
			System.out.println("Even number of digits");
			
		}
		
		getSecretCode(sumascii);
		
		return 0;
		
	} private static String getSecretCode (int sumascii) {		
		if (sumascii <= 4000) {
			sumascii = sumascii*4;
			System.out.println("Less than 4000 = " + sumascii);
			
		} else {
			System.out.println("More than 4000");
		}
		
		int counter = 1;
		double digiascii = (double) sumascii;
		
		while (digiascii >= 10) {
			digiascii = digiascii/10;
			counter++;
			
		} if (counter%2 != 0) {
			sumascii = sumascii/10;
			System.out.println("Odd number of digits = " + sumascii);
			
		} else {
			System.out.println("Even number of digits");
			
		}
		
		int pairOne = sumascii/100;
		int pairTwo = sumascii-(pairOne*100);
		System.out.println("Two pairs = " + pairOne + ", " + pairTwo);
		
		if (pairOne <= 65) {
			pairOne = pairOne + 61;
			
		} if (pairTwo <= 65) {
			pairTwo = pairTwo + 61;
			
		} if (pairOne <= 65 && pairTwo <= 65) {
			System.out.println("Both pairs <= 65");
			
		}
		
		System.out.println("New pairs = " + pairOne + ", " + pairTwo);
		
		char secretOne = (char) pairOne;
		char secretTwo = (char) pairTwo;
		
		System.out.println(secretOne + "" + secretTwo);
		
		Scanner input = new Scanner (System.in);
		rerun(input);
		
		return "";
		
	 } private static char rerun (Scanner input) {
		 System.out.print("\nRerun? (y/n) ");
		 String rerun = input.next().toUpperCase().trim();
		 
		 if (rerun.equals("Y")) {
			 main(null);
		 }
		 
		 return 0;
	 }

} 
