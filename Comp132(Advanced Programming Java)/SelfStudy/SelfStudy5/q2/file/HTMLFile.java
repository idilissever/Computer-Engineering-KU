package file;
import java.util.List;

public class HTMLFile extends TextFile implements IOpenable{

    ExecutableFile browserCompatibleWith;
    private int htmlVersion;
    private List<HTMLFile> linksTo;
    
    public HTMLFile(String name, long size,  String encoding, int htmlVersion,
            ExecutableFile browserCompatibleWith, List<HTMLFile> linksTo) {
        //Default numChars for HTML files: 10000
        super(name, size, encoding, 10000);
        this.browserCompatibleWith = browserCompatibleWith;
        this.htmlVersion = htmlVersion;
        this.linksTo = linksTo;
    }

    public ExecutableFile getBrowserCompatibleWith() {
        return browserCompatibleWith;
    }

    public void setBrowserCompatibleWith(ExecutableFile browserCompatibleWith) {
        this.browserCompatibleWith = browserCompatibleWith;
    }

    public int getHtmlVersion() {
        return htmlVersion;
    }

    public void setHtmlVersion(int htmlVersion) {
        this.htmlVersion = htmlVersion;
    }

    public List<HTMLFile> getLinksTo() {
        return linksTo;
    }

    public void setLinksTo(List<HTMLFile> linksTo) {
        this.linksTo = linksTo;
    }

    @Override
    public String toString() {
        String links = "\nLinks to: ";
        for (File f : getLinksTo()) {
            links += f.getName() + " ";
            
        } 
        return "\nHTML " + super.toString() + "\nCompatible With:\t" + 
        browserCompatibleWith.getName() + "\nHTML Version:\t" + getHtmlVersion() + links;
    }

    public void onClick(){
        System.out.printf("%s %s", browserCompatibleWith.getName(), getName());
    }

    public void clear(){
        linksTo.clear();
        // setBrowserCompatibleWith("iesexplose.exe"); ???
    }

    @Override
    public String opensWith() {
        return getName();
    }


    

    
}
