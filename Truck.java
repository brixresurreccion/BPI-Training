package M2_Activity6;

public class Truck extends Vehicle {
	void startEngine() {
		System.out.println("The driver is starting the " + this.getBrand() + " " + this.getnumberOfWheels() + " wheeler");	
	}
	
	void refuel() {
		System.out.println("The driver is refueling the " + this.getnumberOfWheels() + " " + this.getnumberOfWheels() + " wheeler");	
	}
}
