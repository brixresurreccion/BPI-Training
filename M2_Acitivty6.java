package M2_Activity6;

public class M2_Acitivty6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck = new Truck();
	    Car car = new Car();
		
		truck.setBrand("Toyota");
		truck.setnumberOfWheels(16);
		
		car.startEngine();
		car.refuel();
		truck.startEngine();
		destroyVehicle(truck);
	}
	public static void destroyVehicle(Vehicle vehicle) {
		vehicle.destroy();
	}

}
