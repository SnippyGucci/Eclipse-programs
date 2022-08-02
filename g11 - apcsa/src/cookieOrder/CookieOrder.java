package cookieOrder;

public class CookieOrder {

	private String cookieVariety;
	
  	private int boxes;
  	
  	public CookieOrder (String variety, int numBoxes) {
  		this.boxes = numBoxes;
  		this.cookieVariety = variety;
  		
  	}
  	
  	public String getVariety() {
  		return this.cookieVariety;
  		
  	}
  	
  	public int getNumBoxes() {
  		return this.boxes;
  		
  	}
  	
  	public String toString() {
  		return cookieVariety + " " + boxes;
  		
  	}
  	
}
