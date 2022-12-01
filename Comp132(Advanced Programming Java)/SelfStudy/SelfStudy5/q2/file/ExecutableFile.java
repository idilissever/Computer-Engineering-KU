package file;

public class ExecutableFile extends BinaryFile {
    private String platform;
    private byte[] contents;

    public ExecutableFile(String name, long size,  boolean canCopy, String platform, byte[] contents) {
        super(name, size, canCopy);
        this.platform = platform;
        this.contents = contents;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public byte[] getContents() {
        return contents;
    }

    public void setContents(byte[] contents) {
        this.contents = contents;
    }

    @Override
    public void onClick() {
        System.out.println(getName());
    }

    @Override
    public String toString() {
        return "\nExecutable " + super.toString() + "\nPlatform:\t" + getPlatform();
    }

    @Override
    public ExecutableFile getCopy() {
        if (!isCanCopy()){
            System.out.println("Copying is not allowed");
            return null;
        }

        int len = getContents().length;
        byte[] content_copy = new byte[len];

        System.arraycopy(getContents(), 0, content_copy, 0, len);

        var copy = new ExecutableFile(getName(), getSize(), 
        isCanCopy(), getPlatform(), content_copy);
        return copy;
    }

    
}
