package M2_Activity6;

public abstract class Vehicle {
	private String brand ;
	private int numberOfWheels;
	
	abstract void startEngine();
	abstract void refuel();
	
	public Vehicle() {
		this.brand = "Honda";
		this.numberOfWheels = 4;
	}
	
	public Vehicle(String brand, int numberOfWheels) {
		this.brand = brand;
		this.numberOfWheels = numberOfWheels;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setnumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public int getnumberOfWheels() {
		return numberOfWheels;
	}
	
    public void destroy() {
        System.out.println("The " + this.getBrand() + " is destroyed");
    }
}
