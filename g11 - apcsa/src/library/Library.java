package library;

public class Library {
	public static void main(String[] args) {
		Book book1 = new Book ("Fundamentals of Java", "Kenneth A. Lambert");
		Book book2 = new Book ("Grapes of Wrath", "John Steinbeck");
		Book book3 = new Book ("Harry Potter", "J.K. Rowling");
		Book book4 = new Book ("Red Fish Blue Fish", "Dr. Seuss");		
		
		book1.setTitle("Fundamentals of Java");
		book1.setAuthor("Kenneth A. Lambert");
		book2.setTitle("Grapes of Wrath");
		book2.setAuthor("John Steinbeck");


		Client client1 = new Client("John Brock", book1, book2, book3);

		client1.returnBook(book2);
		System.out.println(client1.toString());

		System.out.println();
		client1.hasBook(book1);

		System.out.println();
		client1.hasBook(book4);

		System.out.println();
		client1.returnBook(book4); 

		System.out.println();
		client1.borrowBook(book4);

		System.out.println();
		client1.canBorrow();
		
		
	}
}
