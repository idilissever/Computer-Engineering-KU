package q2;

public class Q2 {
	public static void main(String[] args) {
		int i = 1;
		
		System.out.printf("N\tN^2\tN^3\tN^4%n%n");
		
		while (i<=5) {
			System.out.printf("%d\t%d\t%d\t%d%n", i, (int)Math.pow(i, 2), (int)Math.pow(i, 3), (int)Math.pow(i, 4));
			i++;
		}
	}

}
