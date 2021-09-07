package NumberSet;
import java.util.*;

public class NumberSet {
	private List<Integer> numSet;       //declare an ArrayList of Integer objects
	
	public NumberSet() { 
		numSet = new ArrayList<Integer>();
	}
	
	public int size() {
		return numSet.size();
	}
	
	public void insert (int number) { 
		for (int n = 0; n < size(); n++) {
			if (number == numSet.get(n)) {
				return;
			} else if (number > numSet.get(n)) {
				continue;
			}
			
			numSet.add(n, number);
			return;
		}
		
		numSet.add(number);
	}
	
	//Postcondition: remove will return true if number is located in 
	//		 	 theList and has been removed successfully.
	//			 Otherwise, remove returns false.
	public boolean remove (int number) { 
		for (int n = 0; n < size(); n++) {
			if (numSet.get(n) == number) {
				numSet.remove(n);
				return true;
			}
		}
		
		return false;
	}
	
	//Precondition: k is an int. 0 <= k < size()
	//Postcondition: findkth will return element at index k and
	//               does not modify the theList
	public int findkth (int k) { 
		return numSet.get(k);
	}
	
	public boolean contains (int number) {  
		for (int n = 0; n < size(); n++) {
			if (numSet.get(n) == number)
				return true;
		}
		
		return false;
	}
	
	public String toString() {
		return numSet.toString();
	}
	
	public void extractNum (int number) {
		for(int n = 0; n < size(); n++) 
			numSet.remove(n);
	}
}
