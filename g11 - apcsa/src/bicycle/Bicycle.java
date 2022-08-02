package bicycle;

public class Bicycle {
	private int cadence;
	private int speed;
	private int gear;
	
	public Bicycle (int ca, int sp, int ge) {	//overloaded constructors
		cadence = ca;
		speed = sp;
		gear = ge;
	}
	
	public Bicycle () {		//default constructor
		cadence = 0; 
		speed = 0;
		gear = 1; 
	}
	
	public void setCadence (int updatedCadence) {
		cadence = updatedCadence;
	}
	public void setSpeed (int updatedSpeed) {
		speed = updatedSpeed;
	}
	public void setGear (int updatedGear) {
		gear = updatedGear;
	}
	
	public int getCadence () {return cadence;}
	public int getSpeed () {return speed;}
	public int getGear () {return gear;}
	
	public String toString() {
		return "Cadence = " + cadence + "\nSpeed = " + speed + "\nGear = " + gear;
	}
}
