package numguessr;

public class User {

    private String name;
    private int guessedNumber;
    private int totalScore;
    private int numberOfExceeds;

    public User(String name) {
        this.totalScore = 0;
		this.name = name;
        this.numberOfExceeds = 0;
        
    }

    public void setScore(int score) {
        this.totalScore = score;
    }

    public int getScore(){
        return this.totalScore;
    }

    public void setGuessedNumber(int input){
        this.guessedNumber = input;
    }

    public int getGuessedNumber(){
        return this.guessedNumber;
    }

    public String getName(){
        return this.name;
    }

    public void incrementTotalScore(int points) {
        this.totalScore += points;
    }

    public int getNumberOfExceeds(){
        return numberOfExceeds;
    }

    public void setNumberOfExceeds(int exceeds){
        numberOfExceeds = exceeds;
    }

    public void incrementNumberOfExceeds(int points){
        numberOfExceeds += points;
    }
}
