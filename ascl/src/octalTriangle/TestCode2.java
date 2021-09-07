import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class TestCode2 {

    /*
     * Complete the 'sumOfLastRow' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER d
     *  3. INTEGER r
     */

    public static int sumOfLastRow(int s, int d, int r) {
int maxSlots=0, newVal=s,currentSum,totalSum=0;
for(int i=r;i>0;i--)
{
	    System.out.println("MAX"+maxSlots);
	    System.out.println("i"+i);

    maxSlots+=i;
}
List<Integer> slotList = new ArrayList<>(maxSlots);

slotList.add(s);
System.out.println("MAX SLOTS"+maxSlots);

int j;
for(j=0;j<maxSlots-1;j++)
{
   // System.out.println(newVal);

	for(int c=0;c<d;c++)
	{
		System.out.println("ITERATION "+c);
		newVal+=1;
		while(hasEight(newVal)|| hasNine(newVal) )
		{
			 System.out.println("CHANGING");
				System.out.println(newVal);
				newVal++;
		}

	
		
		
		 //System.out.println(c);

//		if(hasNine(newVal) || hasEight(newVal))
//		{
//			
//			while(hasEight(newVal))
//			{
//				System.out.println("CHECKING");
//
//				newVal++;
//				
//			}
//			if(hasNine(newVal))
//			{
//				newVal++;
//				
//			}
//		    System.out.println(newVal);
//		}
//		else
//		{
//			newVal+=1;
//			
//		}
//		
	}
	 //System.out.println("LOOP ITERATION"+j);
	System.out.println("JUST ADDED"+newVal);

	slotList.add(newVal);

}
System.out.println(slotList);

for(int x=r;x>0;x--)
{

	currentSum=sumOfDigits(slotList.get(maxSlots-x));
	System.out.println(currentSum);
	totalSum+=currentSum;
}
System.out.println(slotList.size());

System.out.println(totalSum);

    return totalSum;
    }
    public static boolean hasEight(int val) {
    	
    	while(val>0)
    	{
    		if(val%10==8)
    		{
    			
    			return true;
    		}
    		else
    		{
    			val/=10;
    		}
    	}
    	return false;
    
    }
public static boolean hasNine(int val) {
    	
    	while(val>0)
    	{
    		if(val%10==9)
    		{
    			return true;

    		}
    			else
        		{
        			val/=10;
        		}
    	}
    	return false;
    
    }
public static int sumOfDigits(int numVal)
{
	int digits=0, digitSum=0;
String stringVal = Integer.toString(numVal);
System.out.println("NUM VAL"+numVal);

	while(numVal>0)
	{
		digits++;
		numVal/=10;
		
	}
	while(digits>0)
	{
		digitSum = digitSum + Integer.parseInt((String)stringVal.subSequence(digits-1, digits));
		digits--;
		
	}
	return digitSum;
		
}
    public static boolean isProperOctal(int val) {
    	
    	while(val>0)
    	{
    		if(val%10==8||val%10==9)
    		{
    			return false;

    		}
    		else
    			return true;
    		
    	}
		return false;
    	
    }


    
}






