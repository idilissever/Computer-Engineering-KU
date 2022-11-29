package twitter;

public class Tweet {
    private String content;

    public Tweet(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void edit(String newContent) {   
        this.content = newContent;
    }
    
    @Override
    public String toString() {
        return "Tweet: " + getContent();
    }

}
