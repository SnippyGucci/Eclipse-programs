package NumberSet;

public class tester {

	public static void main(String[] args) {
		
		NumberSet ns = new NumberSet();
		ns.insert(12);
		ns.insert(3);
		ns.insert(45);
		ns.insert(-67);
		ns.insert(189);
		ns.insert(-10);
		ns.insert(111);
		ns.insert(-134);
		ns.insert(51);
		ns.insert(-16);
		ns.insert(-67);
		ns.insert(75);
		ns.insert(181);
		ns.insert(62);
		
		System.out.print("Contents: ");
		System.out.println(ns); //outputs contents
		System.out.println("Number of elements: " + ns.size()); //num of contents
		
		//attempts to remove 70
		ns.remove(70);
		System.out.println("70 does not exist.");
		
		//finds 10th value
		int i = 10;
		
		if (i < 10 || i > ns.size()) { 
			System.out.println(i + " is not valid.");
			
		} else {
			System.out.println(i + "'s value is " + ns.findkth(i-1));
			
		}
		
		System.out.println("There is " + countNegatives(ns) + " negative number."); //Invoke  the countNegatives method and display its return value
		removeNegatives(ns);//Invoke the removeNegatives method
		System.out.println("The total is " + calcSum(ns));//Invoke the calcSum method and print the total of all the elements in ns
	}
	
	public static int calcSum (NumberSet t) {
		int total = 0;
		for (int n = 0; n < t.size(); n++)
			total += t.findkth(n);
		
		return total;
	}
	
	public static int countNegatives (NumberSet t) {
		int negTotal = 0;
		for (int n = 0; n < t.size(); n++) {
			if(t.findkth(n) < 0)
				negTotal++;
		}
		return negTotal;
		
	}
	
	public static void removeNegatives (NumberSet t) {
		for (int n = 0; n < t.size(); n++) {
			while (t.findkth(n) < 0)
				t.remove(t.findkth(n));
		}
	}	
}
