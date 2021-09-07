package inheritance;

public class Student extends Person {
	private String StuID;
	private double StuGPA;
	
	public Student (String n, int a, char gender, String ID, double gpa) {
		super (n, a, gender); //use parent class’s constructor
		StuID = ID;
		StuGPA = gpa;
	}
	
	public String getIDNum() { 
		return StuID;
	}
	
	public double getGPA() { 
		return StuGPA;		
	}
	
	public void setIDNum(String ID) {
		StuID = ID;
	}
	
	public void setGPA(double gpa) { 
		StuGPA = gpa;
	}
	
	public String toString() {
		return super.toString() + ", StudentID: " + StuID + ", GPA: " + StuGPA; 
	}
	  
}
