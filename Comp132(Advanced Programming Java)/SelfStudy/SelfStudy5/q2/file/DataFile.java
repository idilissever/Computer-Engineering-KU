package file;


public class DataFile extends BinaryFile implements IOpenable {

    private String compressionFormat;
    private ExecutableFile opensWith;
    private boolean[] bits;

    
    public DataFile(String name, long size, boolean canCopy, String compressionFormat,
            ExecutableFile opensWith, boolean[] bits) {
        super(name, size, canCopy);
        this.compressionFormat = compressionFormat;
        this.opensWith = opensWith;
        this.bits = bits;
    }

    public String getCompressionFormat() {
        return compressionFormat;
    }

    public void setCompressionFormat(String compressionFormat) {
        this.compressionFormat = compressionFormat;
    }

    public ExecutableFile getOpensWith() {
        return opensWith;
    }

    public void setOpensWith(ExecutableFile opensWith) {
        this.opensWith = opensWith;
    }

    public boolean[] getBits() {
        return bits;
    }

    public void setBits(boolean[] bits) {
        this.bits = bits;
    }

    @Override
    public void onClick() {
        System.out.printf("%s %s", opensWith.getName(), getName());
    }

    @Override
    public DataFile getCopy() {

        //the openswith object should also be copyable since we would also copy it while copying the datafile
        if (!isCanCopy() || !getOpensWith().isCanCopy()){
            System.out.println("Copying is not allowed");
            return null;
        }

        //copying the bits array
        int len = getBits().length;
        boolean[] bits_copy = new boolean[len];
        System.arraycopy(getBits(), 0, bits_copy, 0, len);

        //copying the openswith object
        ExecutableFile opensWith_copy = opensWith.getCopy();

        var copy = new DataFile(getName(), getSize(), 
        isCanCopy(), getCompressionFormat(), opensWith_copy, bits_copy);

        return copy;
    }

    @Override
    public String opensWith() {  
        return getName();
    }

    @Override
    public String toString() {
        return "\nData File:\t" + super.toString() +"\nCompression Format:\t" + compressionFormat + 
        "\nOpens With:\t" + getOpensWith().getName();
    }


 
}
