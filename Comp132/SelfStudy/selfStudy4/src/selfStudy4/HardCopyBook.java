package selfStudy4;

public class HardCopyBook extends Book{
	
	private double weight;
	private double shippingCost;

	public HardCopyBook(String name, double price, String bookId, double weight, double shippingCost) {
		super(name, price, bookId);
		this.shippingCost = shippingCost;
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	
	public double getShippingCost() {
		return shippingCost;
	}
	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "HardCopyBook " + super.toString() + " Weight = " + weight + ", Shipping Cost = " + shippingCost;
	}
	
	
	public double getTotalCost() {
		return getPrice() + getShippingCost();
	}
	
	
	
	
	
}
