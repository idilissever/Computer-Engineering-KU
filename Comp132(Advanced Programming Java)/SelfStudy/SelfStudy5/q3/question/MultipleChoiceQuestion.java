package q3.question;

public abstract class MultipleChoiceQuestion extends Question{

    private String[] choices;

    public MultipleChoiceQuestion(String questionText, double points, String[] choices) {
        super(questionText, points);
        this.choices = choices;
    }
    

    public abstract boolean isAnsweredCompletelyCorrectly();


    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

    
    
}
