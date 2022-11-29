package company;

public class Engineer {

    private String name;
    private String ID;
    private String educationLevel;


// constructor for Engineer Class
    public Engineer(String name, String ID, String educationLevel) {
        this.name = name;
        this.ID = ID;
        this.educationLevel = educationLevel;
    }

// getter methods
    public String getName(){
        return name;
    }
    public String getID() {
        return ID;
    }
    public String getEducationLevel() {
        return educationLevel;
    }

// setter methods
    public void setName(String name) {
        this.name = name;
    }
    public void setID(String iD) {
        ID = iD;
    }
    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }


// method that updates level to the next higher level
    public void updateLevel(){
        switch (educationLevel) {
            case "BS": educationLevel = "MS";
            case "MS": educationLevel = "PHD";
            case "PHD": ;
            default: ;
        }
    }


// method that updates levelt to given level
    public void updateLevel(String toLevel) {
        if (educationLevel.compareTo(toLevel) < 0) {
            educationLevel = toLevel;
        }
    }

    
 
    

}
