package M2_Activity3;

public class Car {
	private String brand;
	private String type;
	private String color;
	public Car() {
		this.brand = "Honda";
		this.type = "Sedan";
		this.color = "Black";
	}
	public Car(String brand, String type, String color) {
		this.brand = brand;
		this.type = type;
		this.color = color;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public String getType() {
		return type;
	}
	public String getColor() {
		return color;
	}
	public void displayinfo() {
		System.out.println("Car Details");
		System.out.println("Brand : " + this.brand);
		System.out.println("Type  : " + this.type);
		System.out.println("Color : " + this.color);
	}
}

