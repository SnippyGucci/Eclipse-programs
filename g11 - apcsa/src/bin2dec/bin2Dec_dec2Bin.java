package bin2dec;
import java.util.*;

public class bin2Dec_dec2Bin {
	public static void main (String [] args) {
	
		Scanner input = new Scanner (System.in);
		int runChoice = 1;
		
		String rerun = "Y";
		
		do {		
			do {				
				
				System.out.println("Enter '1': Binary To Decimal\n" + "Enter '2': Decimal to Binary");
				runChoice = input.nextInt();
			
			} while (runChoice != 1 && runChoice != 2);
	
			if (runChoice == 1) {
				System.out.print("Insert the binary number: ");
				String binary = input.next();	
				bin2dec(binary);	
				
			} else {
				System.out.print("Insert the decimal number: ");
				String decimal = input.next();
				dec2bin(decimal);
				
			}
			
			System.out.print("\nDo you wish to continue? (Y/N) ");
			rerun = input.next().toUpperCase().trim();
		
		} while(rerun.equals("Y"));

	}  
	
	public static long bin2dec(String binary) {
		int totalVal = 0;
		int val = 0;
		int checker = 0;
		char[] CH_userput = binary.toCharArray();
		
		for(int n = 0; n < binary.length() && (checker == 0 || checker == 1); n++) {
			checker = Integer.parseInt(Character.toString(binary.charAt(binary.length()-1-n)));
			val = (int) (Math.pow(2,n) * checker);
			totalVal += val;
		}
		
		if (checker != 0 && checker != 1) {
			System.out.println("Binary must be '1' or '0' only!");
		} else {
			System.out.println("The decimal value is: " + totalVal);
		}
		
		return totalVal;
		
	} 
	
	public static String dec2bin(String decimal) {
		
		int dividend = Integer.parseInt(decimal);
		int quotient = 1;
		String binaryOutput = "";
		String binaryReverse = "";
		
		while (quotient != 0) {
			quotient = dividend/2;
			int remainder = dividend%2;
			dividend = quotient;
			binaryOutput += remainder;
		} 
		
		for(int i = binaryOutput.length() - 1; i >= 0; i--) {
			binaryReverse = binaryReverse + binaryOutput.charAt(i);
		}
		
		System.out.println(binaryReverse);
		
		return binaryOutput.toString();
		
	}
			
}
