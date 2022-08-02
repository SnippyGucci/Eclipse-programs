package hotelReservation;

public class HotelReserationTester {

	public static void main(String[] args) {
		/*TASK 1*/
		System.out.println("Task 1\n*Instantiating Hotel Reservation*");
		HotelReservation HotelReservation = new HotelReservation();
		
		/*TASK 2*/
		System.out.println("\nTask 2");
		String[] res = {"Allen", "Brown", "Carlson", "Davis", "Edwards", "Frost", "Grant", "Harris"};
		for (int i = 0; i < 8; i++)
			HotelReservation.requestRoom(res[i]);
		System.out.println(HotelReservation.toString());
		
		/*TASK 3*/
		System.out.println("\nTask 3");
		HotelReservation.cancelReassign("Carlson");	
		System.out.println(HotelReservation.toString());
		
		/*TASK 4*/
		System.out.println("\nTask 4");
		HotelReservation.cancelReassign("Davis");
		System.out.println(HotelReservation.toString());
		
		/*TASK 5*/
		System.out.println("\nTask 5");
		HotelReservation.cancelReassign("Brown");
		System.out.println(HotelReservation.toString());
		
		/*TASK 6*/
		System.out.println("\nTask 6");
		HotelReservation.cancelReassign("Allen");
		System.out.println(HotelReservation.toString());
		HotelReservation.cancelReassign("Grant");
		System.out.println(HotelReservation.toString());
		HotelReservation.cancelReassign("Harris");
		System.out.println(HotelReservation.toString());
		HotelReservation.cancelReassign("Edwards");
		System.out.println(HotelReservation.toString());
		HotelReservation.cancelReassign("Frost");
		System.out.println(HotelReservation.toString());
		
	}

}
