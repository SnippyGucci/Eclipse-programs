package cookieOrder;

import java.util.ArrayList;

public class MasterOrder {
	
	private ArrayList<CookieOrder> orders;

  	public MasterOrder() {
  		orders = new ArrayList<CookieOrder>();
  	}

  	public void addOrder (CookieOrder theOrder) {
  		orders.add(theOrder);
  	}

  	public int getTotalBoxes() {
  		int total = 0;
  		
  		if (orders.size() > 0) {
  			for (int i = 0; i < orders.size(); i++)
  				total += orders.get(i).getNumBoxes();
  		
  		}
  		
  		return total;

  	}

  	public int removeVariety (String cookieVar) {
  		int boxesRemoved = 0;
  		
  		for (int i = 0; i < orders.size(); i++) {
  			if (orders.get(i).getVariety().equals(cookieVar)) {
  				boxesRemoved += orders.get(i).getNumBoxes();
  				orders.remove(i);
  				i--;
  			}
  		}
  		
  		return boxesRemoved;
  	}

  	public String toString() {
  		return orders.toString();
  	}

  	
}
