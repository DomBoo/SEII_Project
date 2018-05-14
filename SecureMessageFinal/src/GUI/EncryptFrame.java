package GUI;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class EncryptFrame {
	public EncryptFrame(Stage pStage) {
		Label lab = new Label("Schlüssel eingeben");
		TextField tf = new TextField();
		Button ok = new Button("OK");
		
		GridPane frame = new GridPane();
		
		frame.setHgap(20);
		frame.add(lab, 0, 0);
		frame.add(tf,1,0);
		frame.add(ok,2,0);
		
		Scene scene = new Scene(frame,350,40);
		
		Stage newWindow = new Stage();
		newWindow.setTitle("Encrypt");
		newWindow.setScene(scene);
		
		newWindow.setX(pStage.getX()+225);
		newWindow.setY(pStage.getY()+200);
	
		newWindow.initModality(Modality.APPLICATION_MODAL);
		newWindow.show();
	}
}
