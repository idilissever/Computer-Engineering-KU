package company;

public class Position {

    
    private String nameOfPosition;
    private Engineer[] arrayOfEngineers = new Engineer[6]; 
    private String minimumEducationLevel;


// constructor for Position Class
    public Position(String nameOfPosition, String minimumEducationLevel) {
        this.nameOfPosition = nameOfPosition;
        this.minimumEducationLevel = minimumEducationLevel;
    }

// getter methods
    public String getNameOfPosition(){
        return nameOfPosition;
    }
    public String getMinimumEducationLevel(){
        return minimumEducationLevel;
    }
    public Engineer[] getArrayOfEngineers() {
        return arrayOfEngineers;
    }

// setter methods
    public void setNameOfPosition(String nameOfPosition) {
        this.nameOfPosition = nameOfPosition;
    }
    public void setArrayOfEngineers(Engineer[] arrayOfEngineers) {
        this.arrayOfEngineers = arrayOfEngineers;
    }
    public void setMinimumEducationLevel(String minimumEducationLevel) {
        this.minimumEducationLevel = minimumEducationLevel;
    }



    public boolean hireEngineer(Engineer engineer) {
        if (engineer.getEducationLevel().compareTo(minimumEducationLevel) >= 0) {
            for (int i = 0; i < arrayOfEngineers.length; i++) {
                if (arrayOfEngineers[i] == null) {
                    arrayOfEngineers[i] = engineer;
                    return true;
                }
            }
        }
        return false;
    }
}