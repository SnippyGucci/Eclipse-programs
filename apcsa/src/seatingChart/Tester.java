package seatingChart;

import java.util.*;

public class Tester {

	public static void main(String[] args) {		
		Student Anna = new Student("Anna", 3);
		Student Ben = new Student("Ben", 1);
		Student Caren = new Student("Caren", 4);
		Student David = new Student("David", 1);
		Student Evan = new Student("Evan", 5);
		Student Fran = new Student("Fran", 9);
		Student Gina = new Student("Gina", 2);
		Student Holly = new Student("Holly", 6);
		Student Irene = new Student("Irene", 1);
		Student Justin = new Student("Justin", 3);
		
		ArrayList<Student> rosterList = new ArrayList<Student> (Arrays.asList(Anna, Ben, Caren, David, Evan, Fran, Gina, Holly, Irene, Justin));	
		
		
		System.out.println("ArrayList form: " + rosterList);
				
		SeatingChart rosterChart = new SeatingChart(rosterList, 3, 4);
		
				
		System.out.println("Removed Students: " + rosterChart.removeAbsentStudents(4));
		
		System.out.println("Switch Seats Run 1: " + rosterChart.switchSeats(2, 0, 0, 3));		
		System.out.println("Switch Seats Run 2: " + rosterChart.switchSeats(1, 3, 2, 2));		
		System.out.println("Switch Seats Run 3: " + rosterChart.switchSeats(1, 1, 2, 2));
		System.out.println("Switch Seats Run invalid: " + rosterChart.switchSeats(2, 1, 2, 12));
		
		
		System.out.println("\nYour Completed Roster: \n" + rosterChart);
		

	}

}
