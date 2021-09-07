package magicSquare;

public class MagicSquare {
	private int [][] theSq;   	
		
	public MagicSquare (int [][] sqData) {
		theSq = sqData;
	}
	
	private int colSum(int c) {
		int sum = 0;
				
		for (int col = 0; col < theSq[0].length; col++) {
		  for (int r = 0; r < theSq.length; r++)
		     sum += theSq[r][col];
		}
		
		int colEqual = sum%(theSq.length);
		if (colEqual == 0) {
			int colDivide = sum/(theSq.length);
			
			//System.out.println(colDivide);
			return colDivide;
		}
		
		return -1;
	}
	
	private int rowSum (int r) {
		int sum = 0;
		
		for (int row = 0; row < theSq.length; row++) {
		  for (int c = 0; c < theSq[0].length; c++)
		     sum += theSq[row][c];
		}

		int rowEqual = sum%(theSq.length);
		if (rowEqual == 0) {
			int rowDivide = sum/(theSq.length);
			
			//System.out.println(rowDivide);
			return rowDivide;
		}
		
		return -1;
	}
	
	private int diag1() {
		int sum = 0;
		
		for (int r = 0; r < theSq.length; r++) {
			sum += theSq[r][r];
		}
		
		//System.out.println(sum);
		
		return sum;
	}
	
	private int diag2() {
		int sum = 0;
		int c = theSq[0].length - 1;
		
		for (int r = 0; r < theSq.length; r++) {
			sum += theSq[r][c];
		  	c--;
		}
		
		//System.out.println(sum);

		return sum;
	}
	
	private boolean valuesCheck() {
		int sSquared = (int) Math.pow(theSq.length, 2);

		for (int c = 0; c < theSq[0].length; c++) {
			  for (int r = 0; r < theSq.length; r++) {
			     if (theSq[r][c] < 1|| theSq[r][c] > sSquared)
			    	 return false;
			}
		}
		
		for (int cMain = 0; cMain < theSq[0].length; cMain++) {
			for (int rMain = 0; rMain < theSq.length; rMain++) {				
				for (int cCompare = theSq[0].length - 1; cCompare > cMain; cCompare--) {
					for (int rCompare = theSq.length - 1; rCompare > rMain; rCompare--) {
					     if (theSq[cMain][rMain] == theSq[cCompare][rCompare])
					    	 return false;
					}
				}
			}
		}
		
		return true;
		
	}
	
	private int cornerSum() {
		int corner = theSq.length - 1;
		
		int sum = theSq[0][0] + theSq[corner][0] + theSq[0][corner] + theSq[corner][corner];
		
		//System.out.println(sum);
		return sum;
	}
	
	private int centerSum() {
		int mid1 = (theSq.length)/2 - 1;
		int mid2 = (theSq.length)/2;
		
		int sum = theSq[mid1][mid1] + theSq[mid1][mid2] + theSq[mid2][mid1] + theSq[mid2][mid2];

		//System.out.println(sum);
		return sum;
	}
	
	private int ULSum() {
		int sum = theSq[0][0] + theSq[0][1] + theSq[1][0] + theSq[1][1];
		
		//System.out.println(sum);
		return sum;
	}
	
	private int LLSum() {
		int sum = theSq[2][0] + theSq[2][1] + theSq[3][0] + theSq[3][1];
		
		//System.out.println(sum);
		return sum;
	}
	
	private int URSum() {
		int sum = theSq[0][2] + theSq[0][3] + theSq[1][2] + theSq[1][3];
		
		//System.out.println(sum);
		return sum;
	}
	
	private int LRSum() {
		int sum = theSq[2][2] + theSq[2][3] + theSq[3][2] + theSq[3][3];
		
		//System.out.println(sum);
		return sum;
	}
	
	private int topBottomCenter() {
		int sum = theSq[0][1] + theSq[0][2] + theSq[3][1] + theSq[3][2];
		
		//System.out.println(sum);
		return sum;
	}
	
	private int leftRightCenter() {
		int sum = theSq[1][0] + theSq[2][0] + theSq[1][3] + theSq[2][3];
		
		//System.out.println(sum);
		return sum;
	}
	
	public boolean isMagic() {
		int c = 0, r = 0;
		
		if (valuesCheck() == false) {
			return valuesCheck();
		}
		if (colSum(c) == rowSum(r) && diag1() == diag2() && colSum(c) == diag1())
			return true;
		
		return false;
	}
	
	public boolean isA4x4Durer() {	
		if (isMagic() == false) 
			return false;
		
		if (theSq.length != theSq[0].length || theSq[0].length != 4) 
			return false;
		  
		if (cornerSum() == centerSum() && centerSum() == ULSum() && ULSum() == LLSum() && LLSum() == URSum() && URSum() == LRSum() && LRSum() == topBottomCenter() && topBottomCenter() == leftRightCenter())
			return true;
			
		return false;
	}
             
	public String toString() {
		String grid = "| ";
		for(int r = 0; r < theSq.length; r++) {
			for(int c = 0; c < theSq[r].length; c++)
				grid += theSq[r][c] + " | ";
			if (r < theSq.length - 1)
				grid += "\n| ";
		}
		
		return grid;
		         
 
	}                                                             
                                                                             
}                                                                            
                                                                             