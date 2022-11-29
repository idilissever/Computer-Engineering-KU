package user;

import java.util.ArrayList;

import twitter.Tweet;

public class User {

    protected String username;
    private int id;
    private static int idAssignment = 1;
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    private ArrayList<User> followedUsers = new ArrayList<User>();

    public User(String username) {
        this.username = username;
        id = idAssignment;
        idAssignment++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(ArrayList<Tweet> tweets) {
        this.tweets = tweets;
    }

    public void displayTweets() {
        System.out.println(getUsername() + ":");
        for (Tweet tweet : tweets) {
            System.out.println(tweet.toString());
        }
        System.out.println();
    }

    public void sendTweet(String content) {
        tweets.add(new Tweet(content));
    }

    public void followUser(User user) {
        followedUsers.add(user);
    }

    public void displayFollowedUserTweets() {
        for (User user : followedUsers) {
            if (user instanceof VerifiedUser){
                user.displayTweets();
            }
        }
        for (User user : followedUsers) {
            if (user instanceof RegularUser)
                user.displayTweets();
        }
    }

}