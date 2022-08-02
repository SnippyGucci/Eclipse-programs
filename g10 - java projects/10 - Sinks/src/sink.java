import java.util.Scanner; 

public class sink {
	public static void main(String args[]) {
		Scanner value = new Scanner(System.in);
		
		double mass, volume, density;
		String object;
		
		System.out.print("What is the name of the object? ");
		object = value.next();
		System.out.print("What is the mass of " + object + " (in grams)? ");
		mass = value.nextDouble();
		System.out.print("What is the volume of " + object + " (in cm^3)? ");
		volume = value.nextDouble();
		
		density = mass/volume;
		
		if (density > 1) {
			System.out.print(object + " will sink because the density of " + object + " is " + density + " g/cm^3");
		} else {
			System.out.print(object + " will float because the density of " + object + " is " + density + " g/cm^3");
		}
		
	}
}
