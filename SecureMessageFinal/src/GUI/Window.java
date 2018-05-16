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

/**
 * Klasse zum Erstellen von Hilfsfenstern, Fehlerfenstern und Infofenstern
 * 
 * @author AllSafe
 *
 */

public class Window {
	
	/**
	 * Konstruktor zum erstellen von Fenstern
	 * 
	 * Der OK-Button dient zum schlieﬂen des Fensters
	 * 
	 * @param primaryStage Stage-Objekt des Hauptprogramms
	 * @param text Inhalt des Fensters
	 * @param title Titel des Fensters
	 */
	public Window(Stage primaryStage,String text,String title) {
		/**
		 * Oberflaechenelemente der Benutzeroberflaeche
		 */
		Label lab = new Label(text);
		Button okButton = new Button("OK");
		
		/**
		 * Layout der Benutzeroberflaeche
		 */
		GridPane frame = new GridPane();
		
		frame.setAlignment(Pos.CENTER);
		frame.setHgap(20);
		frame.setVgap(20);
		frame.add(lab, 0, 0);
		frame.add(okButton,1,1);
		
		Scene scene = new Scene(frame,600,100);
		
		Stage newWindow = new Stage();
		newWindow.setTitle(title);
		newWindow.setScene(scene);
		
		newWindow.setX(primaryStage.getX()+100);
		newWindow.setY(primaryStage.getY()+200);
		
		okButton.setOnAction(new EventHandler<ActionEvent>() {
			
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
