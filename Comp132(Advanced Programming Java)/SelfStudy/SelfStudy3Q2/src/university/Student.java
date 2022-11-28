package university;

public class Student {
	private String name;
	private String iD;
	private String semester;
	private int year;
	
	static int currentYear;
	static int currentSemester;
	
	public Student(String name, String iD ) {
		this.iD = iD;
		this.name = name;
		
	}
	
	public Student(String name, String iD, String semester, int year) {
		this.name = name;
		this.iD = iD;
		this.semester = semester;
		this.year = year;
		
	}
	
	
	
	
	
	public static void setCurrentYear(int currentYear) {
		Student.currentYear = currentYear;
	}

	public static void setCurrentSemester(int currentSemester) {
		Student.currentSemester = currentSemester;
	}

	public String toString() {
		return "Student [name=" + name + ", iD=" + iD + ", semester=" + semester + ", year=" + year + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getiD() {
		return iD;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public static int getCurrentYear() {
		return currentYear;
	}
	public static int getCurrentSemester() {
		return currentSemester;
	}
	
	
	
	
	
	

}
