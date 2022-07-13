package entities;

public class Vehicle {

	private String model;
	private String car;
	
	private Fuel fuel;

	public Vehicle(String model, String car, Fuel fuel) {
		this.model = model;
		this.car = car;
		this.fuel = fuel;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public Fuel getFuel() {
		return fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}
	
	
	
}
