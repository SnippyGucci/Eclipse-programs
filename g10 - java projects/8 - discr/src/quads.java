import java.util.Scanner; 

public class quads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner quad = new Scanner(System.in);

		double quad1, quad2, quad3, disc;

		System.out.println("Please input 3 numbers:");

		System.out.print("a: ");
		quad1 = quad.nextDouble();

		System.out.print("b: ");
		quad2 = quad.nextDouble();

		System.out.print("c: ");
		quad3 = quad.nextDouble();

		disc = Math.pow(quad2, 2)-(4*quad1*quad3);

		if (disc == 0) {
			System.out.println("There is only one solution since the discriminant = 0");
		} if(disc > 0){
			System.out.println("There are two solutions");
		} if(disc < 0) {
			System.out.println("There are no real solutions. Please input some other variables");
		}



	}

}
