package magicSquare;

import java.util.*;

public class tester {
	public static void main(String[] args) {
		int [][] anySq1 = { {2,7,6}, {9,5,1}, {4,3,8} };
		int [][] notMagic1 = { {1,1,1},{1,1,1},{1,1,1} };
		int [][] anySq2 = { {16,3,2,13},{5,10,11,8},{9,6,7,12},{4,15,14,1} };
		int [][] notMagic2 ={ {1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1} };
		int [][] anySq3 = { {8, 1, 6}, 
							{3, 5, 7},
							{4, 9, 2} };
		int [][] anySq4 = { {1, 15, 14, 4}, 
							{12, 6, 7, 9},
							{8, 10, 11, 5},
							{13, 3, 2, 16} };
					
 		MagicSquare ms1 = new MagicSquare(anySq1);  //testing a 3x3 magic square
		MagicSquare ms2 = new MagicSquare(notMagic1);
		MagicSquare ms3 = new MagicSquare(anySq2); //testing a 4X4 durer magic square
		MagicSquare ms4 = new MagicSquare(notMagic2); 
		MagicSquare ms5 = new MagicSquare(anySq3); //page 3 magic squares  
		MagicSquare ms6 = new MagicSquare(anySq4); //page 3 magic squares  
		
		ArrayList<MagicSquare> ms = new ArrayList<MagicSquare>(Arrays.asList(ms1, ms2, ms3, ms4, ms5, ms6));
		
		for (MagicSquare msEnhanced : ms) {
			if (msEnhanced.isMagic())
				System.out.println(msEnhanced + "is magic!\n");
			else 
				System.out.println(msEnhanced + "is NOT magic!\n");
			if (msEnhanced.isA4x4Durer())
				System.out.println(msEnhanced + "is a Durer magic!\n");
			else
				System.out.println(msEnhanced + "is NOT a Durer Magic Square\n");
		}		
	}
}
