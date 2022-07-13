package services;

import entities.Vehicle;

public class AverageCalculate {

	private Double km;
	private Double liters;
	
	private Vehicle vehicle;

	public AverageCalculate(Double km, Double liters, Vehicle vehicle) {
		this.km = km;
		this.liters = liters;
		this.vehicle = vehicle;
	}

	public Double getKm() {
		return km;
	}

	public void setKm(Double km) {
		this.km = km;
	}

	public Double getLiters() {
		return liters;
	}

	public void setLiters(Double liters) {
		this.liters = liters;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	@Override
	public String toString() {
		return "AverageCalculate [km=" + km + ", liters=" + liters + ", vehicle=" + vehicle + "]";
	}
	
	
	
}
