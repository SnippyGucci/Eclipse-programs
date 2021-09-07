import java.util.Scanner; 

public class yyxx {

	public static void main(String[] args) {
		
		Scanner finddistance = new Scanner(System.in);
		double xvalone, yvalone, xvaltwo, yvaltwo, distance;
		
		System.out.print("Insert your first x value: ");
		xvalone = finddistance.nextDouble();
		System.out.print("Insert your first y value: ");
		yvalone = finddistance.nextDouble();
		System.out.print("Insert your second x value: ");
		xvaltwo = finddistance.nextDouble();
		System.out.print("Insert your second y value: ");
		yvaltwo = finddistance.nextDouble();
		
		distance = Math.pow((xvaltwo-xvalone), 2) + Math.pow((yvaltwo-yvalone), 2);
		System.out.print(Math.sqrt(distance));
	}

}

