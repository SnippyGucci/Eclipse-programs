package errorchecking;
import java.util.*;

public class errorcheck {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		char rerun = 'Y';
		
		while (rerun == 'Y' || rerun == 'y') {
			System.out.println("Please enter a word made up with only the letters from the word NUMBER.");
			
			String userput = input.next().toUpperCase().trim();
			char[] CH_userput = userput.toCharArray();
			boolean loopRun = false;
			
			for (int checkPts = 0; loopRun == false && (CH_userput[checkPts] == 'N' || CH_userput[checkPts] == 'U' || CH_userput[checkPts] == 'M' || CH_userput[checkPts] == 'B' || CH_userput[checkPts] == 'E' || CH_userput[checkPts] == 'R'); checkPts++) {
				
				if (checkPts+1 == CH_userput.length) {
					System.out.println("VALID");
					loopRun = true;
					checkPts = 0;
				}
				
			} if (loopRun == false) {
				System.out.println("INVALID");
			}
			
			System.out.println("Do you wish to continue? (Y/N): ");			
			rerun = input.next().charAt(0);
		}
		
	}

}
