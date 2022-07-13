package services;

import entities.Vehicle;

public class AverageCalculate {

	private Double kmInitial;
	private Double kmFinal;
	private Double liters;

	

	public AverageCalculate(Double kmInitial, Double kmFinal, Double liters) {
		this.kmInitial = kmInitial;
		this.kmFinal = kmFinal;
		this.liters = liters;
	}

	public double calculate(Vehicle vehicle) {
		double kmAverage = kmFinal - kmInitial;
		return kmAverage / liters;
		
	}
	
}
