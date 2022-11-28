package selfStudy4;

public class ShoppingCart {
	
	private Book[] contents;
	private int numEntriesInCart;
	
	public ShoppingCart() {
		this.contents = new Book[10];
		this.numEntriesInCart = 0;
	}
	
	public int getNumEntriesInCart() {
		return numEntriesInCart;
	}
	public void setNumEntriesInCart(int numEntriesInCart) {
		this.numEntriesInCart = numEntriesInCart;
	}
	
	
	public Book[] getContents() {
		return contents;
	}
	
	public boolean addBook(Book book) {
		if (numEntriesInCart<=10) {
			contents[numEntriesInCart] = book;
			numEntriesInCart++;
			return true;
		} else return false;
	}
	
	public boolean removeLastBook() {
		if (numEntriesInCart == 0) {
			return false;
		} else {
			numEntriesInCart--;
			contents[numEntriesInCart] = null;
			return true;
		}
	}
	@Override
	public String toString() {
		
		String outputString = "==========================\n" + 
				"This cart has " + numEntriesInCart + " books. \n";
		
		double totalPrice = 0.0;
		double totalCost = 0.0;
		
		for (Book book : contents) {
			if (book == null) break;
			outputString += book.toString() + "\n";
			totalPrice += book.getPrice();
			
			if (book instanceof HardCopyBook) totalCost += ((HardCopyBook)book).getTotalCost();
			else totalCost += book.getPrice();
		}
		outputString += "Total price of the books in the cart: " + totalPrice + "\n" +
				"Total cost of the books in the cart: " + totalCost + ". \n";
					
		return outputString;
	}
	
	
	
	
	

}
