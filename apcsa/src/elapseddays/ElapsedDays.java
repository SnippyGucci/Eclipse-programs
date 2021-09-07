package elapseddays;
import java.util.*;

public class ElapsedDays {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int startMonth = 0, endMonth = 0;
		
		System.out.print("Enter\n year: ");
		int year = input.nextInt();
		leapYearChecker(year);
		
		do {
			System.out.print(" start month: ");
			startMonth = input.nextInt();
			
			if (startMonth > 12 || startMonth == 0) {
				System.out.println("Please enter a real month!");
				
			}
			
		} while (startMonth > 12 || startMonth == 0);
		
		System.out.print(" start day: ");
		int startDay = input.nextInt();
		

		do {
			System.out.print(" end month: ");
			endMonth = input.nextInt();
			
			if (endMonth > 12 || endMonth == 0) {
				System.out.println("Please enter a real month!");
				
			}
			
		} while (endMonth > 12 || endMonth == 0);
		
		System.out.print(" end day: "); 
		int endDay = input.nextInt(); 
		

		monthChecker(year, startMonth, endMonth, true, startDay, endDay);
		

	} private static boolean leapYearChecker (int year) {
		boolean isLeap = false;
		
		if (year >= 1582) {
			
			if (year%4 == 0) {
				isLeap = true;
				
				if (year%100 == 0) {
					isLeap = false;
					
					if (year%400 == 0) {
						isLeap = true;
						
					}
				}
			} 
		}
		
		return isLeap;
	
	} private static int monthChecker (int year, int startMonth, int endMonth, boolean isLeap, int startDay, int endDay) {
		int daysWithin = 0, daysLeft = 0, daysComp = 0, totalDays = 0;
		int month = startMonth;
		
		while (month == startMonth || month == endMonth) {
			for (int counter = 1; counter <= month; counter++) {
				
				if ((counter%2 == 1 && counter <= 7) || (counter%2 == 0 && counter > 7)) daysWithin = 31; //checks that the month is a 31 month
					
				if (counter == 2) { //checks that the month is February
					daysWithin = 28;
					
					if (isLeap == leapYearChecker(year)) daysWithin = 29;
						
				} else if ((counter%2 == 0 && counter <= 7) || (counter%2 == 1 && counter > 7)) daysWithin = 30; //checks that the month is a 30 month

				totalDays += daysWithin;
				//System.out.println(totalDays);
			}
			
			if (month == endMonth) {
				daysComp = totalDays - daysWithin + endDay;
				//System.out.println(daysComp);
				month = 0;
				
			} if (month == startMonth) {
				daysLeft = totalDays - daysWithin + startDay;
				month = endMonth;
				//System.out.println(daysLeft);
				totalDays = 0;
				daysWithin = 0;
				
			} 
		}
		
		daysElapsed(daysLeft, daysComp);	
		
		return 0;
		
	} private static int daysElapsed (int daysLeft, int daysComp) {
		int elapsed =  daysComp - daysLeft;
		
		//System.out.println(daysComp + "\n\n" + daysLeft);
		
		System.out.println("Elapsed days: " + elapsed);
				
		return elapsed;
		
	}

}
