package q3.question;

public abstract class Question {
    
    private String questionText;
    private double points;
    
    public Question(String questionText, double points) {
        this.questionText = questionText;
        this.points = points;
    }

    public String getQuestionText() {
        return questionText;
    }

    public double getPoints() {
        return points;
    }

    public abstract double getGrade();

    

    
    
}
