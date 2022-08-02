import java.util.Random;
import java.util.Scanner;

public class dice {
	public static void main(String[] args) {
		
		Scanner value = new Scanner(System.in);
		Random generator = new Random();
		
		int die, sides;
		
		System.out.print("How many sides is your dice? ");
		sides = value.nextInt();
		
		while (!(sides > 0)) {
			System.out.println("Value must be above 0");
			System.out.print("How many sides is your dice? ");
			sides = value.nextInt();
		}
		
		die = generator.nextInt(sides) + 1;
		System.out.println("The d" + sides + " rolled a " + die);
	
		

	}

}

