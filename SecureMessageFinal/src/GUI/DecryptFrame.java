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
 * Stellt die Benutzeroberflaeche zum Entschluesseln der Nachricht zur Verfuegung
 * 
 * @author AllSafe
 */

public class DecryptFrame extends Message{
	
	/**
	 * Oberflaechenelemente der Benutzeroberfaeche
	 */
	Label lab = new Label("Schluessel eingeben");
	TextField tf = new TextField();
	Button okButton = new Button("OK");
		
	/**
	 * Layout der Benutzeroberflaeche
	 */
	GridPane frame = new GridPane();
	Scene scene = new Scene(frame,350,40);	
	Stage newWindow = new Stage();
	
	/**
	 * Erstellt das Fenster zum Eingeben des Keys, der benoetigt wird um die Nachricht zu entschluesseln
	 * 
	 * Der OK-Button ist mit einem Event versehen, welches die Methode decryptMessage aufruft
<<<<<<< HEAD
	 * Wenn der User einen falschen Key eingibt, oeffnet sich ein Fehlerfenster
	 * Das Fenster ist modal und die Groeße ist nicht aenderbar, um eine Usereingabe zu gewaehrleisten.
=======
	 * Das Fenster ist modal und die Groesse ist nicht aenderbar, um eine Usereingabe zu gewaehrleisten.
>>>>>>> 1b602596efd65fa45fa2e9237bf804e25de01307
	 * 
	 * @param primaryStage Ein Stage-Objekt welches das Hauptprogrammfenster darstellt
	 * @param msg Text der entschluesselt werden soll
	 * @param OutputField Textfeld in dem der entschluesselte Text dargestellt werden soll
	 * @param empf Empfaenger an den die Nachricht gesendet werden soll
	 */
	
	public void createWindow(Stage primaryStage,String msg,TextArea OutputField,String empf) {
		frame.setHgap(20);
		frame.add(lab, 0, 0);
		frame.add(tf,1,0);
		frame.add(okButton,2,0);
		
		newWindow.setTitle("Decrypt");
		newWindow.setScene(scene);
		
		newWindow.setX(primaryStage.getX()+225);
		newWindow.setY(primaryStage.getY()+200);
		
		okButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				try {
					if(tf.getText().equals(getClearKey(empf))) {
						decryptMessage(primaryStage, msg, OutputField, empf);
					}else {
						new Window(primaryStage, "Falscher Key","Fehler");
					}
				} catch (Exception e) {
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
	 * Entschluesselt die Nachricht und schreibt die entschluesselte Nachricht in das Outputfeld
	 * 
	 * Es wird der passende Key aus der Datei keys aus dem Ordner keys geladen. Danach kann die Datei entschluesselt werden
	 * 
	 * @param primaryStage Ein Stage-Objekt welches das Hauptprogrammfenster darstellt
	 * @param msg Text der entschluesselt werden soll
	 * @param OutputField Textfeld in dem der entschluesselte Text dargestellt werden soll
	 * @param empf Empfaenger an den die Nachricht gesendet werden soll
	 */
	
	public void decryptMessage(Stage primaryStage,String msg,TextArea OutputField,String empf) {		
		try {
			SecretKeySpec keyim = Key.importKey(empf);
			OutputField.setText(Key.decrypt(msg, keyim));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	/**
	 * Dient zum holen des Keys aus der clearKeys.txt Datei
	 * 
	 * Die Methode sucht nach dem uebergegebenen Empfaaenger und gibt dann den Key passenden Key zurueck
	 * 
	 * @param name Name des Empfaengers
	 * @return Key als Klartext zur Keyeingabe
	 * @throws Exception
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
	 * @param msg Text der entschluesselt werden soll
	 * @param OutputField Textfeld in dem der entschluesselte Text erscheinen soll
	 * @param empf Empfaenger an den die Nachricht gesendet werden soll
	 */
	public DecryptFrame(Stage primaryStage,String msg,TextArea OutputField,String empf) {
		createWindow(primaryStage,msg,OutputField,empf);	
	}
}
