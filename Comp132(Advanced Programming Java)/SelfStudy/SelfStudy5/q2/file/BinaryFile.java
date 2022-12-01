package file;
public abstract class BinaryFile extends File {

    private boolean canCopy;

    public BinaryFile(String name, long size , boolean canCopy) {
        super(name, size);
        this.canCopy = canCopy;
    }

    public boolean isCanCopy() {
        return canCopy;
    }

    public void setCanCopy(boolean canCopy) {
        this.canCopy = canCopy;
    }

    @Override
    public String toString() {
        return "Binary " + super.toString() + "\nCan Copy:\t" + isCanCopy();
    }

    public abstract BinaryFile getCopy();

    

}
