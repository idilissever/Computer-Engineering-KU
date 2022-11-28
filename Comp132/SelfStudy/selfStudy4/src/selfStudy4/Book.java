package selfStudy4;

public class Book {
	
	private String name;
	private double price;
	private String bookId;
	
	
	public Book(String name, double price, String bookId) {
		super();
		this.name = name;
		this.price = price;
		this.bookId = bookId;
	}
	
	public Book(){
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if (price>=0) {
			this.price = price;
		}
	}


	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		String defaultBookId = "0123456789";
		
		if (bookId.length()==10) {
			this.bookId = bookId;
		} else this.bookId = defaultBookId;
	}
	
	
	public void applyDiscount(double discountPercentage) {
		setPrice(getPrice() - discountPercentage*getPrice());	
	}


	@Override
	public String toString() {
		return "Book Name = " + name + ", Price = " + price + ", Book ID = " + bookId;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}	
