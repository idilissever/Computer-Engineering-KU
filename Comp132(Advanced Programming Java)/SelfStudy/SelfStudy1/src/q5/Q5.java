package q5;


public class Q5 {

	public static void main(String[] args) {
		for (int i = 1; i<= 10 ; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int k = 1; k <= 10 ; k++) {
			for (int l = 10; l >= k; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i<=10; i++) {
			for (int j = 1; j<i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= 10-i; k++) {
				System.out.print("*");
			}
				
			System.out.println();
		}
		
		
		
		for (int j = 1; j<=10; j++) {
			for (int k = 1; k <= (10-j); k++) {
				System.out.print(" ");
			}
			for (int l = 1; l<= j; l++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
			
		
	}

}
