package streamexample;

import java.util.ArrayList;

public class StreamExample {

	public static void main(String[] args) {
	Library lib = new Library();
		
	ArrayList<Book> books=lib.populateLibrary();
	
		
		books.stream().filter(book->{
			return book.getAuthor().startsWith("J");
		}).filter(book->{
			return book.getTitile().startsWith("E");
		}).forEach(System.out::println);
	}
}
