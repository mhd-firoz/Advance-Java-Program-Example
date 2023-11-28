package streamexample;

public class Book {
	
	private String author;
	private String titile;
	
	
	public Book(String author, String titile) {
		super();
		this.author = author;
		this.titile = titile;
	}


	public String getAuthor() {
		return author;
	}


	public String getTitile() {
		return titile;
	}


	@Override
	public String toString() {
		return "Book [author=" + author + ", titile=" + titile + "]";
	}
	
	

}
