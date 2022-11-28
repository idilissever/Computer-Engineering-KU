package university;

public class TestStudent {
	
	public static void main(String[] args) {
		
		Student idilStudent = new Student("idil", "80447", "fall", 2021);
		
		System.out.println(idilStudent);
		
		idilStudent.setSemester("spring");
		idilStudent.setYear(2022);
		
		

		// create first student using two argument constructor
		Student merve = new Student("MERVE", "04591");

		// print information about merve by implicitly calling "toString"
		// method. This should print:
		//Student name: MERVE, ID: 04591, Semester: Fall, Year: 1900, Current semester: 1, Current year: 2020
		System.out.println(merve);

		merve.setSemester("Summer"); // set semester to Summer
		merve.setYear(2015); // set year to 2015

		// print only student ID, semester and year
		System.out.println(
		    merve.getiD() + ", " +
				merve.getSemester() + ", "
				+ merve.getYear());


		// create a second student with 4 argument constructor
		Student hassan = new Student("HASSAN", "041489", "Fall", 2011);

		// print information about hassan
		// Student name: HASSAN, ID: 04001, Semester: Fall, Year: 2011, Current semester: 1, Current year: 2020
		// noticed? since "041489" is not between "04001" and "04999", ID is set to "04001"
		System.out.println(hassan);

		// set current year to 2014
		hassan.setCurrentYear(2014);

		// print hassan again
		// Student name: HASSAN, ID: 04001, Semester: Fall, Year: 2011, Current semester: 1, Current year: 2014
		System.out.println(hassan);

		// print merve
		// Notice Current year: 2014. Why?? because currentYear is static
		System.out.println(merve);
	}

}
