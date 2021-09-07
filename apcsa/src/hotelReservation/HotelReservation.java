package hotelReservation;

import java.util.ArrayList;
import java.util.Arrays;

public class HotelReservation {
	private final String[] roomNumbers = {"100A", "101A", "102A", "103A", "104A", "105A"};
	private Reservation [] rooms;
	private ArrayList<String> waitList;
	
	public HotelReservation () {
		Reservation[] rooms = new Reservation[6];
		this.rooms = rooms;
		
		ArrayList<String> waitList = new ArrayList<String>();
		this.waitList = waitList;
	}
	
	public Reservation requestRoom (String name) {
		Reservation resident = null;
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] == null) {
				resident = new Reservation(name, roomNumbers[i]);
				rooms[i] = resident;
				break;
			}
		}
		
		if (resident == null)
			waitList.add(name);
		
		return resident;
	}
	
	public Reservation cancelReassign (String name) {
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i].getRoomNumber().equals(roomNumbers[i]) && name.equals(rooms[i].getName())) {
				if (waitList.size() == 0) {
					Reservation resident = new Reservation("null", "null");
					rooms[i] = resident;
					return resident;
				} if (waitList.size() != 0) {
					String residentName = waitList.get(0);
					Reservation resident = new Reservation(residentName, roomNumbers[i]);
					rooms[i] = resident;
					waitList.remove(0);
					return resident;
				} 
			} 
		}
		
		return null;
	}
	
	public String toString () {
		return "Rooms Numbers: " + Arrays.toString(roomNumbers) + "\nRoom Residents: " + Arrays.toString(rooms) + "\nWaiting List: " + waitList + "\n----";
	}
	
}
