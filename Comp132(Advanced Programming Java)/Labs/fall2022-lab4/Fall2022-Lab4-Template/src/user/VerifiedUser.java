package user;

public class VerifiedUser extends User {

    public VerifiedUser(String username) {
        super(username);
     
    }
    public void editTweet(int id, String newContent) {
        getTweets().get(id).edit(newContent);
    }

    @Override
    public void displayTweets() {
        System.out.print("(Verified) "); 
        super.displayTweets();
        
    }



    

    
}

