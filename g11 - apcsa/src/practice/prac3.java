package practice;
import java.util.*;

public class prac3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int sumascii = input.nextInt();
		
		
		int counter = 1;
		
		while (sumascii >= 10) {
			sumascii = sumascii/10;
			counter++;
			
		}
		System.out.println(counter);
		
		
	
		Boolean num = true;
		System.out.println(num);
	}

}
