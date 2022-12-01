package file;

public abstract class TextFile extends File{
    private String encoding;
    private long numChars;
    
    public TextFile(String name, long size, String encoding, long numChars) {
        super(name, size);
        this.encoding = encoding;
        this.numChars = numChars;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public long getNumChars() {
        return numChars;
    }

    public void setNumChars(long numChars) {
        this.numChars = numChars;
    }

    public abstract void clear();

    @Override
    public String toString() {
        return "Text" + super.toString() +  "\nEncoding:\t" + getEncoding() + 
        "\nNumber of Characters:\t" + getNumChars();
    }

    

    

}
