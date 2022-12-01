package file;
import java.util.*;

public abstract class File{

    private long size; //size of file in bytes
    private String name; //without spaces
    private Date dateCreated; //

    public File(String name, long size){
        this.size = size;
        this.name = name;
        this.dateCreated = new Date();
    }
    

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String fileName) {
        if(fileName.contains(" ")) {
			fileName = fileName.replace(" ", "");
		}
        this.name = fileName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public abstract void onClick();

    public String toString(){
        return String.format("%s:%n%s:\t%s%n%s:\t%d%n%s:\t%s", "File", "Name", getName(), 
        "Size", getSize() , "Date created", getDateCreated().toString());

    }

    public static void callPolymorphicMethods(File[] files){
        for (File f : files) {
            System.out.println("\nFile: " + f.getName());
            f.onClick();

            if(f instanceof IOpenable){
                System.out.println("Open with: " + ((IOpenable)f).opensWith());
            } else if (f instanceof TextFile){
                ((TextFile)f).clear();
            } else if (f instanceof BinaryFile){
                BinaryFile cp = ((BinaryFile)f).getCopy();
                System.out.println("Copied.");
                cp.onClick();
            }
        }

    }

}