package application;

import java.util.Scanner;

import entities.Vehicle;
import services.AverageCalculate;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the vehicle model: ");
		String model = scan.nextLine();
		System.out.print("Enter the vehicle name: ");
		String car = scan.nextLine();
		System.out.print("Enter de Fuel type: ");
		String fuel = scan.nextLine();
		
		Vehicle vehicle = new Vehicle(model, car, fuel);
		
		System.out.print("Enter a Initial Km: ");
		double kmInitial = scan.nextDouble();
		System.out.print("Enter a Final Km: ");
		double kmFinal = scan.nextDouble();
		System.out.print("Enter a stocked fuel quantity: ");
		double liters = scan.nextDouble();
		
		AverageCalculate ac = new AverageCalculate(kmInitial, kmFinal, liters);
		
		System.out.println("The average consumption of your " + vehicle.getCar() + " is " + ac.calculate(vehicle) + " L/Km");
		
		scan.close();
	}

}
