package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {
     
	@FXML
	private Button bTeste;
	
	@FXML
	public void onbTesteAction() {
		System.out.println("Click");
	}
	
}
