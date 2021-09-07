package octalTriangle;
import java.util.Scanner;
import java.util.Arrays;

public class TestingCode {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int s = input.nextInt();
		int d = input.nextInt();
		int r = input.nextInt();
		
		int[] Arr = new int[r];
		Arrays.fill(Arr, 0);
		int lastVal = Integer.parseInt(Integer.toString(s), 8);
		
		for(int i = 1; i < r; i++) {
		
			for(int c = 0; c <= i; c++) {
				if(c==0) {
		
					Arr[c] = lastVal + d;
		
				}
				
				else {
		
					Arr[c] = Arr[c-1] + d;
		
				}
				
				lastVal = Arr[c];
			
			}			
		
		}
		
		String finVal = "";
		for(int i = 0; i < r; i++) {
			finVal = finVal + Integer.toOctalString(Arr[i]);
		}
		int sum = 0;
		for(int i = 0; i < finVal.length(); i++) {
		sum = sum + Integer.parseInt(Character.toString(finVal.charAt(i)));
		}
		
		System.out.println(sum);
		
	}

}



