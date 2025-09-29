package main.java.cls;

public class CarDTO {
	private String make;  //제조사 (예: Hyundai)
	private String model;  //모델 (예: Sonata)
	private String fuelType;  //GAS/DIESEL/ELECTRIC/HYBRID 등
	private String transmission; //AUTO/MANUAL 등
	private String color; //색상
	private int modelYear;  //연식(모델 연도)
	private int mileage; //주행거리(단위: km)
	private int engineCapacity; //배기량(cc) 또는 전기 차량이면 null
	private int horsepower; //출력(hp)
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public int getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	
	@Override
	public String toString() {
		return "CarDTO [make=" + make + ", model=" + model + ", fuelType=" + fuelType + ", transmission=" + transmission
				+ ", color=" + color + ", modelYear=" + modelYear + ", mileage=" + mileage + ", engineCapacity="
				+ engineCapacity + ", horsepower=" + horsepower + "]";
	}
	
}
