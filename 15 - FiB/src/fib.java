import java.util.Scanner; 

public class fib {
	public static void main(String args[]) {
		Scanner value = new Scanner(System.in);
		
		int val, num1, num2, tot, oldtot, counter;
		
		counter = 1;
		tot = 0;
		num1 = 0;
		num2 = 1;
	
		do {
			System.out.print("How many values of the fibonacci sequence do you want to output? ");
			val = value.nextInt();
		} while (!(val >= 1));
		
		while (counter <= val) {
			oldtot = tot;
			tot = num1 + num2;
			System.out.print(tot + ", ");
			num1 = num2 + oldtot;
			num2 = oldtot;
			counter++;
		}
		
	}
}