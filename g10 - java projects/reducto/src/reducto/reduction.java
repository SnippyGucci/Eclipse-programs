package reducto;
import java.util.*;

public class reduction {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		System.out.print("Insert the numerator of the fraction: ");		
		int numerator = num.nextInt();
		System.out.print("Insert the denominator of the fraction: ");
		int denominator = num.nextInt();
		
		
		while (denominator == 0) {
			System.out.println("Denominator cannot be 0!");
			System.out.print("Insert the numerator of the fraction: ");		
			numerator = num.nextInt();
			System.out.print("Insert the denominator of the fraction: ");
			denominator = num.nextInt();
		}
		
		if(numerator%denominator == 0) {
			
			int whole_reduced = numerator/denominator;
			System.out.print(numerator + "/" + denominator + " = " + whole_reduced);
			
		} else {
			for(int i = numerator; i>1; i--) {
				if (denominator%i == 0 && numerator%i == 0) {
					int newnum = numerator/i;
					int newdem = denominator/i;
					if (numerator < denominator) {
						System.out.print(numerator + "/" + denominator + " = " + newnum + "/" + newdem);
						i=0;
					} else {
						int remainder = newnum%newdem;
						int updated_newnum = newnum-remainder;
						int wholenum = updated_newnum/newdem;
						System.out.print(numerator + "/" + denominator + " = " + newnum + "/" + newdem + " or " + wholenum + " " + remainder + "/" + newdem);
						i=0;
					}
				}
				
			}
				
		}
		
	}

}
