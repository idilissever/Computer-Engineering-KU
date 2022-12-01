package q3.question;

public class PickOneChoiceQuestion extends MultipleChoiceQuestion{

    private int choiceIndex;
    private int correctIndex;
    
    public PickOneChoiceQuestion(String questionText, double points, String[] choices, int choiceIndex,
            int correctIndex) {
        super(questionText, points, choices);
        this.choiceIndex = choiceIndex;
        this.correctIndex = correctIndex;
    }

    public int getChoiceIndex() {
        return choiceIndex;
    }

    public void setChoiceIndex(int choiceIndex) {
        this.choiceIndex = choiceIndex;
    }

    public int getCorrectIndex() {
        return correctIndex;
    }

    public void setCorrectIndex(int correctIndex) {
        this.correctIndex = correctIndex;
    }

    @Override
    public boolean isAnsweredCompletelyCorrectly() {
        if (getChoiceIndex()!= getCorrectIndex()){
            return false;
        }

        return true;
    }

    @Override
    public double getGrade() {
        if(!isAnsweredCompletelyCorrectly()){
            return 0;
        }
        return getPoints();
    }

    

}