import java.util.Scanner;

public class temp {
	public static void main(String[] args) {
	  
	   Scanner temperature = new Scanner(System.in);
	 
	   int celfar;
	   double temp, tofar, tocelc;
	 
	   System.out.print("Input a temperature: ");
	   temp = temperature.nextDouble();
	 
	   System.out.print("What type of temperature unit do you want to convert this to? (please 1 for C and 2 for F) ");
	   celfar = temperature.nextInt();
	 
	   if (celfar == 1) {
	     tocelc = (temp-32)*5/9;
	     System.out.print("The temperature in celsius is " + tocelc + "ºC");
	  } else {
	     tofar = (temp*9/5)+32;
	     System.out.print("The temperature in fahrenheit is " + tofar + "ºF");
	  }
	 
	}
	 
}