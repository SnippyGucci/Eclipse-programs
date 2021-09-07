package seatingChart;

import java.util.*;

public class SeatingChart {
	
	private Student[][] seats;
	
	public SeatingChart (ArrayList <Student> studentList, int rows, int cols) {
		int count = 0;
		
		seats = new Student[rows][cols];
		
		//System.out.println(seats.length + seats[0].length);
		for (cols = 0; cols < seats[0].length; cols++) {
			for (rows = 0; rows < seats.length; rows++) {
				if (count < studentList.size()) {
					seats[rows][cols] = studentList.get(count);
					count++;
					
				}
			}
		}
		
	}
	
	public int removeAbsentStudents (int allowedAbs) {
		int count = 0;
		
		for (int rows = 0; rows < seats.length; rows++) {
			for (int cols = 0; cols < seats[0].length; cols++) {
				if (seats[rows][cols] != null && seats[rows][cols].getAbsenceCount() > allowedAbs) {
					seats[rows][cols] = null;
					count++;
					
				}					
			}
		}
		
		return count;
	}
	
	public boolean switchSeats (int RowA, int ColA, int RowZ, int ColZ) {
		if (isValidRow(RowA) && isValidCol(ColA) && isValidRow(RowZ) && isValidCol(ColZ)) {		
			Student hold = seats[RowA][ColA]; 
			
			if (seats[RowA][ColA] != null && seats[RowZ][ColZ] != null) {
				seats[RowA][ColA] = seats[RowZ][ColZ];
				seats[RowZ][ColZ] = hold;
				
				return true;
				
			} else if (seats[RowA][ColA] == null && seats[RowZ][ColZ] == null) {
				return false;
				
			} else {
				
				if (seats[RowA][ColA] == null) {
					seats[RowA][ColA] = seats[RowZ][ColZ];
					seats[RowZ][ColZ] = null;
				}
				else if (seats[RowZ][ColZ] == null) {
					seats[RowZ][ColZ] = seats[RowA][ColA];
					seats[RowA][ColA] = null;
				}
				
				return true;
			}
		} else 
			return false;
		
	}
	
	public boolean isValidRow (int r) {		
		if (r > seats.length)
			return false;
		else
			return true;
	}
	
	public boolean isValidCol (int c) {		
		if (c > seats[0].length)
			return false;
		else
			return true;
	}
	
	public String toString() {
		String dataList = "";
		
		for (int rows = 0; rows < seats.length ; rows++) {
			for (int cols = 0; cols < seats[0].length ; cols++) {
				if (seats[rows][cols] == null)
					dataList += "null" + ", " + rows + ", " + cols + "\n";
				else 
					dataList += seats[rows][cols].getName() + ", " + seats[rows][cols].getAbsenceCount() + ", " + rows + ", " + cols + "\n";
				
			}
		}
		
		return dataList;
	}
}
