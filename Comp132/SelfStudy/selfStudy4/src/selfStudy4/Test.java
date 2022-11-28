package selfStudy4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//part1 testing
		
//		var book1 = new Book("The Archer", 200,"1234569875");
//		var book2 = new Book("Veronika Decides to Die", 250,"3214567893");
//		var book3 = new EBook("The Alchemist", 75, "2135467859", 2,"pdf",3);
//		var book4 = new EBook("The Fifth Mountain", 120, "4268792215", 3,"pdf",2);
//		var book5 = new HardCopyBook("Eleven Minutes", 100, "1652329872", 220, 10);
//		var book6 = new HardCopyBook("Brida", 150, "3692587146", 300, 15);
//		var book7 = new HardCopyBook("The Spy", 450, "7539516542", 550, 20);
//		
//				
//		var shop = new ShoppingCart();
//		shop.addBook(book1);
//		shop.addBook(book2);
//		shop.addBook(book3);
//		shop.addBook(book4);
//		shop.addBook(book5);
//		shop.addBook(book6);
//		shop.addBook(book7);
//		
//		System.out.println(shop.toString());
		
		// part2 testing
		
		var customer1 = new Customer("İdil", "İşsever");
		
		var book8 = new HardCopyBook("Java How to Program", 25, "2364829281", 200, 25);
		var book9 = new HardCopyBook("C How to Program", 20, "3628738223", 100, 30);
		var book10 = new HardCopyBook("C++ How to Program", 25, "2374538292", 150, 30);
		var book11 = new HardCopyBook("The Java Programming Language", 30, "2364937281", 140, 10);

		var purchase1 = new Purchase("07/11/2022", "12/11/2022", 5);
		purchase1.addBook(book8);
		purchase1.addBook(book9);
		purchase1.addBook(book10);
		purchase1.addBook(book11);
		
		if (customer1.placePurchase(purchase1)) {
			System.out.println(customer1.toString());
		}
		
		var book12 = new EBook("A Humble Introduction to Erlang", 75,"273892476", 200.0 , "pdf", 1);
		var book13 = new EBook("Principles of Programming Languages", 125, "2368327854", 150, "chm", 3);
		var book14 = new EBook("Advanced Operating Systems", 50, "2537486733", 250, "chm", 2);
		
		var purchase2 = new Purchase("08/11/2022", "09/11/2022", 1);
		purchase2.addBook(book12);
		purchase2.addBook(book13);
		purchase2.addBook(book14);
		
		if (customer1.placePurchase(purchase2)) {
			System.out.println(customer1.toString());
		}
		
		var book15 = new Book("Claudy with a chance of Meatballs", 20, "2537287253");
		
		var purchase3 = new Purchase("08/11/2022", "09/11/2022", 1);
		purchase1.addBook(book15);
		
		
		if (customer1.placePurchase(purchase3)) {
			System.out.println(customer1.toString());
		} else System.out.println("We cannot process your purchase for now! Please try again later.");
	


		

	}

}
