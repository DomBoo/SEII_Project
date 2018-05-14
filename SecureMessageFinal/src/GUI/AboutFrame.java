package GUI;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AboutFrame {
	public AboutFrame(Stage pStage) {
		Label lab = new Label("About Text\n"
				+ "Version 1.0.1\n"
				+ "AllSafe\n"
				+ "BlaBla");
		
		StackPane frame = new StackPane();
		frame.getChildren().add(lab);
		
		Scene scene = new Scene(frame,600,100);
		
		Stage newWindow = new Stage();
		newWindow.setTitle("About");
		newWindow.setScene(scene);
		
		newWindow.setX(pStage.getX()+100);
		newWindow.setY(pStage.getY()+200);
	
		newWindow.initModality(Modality.APPLICATION_MODAL);
		newWindow.show();
	}
}
