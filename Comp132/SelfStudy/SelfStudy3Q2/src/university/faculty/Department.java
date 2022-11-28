package university.faculty;

import java.util.ArrayList;

import university.Student;

public class Department {
	private String deptName;
	private String facultyName;
	private ArrayList<Student> students = new ArrayList<Student>();
	
	
	public Department(String deptName, String facultyName) {
		this.deptName = deptName;
		this.facultyName = facultyName;
		
	}
	
	public void appendStudent(Student st) {
		students.add(st);
	}


	
	public String getDeptName() {
		return deptName;
	}



	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}



	public String getFacultyName() {
		return facultyName;
	}



	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}



	public ArrayList<Student> getStudents() {
		return students;
	}



	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}



	public String toString() {
		String tempString = "Department name: " + getDeptName();
		tempString += "\nFaculty name: " + getFacultyName();
		
		for (Student student : students) {
			tempString += student.toString();
		}
		
		
		return tempString;
	}
	
	

}
