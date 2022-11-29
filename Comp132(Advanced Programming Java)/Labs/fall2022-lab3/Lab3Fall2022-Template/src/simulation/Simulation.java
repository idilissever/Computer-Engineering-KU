package simulation;

import java.util.ArrayList;
import java.util.Random;


public class Simulation {

    private int a;
    private int b;
    private int[][] performanceTable;
    private ArrayList<Training> trainings = new ArrayList<>();

    public Simulation(int a, int b) {
        this.a = a;
        this.b = b;
        performanceTable = new int[a][b];
    }

    // getters
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int[][] getPerformanceTable() {
        return performanceTable;
    }

    public ArrayList<Training> getTrainings() {
        return trainings;
    }

    // setters
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setPerformanceTable(int[][] performanceTable) {
        this.performanceTable = performanceTable;
    }

    public void setTrainings(ArrayList<Training> trainings) {
        this.trainings = trainings;
    }

    public void appendTraining(Training trn) {
        trainings.add(trn);
    }

    public void simulateTable() {

        var rand = new Random(1500);

        for (int i = 0; i < getA(); i++) {
            for (int j = 0; j < getB(); j++) {
                performanceTable[i][j] = rand.nextInt(90) + 10;
            }
        }

        System.out.printf("%-16s%-5s%-5s%-7s %-4s %-4s %n", "Name", trainings.get(0).getTitle(), trainings.get(1).getTitle(),
                trainings.get(2).getTitle(),
                trainings.get(3).getTitle(), trainings.get(4).getTitle());

        System.out.println("---------------------------------------------");

        for (int i = 0; i < getA(); i++) {
            System.out.printf("%-15s| %-3d| %-3d|  %-4d| %-2d | %-2d |%n%n", trainings.get(0).getInternList().get(i),
                    performanceTable[i][0], performanceTable[i][1],
                    performanceTable[i][2], performanceTable[i][3], performanceTable[i][4]);
        }

    }

    public void showInternPerformance() {

        
        System.out.println("------------------------ Interns performance ---------------------------------\n");
        for (int i = 0; i < getA(); i++) {

            int sum = (performanceTable[i][0] + performanceTable[i][1] + performanceTable[i][2] + performanceTable[i][3] + performanceTable[i][4]);
            double average = sum / getB();

            System.out.printf("%s has the Average score of %.1f%n%n", trainings.get(1).getInternList().get(i), (double)average );
        }
    }

    public void showTrainingLevel(){

        System.out.println("------------------------ Trainings performance ---------------------------------\n");

        for (int j = 0; j < getB(); j++ ){
            
            double average = (performanceTable[0][j] + performanceTable[1][j] + performanceTable[2][j] + performanceTable[3][j] + performanceTable[4][j] + 
            performanceTable[5][j] + performanceTable[6][j])/ (double)getA();

            average = (int)average;
            
            String threshold = "";

            if (average>65) {
                threshold = "above";
            } else threshold = "below";

            System.out.printf("The average of %s is %.1f, then, its level is %s the threshold.\n", trainings.get(j).getTitle(), (double)average, threshold);
        }
        System.out.println();

    }

    public void findMax(){
        int max = 0;
        int maxI = 0;
        int maxJ = 0;
        for(int i=0; i< getA(); i++){
            for( int j = 0; j<getB(); j++){
                if(performanceTable[i][j]>max){
                    max = performanceTable[i][j];
                    maxI = i;
                    maxJ = j;
                }

            }
        }
        System.out.printf("Maximum performance: %d%nIntern: %s, ID: %s%nTraining: %s, CODE: %s%n", max, trainings.get(0).getInternList().get(maxI), 
        trainings.get(0).getInterns().get(maxI).getID(), trainings.get(maxJ).getTitle(), trainings.get(maxJ).getCode() );
    }

    public void updateTrainingPerformance (String trainingName, String internName, int newPerformance){
        int j = 0;
        for (Training trn : trainings) {
            if (trn.getTitle().equals(trainingName)){
                for(int i=0; i < trn.getInterns().size(); i++){
                    if(internName.equals(trn.getInternList().get(i))){
                        performanceTable[i][j] = newPerformance;
                    }
                }
            }
        j++;    
        }
    }

}
