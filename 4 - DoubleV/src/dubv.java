import java.util.Scanner; 

public class dubv { 
	public static void main(String args[]) {
		Scanner adcalc = new Scanner(System.in);		
		double num1, num2;
		
		//asks users to input their two numbers that they want to operate with
		System.out.print("What is the first number: ");
		num1 = adcalc.nextDouble();
		System.out.print("What is the second number: ");
		num2 = adcalc.nextDouble();
		
		System.out.println(num1 + " + " + num2 + " = " + num1+num2);
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		System.out.println(num1 + " * " + num2 + " = " + num1*num2);
		System.out.println(num1 + " / " + num2 + " = " + num1/num2);

		
	}
}

