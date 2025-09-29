package main.java.cls;

public class Car {
	private CarDTO carDTO;
	
	public Car(CarDTO carDTO) {
		this.carDTO = carDTO;
	}
	
	public void getCarInfo() {
		System.out.println(carDTO.toString());
	}
}
