package gui;

import entities.Vehicle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import services.AverageCalculate;

public class ViewController {

	@FXML
	private TextField txtCarModel;

	@FXML
	private TextField txtCarName;

	@FXML
	private TextField txtFuelType;

	@FXML
	private TextField txtInitialKm;

	@FXML
	private TextField txtFinalKm;

	@FXML
	private TextField txtLiters;

	@FXML
	private TextField txtAverage;

	@FXML
	private Label lblModelCar;

	@FXML
	private Label lblCarName;

	@FXML
	private Label lblFuelType;

	@FXML
	private Button btCalculate;

	public void onBtCalculate() {

		try {
			
			String carModel = txtCarModel.getText();
			String carName = txtCarName.getText();
			String fuelType = txtFuelType.getText();
			Vehicle vehicle = new Vehicle(carModel, carName, fuelType);

			lblModelCar.setText(vehicle.getModel());
			lblCarName.setText(vehicle.getCar());
			lblFuelType.setText(vehicle.getFuel());

			double kmInitial = Double.parseDouble(txtInitialKm.getText());
			double kmFinal = Double.parseDouble(txtFinalKm.getText());
			double liters = Double.parseDouble(txtLiters.getText());

			AverageCalculate ac = new AverageCalculate(kmInitial, kmFinal, liters);

			txtAverage.setText(String.format("%.2f", ac.calculate(vehicle)));

		}

		catch (Exception e) {
			e.printStackTrace(); ;
		}
	}

}
