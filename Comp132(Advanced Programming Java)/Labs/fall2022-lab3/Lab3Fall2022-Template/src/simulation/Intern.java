package simulation;

public class Intern {
    private String nameSurname;
    private String ID;


    public Intern(){
    }

    public Intern(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public Intern(String nameSurname, String iD) {
        this.nameSurname = nameSurname;
        ID = iD;
    }

    
    public String getNameSurname() {
        return nameSurname;
    }

    public String getID() {
        return ID;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public void setID(String iD) {
        ID = iD;
    }

   
    
    
}
