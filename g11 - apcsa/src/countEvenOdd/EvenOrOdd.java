package countEvenOdd;
import java.util.*;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Input a number: ");
		int userPut = input.nextInt();
		int digits = userPut;
		int n = 0;
		
		do {
			digits = digits/10;
			n++;
			
		} while (digits > 10);
		
		int total = 0;
		while (n >= 0) {

		
			int first = (int) (userPut / Math.pow(10, n));
			
			userPut = (int) (userPut - (first * Math.pow(10, n)));
			
			if (first % 2 == 0) {
				System.out.println(first + " is Even");
			} else {
				System.out.println(first + " is Odd");
			}
			
			total += first; 
			System.out.println(total);
			
			n--;
		}
		
		
	}

}
