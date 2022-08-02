package library;

public class Client {
	private String name;
	private Book first;
	private Book second;
	private Book third;
	
	public Client(String n) {
		name = n;
		first = null;
		second = null; 
		third = null;

	}
	
	public Client(String n, Book b1) {
		name = n;
		first = b1;
		second = null;
		third = null;
		
	}
	
	public Client(String n, Book b1, Book b2) {
		name = n;
		first = b1;
		second = b2;
		third = null;
		
	}
	
	public Client(String n, Book b1, Book b2, Book b3) {
		name = n;
		first = b1;
		second = b2;
		third = b3;
		
	}
	
	public boolean canBorrow() {
		if(first == null || second == null || third == null) {
			System.out.println("Yes, you can borrow a book");
			return true;
		}
		System.out.println("No, you cannot borrow a book");
		return false;   
    }
    
    public boolean returnBook(Book b) {
    	if(b == first || b == second || b == third) {
    		System.out.println("Thank you for returning " + b.toString());
    		return true;
    	}    
    	
    	System.out.println("You can not return a book you do not have: " + b.toString());
    	return false;
    }
    
    public boolean borrowBook(Book b) {
    	if(first == null || second == null || third == null) { 
    		if(first == null) {
    			b = first;
    		}
    		if(second==null) {
    			b = second;
    		}
    		if(third==null) {
    			b = third;
    		}
    		
    		System.out.println("You have borrowed " + b.toString());
    		return true;
    	}
    	
    	System.out.println("You can not borrow this book: " + b.toString());
    	return false;

    }
	
	
	public boolean hasBook(Book b) {
		if(b == first||b == second||b == third) {
			 System.out.println("Yes, "+ name +" has "+ b.toString()); 
			 return true;
		}
		
		System.out.println("No, "+ name +" does not have "+ b.toString()); 
		return false;
		
	}
	
	public String toString() {
		return "\nClient Name: "+ name +"\n\nBook 1:"+ first.toString()+"\n\nBook 2:"+ second.toString()+"\n\nBook 3:"+ third.toString();
	    	
	}
}
