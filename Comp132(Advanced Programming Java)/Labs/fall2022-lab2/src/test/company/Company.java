package company;

public class Company {

    private String nameOfCompany;
    private Position[] arrayOfPositions = new Position[5];

// constructor for Company class
    public Company(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

//getter methods
    public Position[] getArrayOfPositions() {
        return arrayOfPositions;
    }
    public String getNameOfCompany() {
        return nameOfCompany;
    }


// setter methods   
    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }
    public void setArrayOfPositions(Position[] arrayOfPositions) {
        this.arrayOfPositions = arrayOfPositions;
    }


    public void openPosition(String positionName, String minEducationLevel) {

        Position newPosition = new Position(positionName, minEducationLevel);

        for (int i=0; i<arrayOfPositions.length; i++) {
            if (arrayOfPositions[i] == null) {
                arrayOfPositions[i] = newPosition;
                break;
            }
        }
    }

    public boolean hireEngineer(String positionName, Engineer engineer) {
        boolean isHired = false;
        for (Position position : arrayOfPositions) {
            if (position != null && position.getNameOfPosition().equals(positionName)) {
                isHired = position.hireEngineer(engineer);
                break;
            }   
        }
        return isHired;
    }

    public String toString() {
        String output = "";
        for (Position position : arrayOfPositions) {
            if (position != null){
                output = output + positionToString(position) + "\n";
            }
        }
        return output;
    }

    private String positionToString(Position position){
        String positionName = "";
        String minEduLevel = "";
        String engineers = "";

        positionName = position.getNameOfPosition();
        minEduLevel = position.getMinimumEducationLevel();
        for (Engineer engineer : position.getArrayOfEngineers()) {
            if (engineer != null){
                engineers = engineers + engineer.getID() + " " + engineer.getName() + "\n";
            }
            
        }
        return "Position Name: " + positionName + "\nCompany Name: " + getNameOfCompany() +
        "\nMinimum Education Level: " + minEduLevel + "\nHired Engineers:\n" + engineers;

    }

    
}
