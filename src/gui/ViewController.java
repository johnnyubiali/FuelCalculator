package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

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
			String carModel = txtCarModel.getText();
			String carName = txtCarName.getText();
			String fuelType = txtFuelType.getText();
			lblModelCar.setText(carModel);
			lblCarName.setText(carName);
			lblFuelType.setText(fuelType);
			
			try {
				double kmInitial = Double.parseDouble(txtInitialKm.getText());
				double kmFinal = Double.parseDouble(txtFinalKm.getText());
			}
			catch(NumberFormatException e) {
				Alerts.showAlert("Error", "Parse Error", e.getMessage(), AlertType.ERROR);
			}
			
		
	}
}
