package GUI;

import java.security.NoSuchAlgorithmException;

import javax.crypto.spec.SecretKeySpec;

import Verschlüsselung.Key;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MainFrame {
	
	public MainFrame(Stage primaryStage) {
//		Key k = new Key();
//		k.keyGen();
		
		//Titel des Fensters
		primaryStage.setTitle("Encrypt your Message");
		
		//Elemente des Hauptfensters initialisieren
		TextArea encryptField = new TextArea();
		TextArea decryptField = new TextArea();
		
		Button encrypt = new Button("Encrypt");
		encrypt.setMaxWidth(100);
		
		Button decrypt = new Button("Decrypt");
		decrypt.setMaxWidth(100);
		
		Button getKey = new Button("Get Key");
		getKey.setMaxWidth(100);
		
		Button showKey = new Button("Show Key");
		showKey.setMaxWidth(100);
		
		Button help = new Button("?");
		Button about = new Button("About");
		about.setMaxWidth(100);
		
		//Layout des Hauptfensters anlegen
		
		GridPane grid = new GridPane();
		
		//Vertikale Box mit den Buttons
		VBox vBox = new VBox();
		vBox.setSpacing(50);
		
		ObservableList list = vBox.getChildren();
		list.addAll(encrypt,decrypt,getKey,showKey);
		
		
		//Layoutattribute anpassen
		grid.setAlignment(Pos.CENTER_LEFT);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(20,20,20,20));
		
		grid.setMargin(vBox, new Insets(0,50,0,50));
		
		//Fenster bereit machen und in das Hauptfenster einsetzen
		Scene scene = new Scene(grid, 800, 600);
		primaryStage.setScene(scene);
		
		//CSS Datei einbinden
		scene.getStylesheets().addAll(this.getClass().getResource("fenster.css").toExternalForm());
		
		//Elemente in das Layout einsetzen
		grid.add(encryptField, 0, 1);
		grid.add(decryptField, 0, 2);
		grid.add(vBox, 1, 1);
		grid.add(help, 2, 0);
		grid.add(about, 0, 3);
		
		
		//Buttonklick GetKey
		
		getKey.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				new KeyFrame(primaryStage);
			}
		});
		
		//Buttonklick KeyList
		
		showKey.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				new KeyListFrame(primaryStage);
			}
		});
		
		//Buttonklick Help
		
		help.setOnAction(new EventHandler<ActionEvent>() {					
			@Override
			public void handle(ActionEvent e) {
				new HelpFrame(primaryStage);
			}
		});
		
		//Buttonklick Help
		
		about.setOnAction(new EventHandler<ActionEvent>() {					
			@Override
			public void handle(ActionEvent e) {
				new AboutFrame(primaryStage);
			}
		});
		
		//Buttoklick Encrypt
		
		encrypt.setOnAction(new EventHandler<ActionEvent>() {					
			@Override
			public void handle(ActionEvent e) {
//				k.keysEinlesen();
//				
//				System.out.println("PublicKey: ");
//				System.out.println(k.getPublicKey());
//				System.out.println("PrivateKEy: ");
//				System.out.println(k.getPrivateKey());
				
				String msg = encryptField.getText();
				String msgver = null;
	
				String keyst = "Extrem 1Lang dsdddfdfg";
	
				SecretKeySpec key = null;
				try {
					key = Key.keygen(keyst);
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
				Key.saveKey(key);

				new EncryptFrame(primaryStage);
			}
		});
		
		//Buttonklick Decrypt
		
		decrypt.setOnAction(new EventHandler<ActionEvent>() {					
			@Override
			public void handle(ActionEvent e) {
				String msgver = decryptField.getText();
				
				SecretKeySpec keyim = Key.importKey();
				System.out.println(Key.getKey(keyim));
		
				try {
					decryptField.setText(Key.decrypt(msgver, keyim));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				new DecryptFrame(primaryStage);
			}
		});
		
		primaryStage.setX(primaryStage.getX()-150);
		primaryStage.setY(primaryStage.getY()-100);
		
		primaryStage.setResizable(false);
		primaryStage.show();
	}
}
