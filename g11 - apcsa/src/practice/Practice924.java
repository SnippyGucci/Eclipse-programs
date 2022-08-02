package practice;
import java.util.*;

public class Practice924 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int digits = 0;
		int sum = 0;
		int num = input.nextInt();
		
		while (num != 0) {
			digits++;
			num=num/10;
			System.out.println(num);
			sum = sum + num;
		}
		System.out.println(sum );

	}

}
