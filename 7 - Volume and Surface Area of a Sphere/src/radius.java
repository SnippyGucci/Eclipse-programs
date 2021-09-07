import java.util.Scanner; 
import java.math.*;

public class radius {

	public static void main(String[] args) {
		Scanner spherecalc = new Scanner(System.in);
		double rad, sa, vol;
		
		System.out.print("What is the radius of your sphere: ");
		rad = spherecalc.nextDouble();
		
		sa = 4*Math.PI*Math.pow(rad, 2);
		vol = (4*(Math.PI*Math.pow(rad, 3)))/3;
		System.out.println("The surface area is " + sa);
		System.out.print("The volume is " + vol);
	}

}

