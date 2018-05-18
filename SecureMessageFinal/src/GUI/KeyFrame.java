package GUI;

import java.io.File;
import java.util.Scanner;

import Main.Empfaenger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Klasse zum Anzeigen des Klar-Keys
 * 
 * @author AllSafe
 *
 */

public class KeyFrame extends Empfaenger{
	/**
	 * Oberflaechenelemente der Benutzeroberflaeche
	 */
	Label lab = new Label("Your PublicKey ... -> "+getClearKey(getEmpfaenger()));
	Button ok = new Button("OK");
	
	/**
	 * Layout der Benutzeroberflaeche
	 */
	GridPane frame = new GridPane();
	Scene scene = new Scene(frame,600,100);
	Stage newWindow = new Stage();
	
	/**
	 * Erstellt das Fenster zum Eingeben des Keys um den Text zu entschluesseln
	 * 
	 * @param primaryStage Ein Stage-Objekt welches das Hauptprogrammfenster darstellt
	 */
	
	public void createWindow(Stage primaryStage) {
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
	
	/**
	 * Zeigt den Key an, den der Nutzer fuer das entschluesseln bzw. das verschluesseln benutzen muss
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
	
	public KeyFrame(Stage primaryStage,String name) throws Exception {
		createWindow(primaryStage);
	}
}
