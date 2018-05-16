package GUI;

import javax.crypto.spec.SecretKeySpec;

import Main.Message;
import Verschlüsselung.Key;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class DecryptFrame extends Message{
	Label lab = new Label("Schlüssel eingeben");
	TextField tf = new TextField();
	Button ok = new Button("OK");
		
	GridPane frame = new GridPane();

	Scene scene = new Scene(frame,350,40);	
	Stage newWindow = new Stage();
	
	public void Fenster(Stage primaryStage,String msg,TextArea encryptField,String empf) {
		frame.setHgap(20);
		frame.add(lab, 0, 0);
		frame.add(tf,1,0);
		frame.add(ok,2,0);
		
		newWindow.setTitle("Decrypt");
		newWindow.setScene(scene);
		
		newWindow.setX(primaryStage.getX()+225);
		newWindow.setY(primaryStage.getY()+200);
		
		ok.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Nachrichtentschlüsseln(primaryStage, msg, encryptField, empf);
				
				newWindow.close();
			}
		});
	
		newWindow.initModality(Modality.APPLICATION_MODAL);
		
		newWindow.setResizable(false);
		newWindow.show();
	}
	
	public void Nachrichtentschlüsseln(Stage primaryStage,String msg,TextArea encryptField,String empf) {		
		try {
			SecretKeySpec keyim = Key.importKey(empf);
			System.out.println(Key.getKey(keyim));
			encryptField.setText(Key.decrypt(msg, keyim));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public DecryptFrame(Stage primaryStage,String msg,TextArea encryptField,String empf) {
		Fenster(primaryStage,msg,encryptField,empf);	
	}
}
