package selfStudy4;

public class Purchase extends ShoppingCart{
	
	private String purchaseDate;
	private String shippingDate;
	private int deliveryLength;
	
	
	public Purchase(String purchaseDate, String shippingDateString, int deliveryLength) {
		this.purchaseDate = purchaseDate;
		shippingDate = shippingDateString;
		this.deliveryLength = deliveryLength;
	}


	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}


	public String getShippingDate() {
		return shippingDate;
	}
	public void setShippingDate(String shippingDate) {
		this.shippingDate = shippingDate;
	}


	public int getDeliveryLength() {
		return deliveryLength;
	}
	public void setDeliveryLength(int deliveryLength) {
		this.deliveryLength = (deliveryLength>=0) ? deliveryLength : 1;
	}
	
	
	public double getTotalPayment() {
		double totalPayment = 0.0;
		for (Book book : getContents()) {
			if (book == null) break;
			if(book instanceof HardCopyBook) {
				totalPayment += ((HardCopyBook)book).getTotalCost();
			} else totalPayment += book.getPrice();	
		}
		return totalPayment;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The purchase date: " + getPurchaseDate() + "\nThe delivery date: " + getShippingDate() + 
				"\nThe estimated delivery length is " + getDeliveryLength() + " days." + "\n" + super.toString();
	}
	
}
