package main;

import java.util.Random;
import java.util.Scanner;

import numguessr.NumGuessr;
import numguessr.User;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Player 1 name:");
		String user1Name = scan.next();
		System.out.println("Player 2 name:");
		String user2Name = scan.next();

		User user1 = new User(user1Name);
		User user2 = new User(user2Name);

		NumGuessr application = new NumGuessr(user1, user2);

		for (int gameTurn = 0; gameTurn < 3; gameTurn++){
			System.out.println( user1.getName() + " enter a number between 1 and 100 (both inclusive).");
			int input1 = scan.nextInt();
			while (input1>100 || input1<1){
				System.out.println("Wrong input. Try Again");
				input1 = scan.nextInt();
			}
			user1.setGuessedNumber(input1);

			
			System.out.println( user2.getName() + " enter a number between 1 and 100 (both inclusive).");
			int input2 = scan.nextInt();
			while (input2>100 || input2<1){
				System.out.println("Wrong input. Try Again");
				input2 = scan.nextInt();
			}
			user2.setGuessedNumber(input2);

			application.play(getRandomNumber());

			
		}

		application.whoWon();

		scan.close();

		// 1. Get 2 names for the users.
		
		// 2. Create 2 User objects using those names.
		
		// 3. Create a Numguessr object using 2 User objects.

		// 4. Create a loop for the 3 rounds of Numguessr

		// For each iteration of the loop:
	
		// 4.1. Get a number between 1 and 100 (both inclusive) from the first user.

		// 4.2. Get a number between 1 and 100 (both inclusive) from the second user.

		// 4.3. Play a round of Numguessr with a computer generated random number.

		// 5. At the end, announce the winner.

	}

	// Use this method to get a random number from computer between 1 and 100 (both inclusive).
	public static int getRandomNumber() {
		return new Random().nextInt(100) + 1;
	}
}


