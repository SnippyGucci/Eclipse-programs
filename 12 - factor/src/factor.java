import java.util.Scanner; 

public class factor {
	public static void main(String args[]) {
		Scanner value = new Scanner(System.in);
		
		int number;
		double div = 1;
		int quotient;
		
		System.out.print("What is the number you want to factor? ");
		number = value.nextInt();
		
		System.out.print("The factor(s) of " + number + " are: ");
		
		while (div <= number) {
			if (number % div == 0) {
				System.out.print(div + ", ");
			}
			div++;
		}
		
		
		
	}
}