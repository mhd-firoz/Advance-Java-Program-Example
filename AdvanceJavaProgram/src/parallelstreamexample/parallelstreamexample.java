package parallelstreamexample;

import java.util.ArrayList;

public class parallelstreamexample {

	public static void main(String[] args) {
	Library lib = new Library();
		
	ArrayList<Book> books=lib.populateLibrary();
	
	//parallelStream is fast if we are using more data as compare to stream
		books.parallelStream().filter(book->{
			return book.getAuthor().startsWith("J");
		}).filter(book->{
			return book.getTitile().startsWith("E");
		}).forEach(System.out::println);
	}
}
