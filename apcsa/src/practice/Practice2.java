package practice;
import java.util.*;

public class Practice2 {

	public static void main(String[] args) {
		/*Scanner input = new Scanner (System.in);
		
		int first = 0; 
		int digit = 0;
		int num = input.nextInt();		 
		
		while (num!= 0) {
			 digit = num%10;
			 num = num/10;
		 }
		System.out.println(digit);*/
		
		//double j = 7.3354;
		
		//j++;
		//System.out.println(j);
		//System.out.println(4+(16-3)/5+2);
		for (int k = 1; k<=3; k+=2) {
			System.out.print("Java");
			if (k%2==1)
				continue;
			System.out.print("Script");
		}
	}

}
