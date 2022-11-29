package simulation;
import java.util.ArrayList;

public class Training {

    private String title;
    private String code;
    private ArrayList<Intern> interns = new ArrayList<Intern>();
    
    
    public Training(String title, String code) {
        this.title = title;
        this.code = code;
    }


    public String getTitle() {
        return title;
    }
    public String getCode() {
        return code;
    }
    public ArrayList<Intern> getInterns() {
        return interns;
    }


    public void setTitle(String title) {
        this.title = title;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setInterns(ArrayList<Intern> interns) {
        this.interns = interns;
    }

    public void appendIntern(Intern intern){
        interns.add(intern);
    }

    public ArrayList<String> getInternList(){
        ArrayList<String> internNameList = new ArrayList<>();
        for (Intern intern : getInterns()) {
            internNameList.add(intern.getNameSurname());
        }
        return internNameList;
    }

    


    
}
