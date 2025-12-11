package M2_Activity3;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Toyota", "SUV", "Red");	
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.displayinfo();
		car3.displayinfo();

		car2.setBrand("Mitsubishi");
		car2.setType("Pickup");
		car2.setColor("White");
		
		car2.displayinfo();
		
	}

}
