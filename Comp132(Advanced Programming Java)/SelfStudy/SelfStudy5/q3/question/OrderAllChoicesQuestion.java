package q3.question;

public class OrderAllChoicesQuestion extends MultipleChoiceQuestion implements IPartialCreditGivable{
    private int[] correctOrdering;
    private int[] studentOrdering;
    
    public OrderAllChoicesQuestion(String questionText, double points, String[] choices, int[] correctOrdering,
            int[] studentOrdering) {
        super(questionText, points, choices);
        this.correctOrdering = correctOrdering;
        this.studentOrdering = studentOrdering;
    }

    public int[] getCorrectOrdering() {
        return correctOrdering;
    }

    public void setCorrectOrdering(int[] correctOrdering) {
        this.correctOrdering = correctOrdering;
    }

    public int[] getStudentOrdering() {
        return studentOrdering;
    }

    public void setStudentOrdering(int[] studentOrdering) {
        this.studentOrdering = studentOrdering;
    }

    @Override
    public boolean isAnsweredCompletelyCorrectly() {
        if (getCorrectOrdering().length != getStudentOrdering().length){
            return false;
        }
        for(int i = 0; i < getCorrectOrdering().length; i++){
            if (getCorrectOrdering()[i] != getStudentOrdering()[i]){
                return false;
            }
        }
        return true;
    }

    @Override
    public double getGrade() {
        if (!isAnsweredCompletelyCorrectly()){
            return 0;
        }
        return getPoints();
    }

    @Override
    public double getPartialCredit() {
        if(isAnsweredCompletelyCorrectly()){
            return getPoints();
        }
        
        int numMatches = 0;
        double total = getCorrectOrdering().length;

        for (int i = 0; i < getCorrectOrdering().length; i++) {
            if (getCorrectOrdering()[i] == getStudentOrdering()[i]){
                numMatches++;
            }
        } 
        
        double proportion = numMatches / total;
        return getPoints() * proportion; 
    }


    
}
