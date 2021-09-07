package practice;
import java.util.ArrayList;

public class pracarraylist {

	public static void main(String[] args) {
		/*ArrayList<Integer> list = new ArrayList<Integer>();     
		for (int j = 0; j < 4; j++)       
		  list.add(j * j);                    
		Integer intOb = list.get(2);      
		int n = list.get(3);                    
		Integer x = list.set(3,5);        
		x = list.remove(2);               
		list.add(1,7);            //What’s in list? 0, 7, 5
		System.out.println(list);
		list.add(2,8);            //What’s in list? 0, 7, 8
		System.out.println(list);


		for (Integer num : list)            
			System.out.println (num); */
		
		/*String[] colors = {"red", "orange", "yellow", "green"};
		int count = 0;
		for (String ele: colors) {
			if (ele.indexOf("e") >= 0) 
				count++;
		}
		System.out.println(count);*/
		
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.add(5);
		n.add(9);
	    n.add(3);
	    n.add(14);
	    n.add(30);
	    n.add(5);

	    insert(5);
	    //System.out.println(insert(nums));


	} 

	public static void insert (int n)
	{
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for (int k =1; k <=n; k++)
			numList.add(new Integer (k*k+1));
		
		//return numList;
		
	}


}
