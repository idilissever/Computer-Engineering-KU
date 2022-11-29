package numguessr;

public class NumGuessr {

    private User user1;
    private User user2;
    private int totalUsersDistanceDiff;

    public NumGuessr(User user1, User user2) {
        this.user1 = user1;
        this.user2 = user2;

    }
    
    public void play(int numberToGuess){
        int dist1 = numberToGuess - user1.getGuessedNumber();
        int dist2 = numberToGuess - user2.getGuessedNumber();

        if (dist1<0){
            dist1 = - dist1;
            user1.incrementNumberOfExceeds(1);
        }
        if (dist2<0){
            dist2 = - dist2;
            user2.incrementNumberOfExceeds(1);
        }

        System.out.println("The number to guess was: " + numberToGuess);

        if ((user1.getGuessedNumber() + user2.getGuessedNumber()) % 3 == 0) {
            int diff = user1.getGuessedNumber() - user2.getGuessedNumber();
            if (diff < 0) {
                incrementTotalUserScoreDifference(-diff);
            } else {
                incrementTotalUserScoreDifference(diff);
            }
        }

    

        if (dist1 == 0 && dist2 == 0){
            user1.incrementTotalScore(202);
            user2.incrementTotalScore(202);
            System.out.println("Both "+ user1.getName() + " and "+ user2.getName() + " guessed the number correctly!");

        } else if (dist1 == 0){
            user1.incrementTotalScore(101);
            System.out.println(user1.getName() + " guessed the number correctly!");

        } else if (dist2 == 0){
            user2.incrementTotalScore(101);
            System.out.println(user2.getName() + " guessed the number correctly!");

        } else if (dist1<dist2){
            user1.incrementTotalScore(dist2);
            System.out.println(user1.getName() + " won.");

        } else if (dist2<dist1){
            user2.incrementTotalScore(dist1);
            System.out.println(user2.getName() + " won.");

        } else {
            user1.incrementTotalScore(101);
            user2.incrementTotalScore(101);
            System.out.println(user1.getName()+ " and "+ user2.getName()+ " were the same distance to " + numberToGuess + "!");
        }


    }
    public void whoWon(){
        if (user2.getScore() < user1.getScore()) {
            System.out.println(user1.getName() + " has won 3 rounds of NumGuessr with a total " + user1.getScore() + " points.");
        } else if (user1.getScore() < user2.getScore()){
            System.out.println(user2.getName() + " has won 3 rounds of NumGuessr with a total " + user2.getScore() + " points.");
        } else {
            System.out.println("3 rounds of NumGuessr between " + user1.getName() + " and " + user2.getName() + " were resulted with a tie with both scoring " + user1.getScore() + " points.");
        }
        System.out.println("Number of exceeds for " + user1.getName() + ": " + user1.getNumberOfExceeds() + 
        "   Number of exceeds for " + user2.getName() + ": " + user2.getNumberOfExceeds());

        System.out.println("The total difference on the rounds with total guesses is divisible by three: " + getTotalUsersDistanceDifference());
    }

    public int getTotalUsersDistanceDifference() {
		return totalUsersDistanceDiff;
	}

	public void setTotalUsersDistanceDifference(int totalUsersDistanceDiff) {
		this.totalUsersDistanceDiff = totalUsersDistanceDiff;
	}

	public void incrementTotalUserScoreDifference(int diff) {
		this.totalUsersDistanceDiff += diff;
    }
}


