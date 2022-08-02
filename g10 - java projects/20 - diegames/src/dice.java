import java.util.*;

public class dice {
	
	public static void main(String[] args) {
		System.out.println(BoxCars());
	}
	
	public static int BoxCars() {
		Random BoxRAND = new Random();
		Random CarRAND = new Random();
		int boxcar = 0;

		for (int counter = 0; counter < 1000; counter++) {
			int Box = BoxRAND.nextInt(6)+1;
			int Car = CarRAND.nextInt(6)+1;
			
			if (Box == 6 && Car == 6) {
				boxcar++;
			}
		}
		
		return boxcar;
	}
}
