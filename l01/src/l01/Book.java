package l01;

public class Book {

	public String title;
	public String author;
	public int price;
	
	public Book (String author, String title) {
		this.title = title;
		this.author = author;
	}

	public Book (String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public Book() {
	}
}
//Jayda