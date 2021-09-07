package oddEvenList;
import java.util.*;

public class OddEvenList {

	public static void main(String[] args) {
		
		int[] oddArray = new int[100];
		int[] evenArray = new int[100];
        Random rand = new Random();
        int num, even = 0, odd = 0;
        
        for(int i = 0; i < 100; i++) {
        	num = rand.nextInt(1000)+1;
        	if(num%2 == 0) {
        		//System.out.println("EVEN: "+ num);

        		evenArray[even] = num;
        		even++;                
        	} else {
				//System.out.println("ODD: "+ num);
				
				oddArray[odd] = num;
				odd++;                
        	}
            
        }
        
        System.out.print("Even Array: \n");
        for(int i = 0; i < even; i++) {
        	System.out.print(evenArray[i] + ", ");
	    	if ((i+1)%10 == 0 && i != 0) {
	    		System.out.println();
	    	}
	    }
        
        System.out.println("\nEven Array Logical Size: " + even);
        System.out.println("Even Array Physical Size: 100");
        
        System.out.print("\nOdd Array: \n");
        for(int i = 0; i < odd; i++) {
        	System.out.print(oddArray[i] + ", ");
        	if ((i+1)%10 == 0 && i != 0) {
        		System.out.println();
        	}
        }
        
        System.out.println("\nOdd Array Logical Size: " + odd);
        System.out.println("Odd Array Physical Size: 100");

	}

}
