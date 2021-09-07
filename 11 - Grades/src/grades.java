import java.util.Scanner; 

public class grades {

	public static void main(String[] args) {
		
		Scanner value = new Scanner(System.in);
		
		double score, outof, percnt;
		
		System.out.print("What did you get? ");
		score = value.nextDouble();
		System.out.print("How many points was it out of? ");
		outof = value.nextDouble();
		
		percnt = (score/outof)*100;
		
		System.out.println("Your percentage grade: " + percnt + "%");
		
		if (percnt >= 96.5) {
			System.out.print("You got an A+");
		} if (percnt >= 92.5 && percnt < 96.5) {
			System.out.print("You got an A");
		} if (percnt >= 89.5 && percnt < 92.5) {
			System.out.print("You got an A-");
		} if (percnt >= 86.5 && percnt < 89.5) {
			System.out.print("You got an B+");
		} if (percnt >= 82.5 && percnt < 86.5) {
			System.out.print("You got an B");
		} if (percnt >= 79.5 && percnt < 82.5) {
			System.out.print("You got an B-");
		} if (percnt >= 76.5 && percnt < 79.5) {
			System.out.print("You got an C+");
		} if (percnt >= 72.5 && percnt < 76.5) {
			System.out.print("You got an C");
		} if (percnt >= 69.5 && percnt < 72.5) {
			System.out.print("You got an C-");
		} if (percnt >= 64.5 && percnt < 69.5) {
			System.out.print("You got an D");
		} if (percnt < 64.5) {
			System.out.print("You got an F");
		}

	}

}
