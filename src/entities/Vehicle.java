package entities;

import java.io.Serializable;

public class Vehicle implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String model;
	private String car;
	private String fuel;

	public Vehicle(String model, String car, String fuel) {
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

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	
	
}
