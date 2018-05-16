package GUI;

import Main.Empfänger;
import Main.User;
import Verschlüsselung.Key;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class KeyFrame extends Empfänger{
	Label lab = new Label("Your PublicKey ... -> "+Key.getKey(Key.importKey(getEmpfänger())));
	Button ok = new Button("OK");
	GridPane frame = new GridPane();
	Scene scene = new Scene(frame,600,100);
	Stage newWindow = new Stage();
	
	public void Fenster(Stage primaryStage) {
		frame.setAlignment(Pos.CENTER);
		frame.setHgap(20);
		frame.setVgap(20);
		frame.add(lab, 0, 0);
		frame.add(ok,1,1);
		
		newWindow.setTitle("KeyGen");
		newWindow.setScene(scene);
		
		newWindow.setX(primaryStage.getX()+100);
		newWindow.setY(primaryStage.getY()+200);
		
		newWindow.initModality(Modality.APPLICATION_MODAL);
		
		ok.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				newWindow.close();
			}
		});
		
		newWindow.setResizable(false);
		newWindow.show();
	}
	
	public KeyFrame(Stage primaryStage,String name) throws Exception {
		Fenster(primaryStage);
	}
}
