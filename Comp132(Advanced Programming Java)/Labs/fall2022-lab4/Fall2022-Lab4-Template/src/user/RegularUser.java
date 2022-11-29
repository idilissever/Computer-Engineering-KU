package user;

public class RegularUser extends User {

    public RegularUser(String username) {
        super(username);
    }

    public void deleteTweet(int id) {
        getTweets().remove(id);
    }

    @Override
    public void displayTweets() {
        System.out.print("(Regular) ");
        super.displayTweets();
    }


    
}
