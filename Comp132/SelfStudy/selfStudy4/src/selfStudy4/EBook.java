package selfStudy4;

public class EBook extends Book {
	
	private double fileSize;
	private String encodingFormat;
	private int numDevicesAllowed;
	private int numDevicesBeingUsed = 0;
	
	


	public EBook(String name, double price, String bookId, double fileSize, String encodingFormat, int numDevicesAllowed) {
		super(name, price, bookId);
		this.fileSize = fileSize;
		this.encodingFormat = encodingFormat;
		this.numDevicesAllowed = numDevicesAllowed;
	}


	public double getFileSize() {
		return fileSize;
	}


	public void setFileSize(double fileSize) {
		this.fileSize = (fileSize > 0) ? fileSize : 1.0;
	}


	public String getEncodingFormat() {
		return encodingFormat;
	}


	public void setEncodingFormat(String encodingFormat) {
		this.encodingFormat = encodingFormat;
	}


	public int getNumDevicesAllowed() {
		return numDevicesAllowed;
	}


	public void setNumDevicesAllowed(int numDevicesAllowed) {
		this.numDevicesAllowed = (numDevicesAllowed > 0) ? numDevicesAllowed : 1;
	}


	public int getNumDevicesBeingUsed() {
		return numDevicesBeingUsed;
	}
	
	public boolean addDevice() {
		this.numDevicesBeingUsed++;
		return true;
		
	}
	
	public boolean removeDevice() {
		this.numDevicesBeingUsed--;
		return true;
		
	}
	
	@Override
	public String toString() {
		return "EBook " + super.toString() + "File Size = " + fileSize + ", Encoding Format = " + encodingFormat + ", Number of Devices Allowed = "
				+ numDevicesAllowed + ", Number of Devices Being Used = " + numDevicesBeingUsed;
	}
	
	


	
	
	
	
	
	
	

}
