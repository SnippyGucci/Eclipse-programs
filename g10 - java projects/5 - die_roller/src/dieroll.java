import java.util.Random;

public class dieroll {
	public static void main(String[] args) {
		Random generator = new Random();
	
		int die;
		
		die = generator.nextInt(4) + 1;
		System.out.println("The d4 rolled a " + die);
		
		die = generator.nextInt(6) + 1;
		System.out.println("The d6 rolled a " + die);
		
		die = generator.nextInt(8) + 1;
		System.out.println("The d8 rolled a " + die);
		
		die = generator.nextInt(10) + 1;
		System.out.println("The d10 rolled a " + die);
		
		die = generator.nextInt(12) + 1;
		System.out.println("The d12 rolled a " + die);
		
		die = generator.nextInt(20) + 1;
		System.out.println("The d20 rolled a " + die);
		
		die = generator.nextInt(100) + 1;
		System.out.println("The d100 rolled a " + die);
		

	}

}

