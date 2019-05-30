package j2ee.p2;

public class Books {
	
	String title,author,publisher;
	
	int price;
	
	public Books(String title, String author, String publisher, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	public String toString() {
		String temp="author "+author+"title "+title+"publisher "+publisher+ "price   "+price;
		return temp;
		
	}
	
	

}
