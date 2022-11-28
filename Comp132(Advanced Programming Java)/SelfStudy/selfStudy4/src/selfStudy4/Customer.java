package selfStudy4;

public class Customer {
	
	private String userName;
	private String userSurname;
	
	private Purchase[] purchaseHistory = new Purchase[2];
	private int purchaseCount = 0;
	
	
	public Customer(String userName, String userSurname) {
		this.userName = userName;
		this.userSurname = userSurname;
	}


	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserSurname() {
		return userSurname;
	}
	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}


	public int getPurchaseCount() {
		return purchaseCount;
	}
	public void setPurchaseCount(int purchaseCount) {
		this.purchaseCount = purchaseCount;
	}
	
	public boolean placePurchase(Purchase current) {
		if (purchaseCount < 2) {
			purchaseHistory[purchaseCount] = current;
			purchaseCount++;
			return true;
		} else return false;
		
		
	}
	
	public double getTotalAmountSpent() {
		double totalAmountSpent = 0.0;
		for (Purchase purchase : purchaseHistory) {
			if(purchase == null) break;
			totalAmountSpent += purchase.getTotalPayment();
		}
		return totalAmountSpent;
	}
	
	@Override
	public String toString() {
		String outputString = "-----------------------------\n";
		
		int totalNumberOfBooks = 0;
		
		for (Purchase purchase : purchaseHistory) {
			if (purchase == null) break;
			totalNumberOfBooks += purchase.getNumEntriesInCart();
			outputString += purchase.toString() + "\n";
		}
		
		outputString += "Total number of books purchased is: " + totalNumberOfBooks + ".\nTotal amount of money spent is " + getTotalAmountSpent() + ".\n";
		return outputString;
	}
	
	
	
	

}
