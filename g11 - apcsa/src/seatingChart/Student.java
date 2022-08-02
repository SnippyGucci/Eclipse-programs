package seatingChart;

import java.util.*;

public class Student {

	private String StudentName;
	private int numOfAbsences;
	
	public Student (String n, int abs) {
		StudentName = n;
		numOfAbsences = abs;
	}
	
	public String getName() {
		return StudentName;
	}
	
	public int getAbsenceCount() {
		return numOfAbsences;
	}
	
	public String toString() {
		return StudentName + ": " + numOfAbsences + " absences";
	}
}
