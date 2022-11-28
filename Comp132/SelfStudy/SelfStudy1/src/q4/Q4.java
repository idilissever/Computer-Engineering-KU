package q4;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		int sum = 0;
		
		System.out.println("Enter a number to reach: ");
		
		Scanner scan = new Scanner(System.in);
		
		int numberToReach = scan.nextInt();
		
		while (sum<numberToReach) {
			System.out.println("Enter an integer: ");
			int temp = scan.nextInt();
			sum += temp;
		}
		
		

	}

}
