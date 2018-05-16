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

public class EncryptFrame extends Message {
	
	private Label lab = new Label("Schlüssel eingeben");
	private TextField tf = new TextField();
	private Button ok = new Button("OK");
	
	private GridPane frame = new GridPane();
	
	Scene scene = new Scene(frame,350,40);
	Stage newWindow = new Stage();
	
	public void Fenster(Stage primaryStage,String msg,TextArea decryptField,String empf) {
		frame.setHgap(20);
		frame.add(lab, 0, 0);
		frame.add(tf,1,0);
		frame.add(ok,2,0);
		
		newWindow.setTitle("Encrypt");
		newWindow.setScene(scene);
		
		newWindow.setX(primaryStage.getX()+225);
		newWindow.setY(primaryStage.getY()+200);
		
		ok.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				Nachrichtverschlüsseln(primaryStage, msg,decryptField, empf);
				
				newWindow.close();
			}
		});
	
		newWindow.initModality(Modality.APPLICATION_MODAL);
		
		newWindow.setResizable(false);
		newWindow.show();
	}
	
	public void Nachrichtverschlüsseln(Stage primaryStage,String msg,TextArea decryptField,String empf) {

		//String msg = encryptField.getText();
		String msgver = null;

		SecretKeySpec key = null;
		try {
			key = Key.keygen(tf.getText());
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		System.out.println(msg);
		System.out.println(Key.getKey(key));
		
		try {
			msgver = Key.encrypt(msg, key);
			decryptField.setText(msgver);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		System.out.println(msgver);
		Key.saveKey(empf,key);
	}
	
	public EncryptFrame(Stage primaryStage,String msg,TextArea decryptField,String empf) {
		Fenster(primaryStage,msg,decryptField,empf);	
	}
	
	
}
