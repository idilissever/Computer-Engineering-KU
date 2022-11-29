package twitter;

import java.util.ArrayList;

import user.RegularUser;
import user.User;
import user.VerifiedUser;

public class Twitter {

    private ArrayList<User> users = new ArrayList<User>();
    public Twitter() {
    }

    public User addUser(String username, String type) {
        
        if(type.equals("Verified")) {
            VerifiedUser newVerifiedUser = new VerifiedUser(username);
            users.add(newVerifiedUser);
            return newVerifiedUser; 
        } else if (type.equals("Regular")){
            RegularUser newRegularUser = new RegularUser(username);
            users.add(newRegularUser);
            return newRegularUser;
        } else {
            System.out.println("No such user type: " + type);
            return null;
        }
    }

    public int calculateRevenue() {
        int revenue = 0;
        for (User user : users) {
            if (user instanceof VerifiedUser){
                revenue += 8;
            }    
        }
        return revenue;
    }

    public void displayAllTweets() {
        for (User user : users) {
            user.displayTweets();
        }   
    }

    public void displayInteractions() {
        int verifiedUserTweets = 0;
        int regularUserTweets = 0;
        int totalTweets = 0;
        for (User user : users) {
            if(user instanceof VerifiedUser){
                verifiedUserTweets+= user.getTweets().size();
            } else {
                regularUserTweets+= user.getTweets().size();
            }            
        }
        totalTweets = regularUserTweets + verifiedUserTweets;

        System.out.printf("Total number of tweets: %d%nNumber of tweets from verified users: %d%nNumber of tweets from regular users: %d%n", 
        totalTweets, verifiedUserTweets, regularUserTweets);
    }



    


    

    
}