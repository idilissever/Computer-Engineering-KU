package file;

public class PlainTextFile extends TextFile {

    private String[] lines;

    public PlainTextFile(String name, long size, String encoding, String[] lines) {
        super(name, size, encoding, getNumChar(lines));
        this.lines = lines;
    }

    public String[] getLines() {
        return lines;
    }

    public void setLines(String[] lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        String lines_String = "";
        for (String line : getLines()) {
            lines_String += "\n" + line;
        }
        return "\nPlain Text " + super.toString() + "\nLines:\t" + lines_String;
    }

    @Override
    public void onClick() {
        for (String line : getLines()) {
            System.out.println(line);
        }
    }

    @Override
    public void clear() {
        String[] empty_lines = new String[10];
        for (int i = 0; i<empty_lines.length; i++) {
            empty_lines[i] = "";
        }
        setLines(empty_lines);
    }

    private static long getNumChar(String[] flines){
        long sum = 0;
        for (String s : flines) {
            sum += s.length();
        }
        return sum;

    }
   
    

}
