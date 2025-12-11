package M2_Activity6;

public class Car extends Vehicle{
	void startEngine() {
		System.out.println("The driver is starting the " + this.getBrand()  + " " + this.getnumberOfWheels() + " wheeler");	
	}
	
	void refuel() {
		System.out.println("The driver is refueling the " + this.getBrand()  + " " + this.getnumberOfWheels() + " wheeler");	
	}
}
