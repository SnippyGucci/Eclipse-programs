import java.util.Scanner;

public class tempconvert {

	public static void main(String[] args) {
		int fartemp = 32;
		double multfactor = 5;
		double mult2factor = 9;
		int addin = 32;
		
		double celsius;
		celsius = (fartemp - addin) * (multfactor / mult2factor);
		
		System.out.println("Fahrenheit Temperature: " + fartemp);
		System.out.println("Celcius Equivalent: " + celsius);
 
	}

}

