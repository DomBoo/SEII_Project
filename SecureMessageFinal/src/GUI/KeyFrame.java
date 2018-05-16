package GUI;

import Main.Empfaenger;
import Verschluesselung.Key;
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
 * Klasse zum Anzeigen des Keys
 * 
 * @author AllSafe
 *
 */

public class KeyFrame extends Empfaenger{
	/**
	 * Oberflaechenelemente der Benutzeroberflaeche
	 */
	Label lab = new Label("Your PublicKey ... -> "+Key.getKey(Key.importKey(getEmpfaenger())));
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
	
	public KeyFrame(Stage primaryStage,String name) throws Exception {
		createWindow(primaryStage);
	}
}
