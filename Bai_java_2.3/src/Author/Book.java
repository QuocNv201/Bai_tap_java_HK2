package Author;

public class Book {
	private String isbn;
	private String name;
	private Author author;
	private double price;
	private int qty;
	
	public Book( String isbn, String name, Author author, double price) {
		this.isbn = isbn;
		this.name = name;
		this.price = price;
		this.author = author;
		this.qty = 0;
	}
	public Book( String isbn, String name, Author author, double price, int qty) {
		this.isbn = isbn;
		this.name = name;
		this.price = price;
		this.author = author;
		this.qty = qty;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getAuthorName() {
		return author.getName();
	}
	@Override
	public String toString () {
		   return "Book[isbn="+isbn+",name="+name+","+author+",price="+price+",qty="+qty+"]";
	}
}
