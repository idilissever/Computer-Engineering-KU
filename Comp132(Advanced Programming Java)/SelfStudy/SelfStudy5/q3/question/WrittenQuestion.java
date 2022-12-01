package q3.question;

public class WrittenQuestion extends Question implements IPartialCreditGivable{
    
    private String[] responseWords;
    private String[] correctAnswerWords;
   
   
    public WrittenQuestion(String questionText, String[] responseWords, String[] correctAnswerWords, double points) {
        super(questionText, points);
        this.responseWords = responseWords;
        this.correctAnswerWords = correctAnswerWords;
    }


    public String[] getResponseWords() {
        return responseWords;
    }

    public void setResponseWords(String[] responseWords) {
        this.responseWords = responseWords;
    }
    public String[] getCorrectAnswerWords() {
        return correctAnswerWords;
    }

    @Override
    public double getGrade() {
        
        if (getCorrectAnswerWords().length != getResponseWords().length){
            return 0;
        }
        for(int i = 0; i < getResponseWords().length; i++){
            if( getResponseWords()[i] != getCorrectAnswerWords()[i]){
                return 0;
            }
        }
        return getPoints();
    }

    @Override
    public double getPartialCredit() {
        int correctWordCount = 0;
        double totalWordCount = getCorrectAnswerWords().length;

        for (String word : getResponseWords()) {
            for (String correctWord : getCorrectAnswerWords()) {
                if (word == correctWord){
                    correctWordCount++;
                }
            }  
        }

        double proportion = correctWordCount / totalWordCount; 
        return getPoints()*proportion;
    }

    

    

}
