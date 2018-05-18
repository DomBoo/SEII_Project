package GUI;

import java.io.File;
import java.util.Scanner;

import javax.crypto.spec.SecretKeySpec;

import Main.Message;
import Verschluesselung.Key;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Stellt die Benutzeroberflaeche zum Verschluesseln der Nachricht zur Verfuegung
 * 
 * @author AllSafe
 */
public class EncryptFrame extends Message {
	/**
	 * Oberflaechenelemente der Benutzeroberfaeche
	 */
	private Label lab = new Label("Schluessel eingeben");
	private TextField tf = new TextField();
	private Button ok = new Button("OK");
	
	
	/**
	 * Layout der Benutzeroberflaeche
	 */
	private GridPane frame = new GridPane();
	Scene scene = new Scene(frame,350,40);
	Stage newWindow = new Stage();
	
	/**
	 * Erstellt das Fenster zum Eingeben des Keys, der benoetigt wird um die Nachricht zu verschluesseln
	 * 
	 * Der OK-Button ist mit einem Event versehen, welches die Methode encryptMessage aufruft
<<<<<<< HEAD
	 * Wenn der User einen falschen Key eingibt, oeffnet sich ein Fehlerfenster
	 * Das Fenster ist modal und die Groeße ist nicht aenderbar, um eine Usereingabe zu gewaehrleisten.
=======
	 * Das Fenster ist modal und die Groesse ist nicht aenderbar, um eine Usereingabe zu gewaehrleisten.
>>>>>>> 1b602596efd65fa45fa2e9237bf804e25de01307
	 * 
	 * @param primaryStage Ein Stage-Objekt welches das Hauptprogrammfenster darstellt
	 * @param msg Text der verschluesselt werden soll
	 * @param OutputField Textfeld in dem der verschluesselte Text dargestellt werden soll
	 * @param empf Empfaenger an den die Nachricht gesendet werden soll
	 */
	
	public void createWindow(Stage primaryStage,String msg,TextArea OutputField,String empf) {
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
				
				try {
					if(tf.getText().equals(getClearKey(empf))) {
						encryptMessage(primaryStage, msg,OutputField, empf);
					}else {
						new Window(primaryStage, "Falscher Key","Fehler");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				newWindow.close();
			}
		});
	
		newWindow.initModality(Modality.APPLICATION_MODAL);
		
		newWindow.setResizable(false);
		newWindow.show();
	}
	
	/**
	 * Verschluesselt die Nachricht und schreibt die verschluesselte Nachricht in das Outputfeld
	 * 
	 * Es wird der passende Key aus der Datei keys aus dem Ordner keys geladen. Danach kann die Datei verschluesselt werden
	 * 
	 * @param primaryStage Ein Stage-Objekt welches das Hauptprogrammfenster darstellt
	 * @param msg Text der verschluesselt werden soll
	 * @param OutputField Textfeld in dem der verschluesselte Text dargestellt werden soll
	 * @param empf Empfaenger an den die Nachricht gesendet werden soll
	 * @throws Exception 
	 */
	
	public void encryptMessage(Stage primaryStage,String msg,TextArea OutputField,String empf) throws Exception {

		//String msg = encryptField.getText();
		String msgver = null;

		SecretKeySpec key = null;
		try {
			key = Key.keygen(tf.getText());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		try {
			msgver = Key.encrypt(msg, key);
			OutputField.setText(msgver);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		Key.saveKey(empf,key);
	}
	
	/**
	 * Entschluesselt die Nachricht und schreibt die entschluesselte Nachricht in das Outputfeld
	 * 
	 * Es wird der passende Key aus der Datei keys aus dem Ordner keys geladen. Danach kann die Datei entschluesselt werden
	 * 
	 * @param name Name des Empfaengers
	 */
	
	public String getClearKey(String name) throws Exception {
		File f = new File("keys/clearKeys.txt");
		Scanner scan = new Scanner(f);
		String key = null;

		try{
          while(scan.hasNext()){
              String line = scan.nextLine().toString();
              if(line.contains(name)){
            	  key = line;
              }
         }
        key = key.substring(key.indexOf("#")+1, key.length());
        scan.close();
        }
        catch(Exception fra){
          System.out.println(fra);
        }
        return key;
	}
	
	/**
	 * Konstruktor der die createWindow Methode aufruft
	 * 
	 * @param primaryStage Ein Stage-Objekt welches das Hauptprogrammfenster darstellt
	 * @param msg Text der verschluesselt werden soll
	 * @param OutputField Textfeld in dem der verschluesselte Text erscheinen soll
	 * @param empf Empfaenger an den die Nachricht gesendet werden soll
	 */
	
	public EncryptFrame(Stage primaryStage,String msg,TextArea OutputField,String empf) {
		createWindow(primaryStage,msg,OutputField,empf);	
	}
	
	
}
