package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ViewController {
    
	@FXML
	private TextField txtN1;
	@FXML
	private TextField txtN2;
	@FXML
	private Label labelResult;
	@FXML
	private Button btSoma;
	
	@FXML
	public void onBtSomaAction() {
		try {
		Locale.setDefault(Locale.US);
		double n1 = Double.parseDouble(txtN1.getText());
		double n2 = Double.parseDouble(txtN2.getText());
		
		double soma = n1 + n2;
		
		labelResult.setText(String.format("%.2f", soma));
		} catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse error", e.getMessage(), AlertType.ERROR);
		}
	}
	
}
