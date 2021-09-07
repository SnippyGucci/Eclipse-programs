package library;

public class Book {
	private String title;
	private String author;
	
	public Book (String t, String a) {
		title = t;
		author = a;
		
	}
	
	public Book () {
		title = "title";
		author = "author";
		
	}
	
	public String getTitle() {
		return title;
		
	}
	
	public String getAuthor() {
		return author;
		
	}
	
	public void setTitle(String t) {
		title = t;
				
	}
	
	public void setAuthor(String a) {
		author = a;
		
	}
	
	public String toString() {
		return "\nBook title: " + title + "\nBook author: " + author;
		
	}
}
