package q1;

import java.security.SecureRandom;

public class ArcheryGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] scores = new int[4][3];
		SecureRandom random = new SecureRandom();
		
		for (int i = 0; i<4 ; i++) {
			for (int j = 0; j<3; j++) {
				scores[i][j] = random.nextInt(10) + 1;
			}
		}
		System.out.printf("%15s%12s%13s%12s%15s%n%n", "Player Number", "First Shot", "Second Shot", "Third Shot", "Total Points");
		
		for (int i=0; i<4; i++) {
			int sum = scores[i][0] + scores[i][1] + scores[i][2];
			System.out.printf( "%15d%12d%13d%12d%15d%n", i , scores[i][0], scores[i][1], scores[i][2], sum );
		
		}
		

	}

}
