import java.util.Scanner; 

public class power {
	public static void main(String args[]) {
		Scanner value = new Scanner(System.in);
		
		double number, power, counter, newnum;
		
		System.out.print("What is the number you want to power? ");
		number = value.nextDouble();
		
		System.out.print("What is the exponent? ");
		power = value.nextDouble();
		
		newnum = number;
		
		for (counter = 1; counter < power; counter++) {
			newnum = newnum*number;
		}
		
		System.out.print(number + "^" + power + " = " + newnum);
		
	}
}