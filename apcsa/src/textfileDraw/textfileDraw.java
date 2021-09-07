package textfileDraw;
import java.util.*;
import java.io.*;

public class textfileDraw {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner (new File("C:\\Users\\Vian Miranda\\Documents\\school\\grade 11\\comp sci\\initial-files\\input.txt"));
		PrintWriter output = new PrintWriter(new File("C:\\Users\\Vian Miranda\\Documents\\school\\grade 11\\comp sci\\initial-files\\output.txt"));
		
		int runChoice;
		while (input.hasNext() ) {
		
			runChoice = input.nextInt();
			//output.print(runChoice + " ");
			//System.out.print(runChoice + " ");
			
			if (runChoice > 0) {
				while (runChoice > 0) {
					System.out.print("*"); //outputs in console
					output.print("*"); //outputs in output.txt
					runChoice--;
				}
				runChoice = 1;
			} if (runChoice < 0) {
				while (runChoice < 0) {
					System.out.print(" ");
					output.print(" ");
					runChoice++;
					//System.out.print(runChoice);
				}
				runChoice = -1;
			} if (runChoice == 0) {
				System.out.println("");
				output.println("");
			}
			
		}
		
		output.close();
		
	}

}

/*3 -12 3 -2 5 -12 5 0
4 -10 4 -2 6 -10 6 0
-1 3 -10 3 -3 6 -10 6 0
-1 4 -8 4 -3 7 -8 7 0
-2 3 -8 3 -4 3 -1 3 -8 3 -1 3 0
-2 4 -6 4 -4 3 -1 4 -6 4 -1 3 0
-3 3 -6 3 -5 3 -2 3 -6 3 -2 3 0
-3 4 -4 4 -5 3 -2 4 -4 4 -2 3 0
-4 3 -4 3 -6 3 -3 3 -4 3 -3 3 0
-4 4 -2 4 -6 3 -3 4 -2 4 -3 3 0
-5 3 -2 3 -7 3 -4 3 -2 3 -4 3 0
-5 8 -7 3 -4 8 -4 3 0
-6 6 -8 3 -5 6 -5 3 0
-7 4 -9 3 -6 4 -6 3 0*/