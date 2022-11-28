package q3;
import java.util.Scanner;


public class Q3 {

	public static void main(String[] args) {		
		int i = 0;
		
		Scanner scan = new Scanner(System.in);
		while (i<10000) {
			System.out.println("Enter a 5 digit number: ");
			i = scan.nextInt();
			if (i<10000) System.out.println("not a valid number");
		}
		
		scan.close();

		
		int digit1 = i / 10000;
		int digit2 = (i%10000) / 1000;
		int digit3 = (i%1000) / 100;
		int digit4 = (i%100) / 10;
		int digit5 = i%10;
		
		System.out.print(i);
		
		if (digit1 == digit5) {
			if (digit2 == digit4) {
				System.out.println(" is a palindrome");	
			} else System.out.println(" is not a palindrome");
		} else System.out.println(" is not a palindrome");
	}

}
