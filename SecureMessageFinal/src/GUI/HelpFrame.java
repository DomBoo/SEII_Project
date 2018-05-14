package GUI;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HelpFrame {
	public HelpFrame(Stage pStage) {
		Label lab = new Label("Hilfetext\n"
				+ "Encrypt verschlüsselt deine Nachricht\n"
				+ "Decrypt entschlüsselt deine Nachricht\n"
				+ "GetKey zeigt dir deinen Schlüssel an\n"
				+ "KeyList zeigt die PublicKeys deiner Mitarbeiter an");
		
		StackPane frame = new StackPane();
		frame.getChildren().add(lab);
		
		Scene scene = new Scene(frame,600,100);
		
		Stage newWindow = new Stage();
		newWindow.setTitle("Help");
		newWindow.setScene(scene);
		
		newWindow.setX(pStage.getX()+100);
		newWindow.setY(pStage.getY()+200);
	
		newWindow.initModality(Modality.APPLICATION_MODAL);
		newWindow.show();
	}
}
