package chapter0;
import java.util.*;

public class WarmUp {
	
	public static void main(String[] args) {
		Scanner age = new Scanner (System.in);
		
		System.out.print("Enter your current age: ");
		int currAge = age.nextInt();
		
		int years = 1;
		
		do {
			currAge++;
			System.out.println("You will be " + currAge + " in " + years + " years");
			years++;
			
			if (years == 11) {
				System.out.println("Do you want to contine? (y/n)");
				String yorn = age.next();
				
				if (yorn.equals("y")) {
					System.out.print("Enter your current age: ");
					currAge = age.nextInt();
					
					years = 1;
				} else {
					System.out.print("Program terminated");
				}
			}
			
		} while (years <= 10);
		
		
	}

}
