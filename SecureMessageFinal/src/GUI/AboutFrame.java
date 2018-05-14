package GUI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AboutFrame {
	public AboutFrame(Stage pStage) {
		Label lab = new Label("About Text\n"
				+ "Version 1.0.1\n"
				+ "AllSafe\n"
				+ "BlaBla");
		Button ok = new Button("OK");
		
		GridPane frame = new GridPane();
		
		frame.setAlignment(Pos.CENTER);
		frame.setHgap(20);
		frame.setVgap(20);
		frame.add(lab, 0, 0);
		frame.add(ok,1,1);
		
		Scene scene = new Scene(frame,600,100);
		
		Stage newWindow = new Stage();
		newWindow.setTitle("About");
		newWindow.setScene(scene);
		
		newWindow.setX(pStage.getX()+100);
		newWindow.setY(pStage.getY()+200);
	
		
		ok.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				newWindow.close();
			}
		});
		
		
		newWindow.initModality(Modality.APPLICATION_MODAL);
		
		newWindow.setResizable(false);
		newWindow.show();
	}
}
