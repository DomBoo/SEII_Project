package GUI;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AboutFrame{
	
	/**
	 * Konstruktor zum Erstellen vom AboutFenster
	 * 
	 * @param primaryStage Stage-Objekt des Hauptprogramms
	 */
	public AboutFrame(Stage primaryStage) {		
		/**
		 * Layout der Benutzeroberflaeche
		 */
		GridPane frame = new GridPane();
		
		frame.setAlignment(Pos.CENTER);
		frame.setHgap(20);
		frame.setVgap(20);
		
		Scene scene = new Scene(frame,600,400);
		
		Stage newWindow = new Stage();
		newWindow.setTitle("About Allsafe");
		newWindow.setScene(scene);
		
		scene.getStylesheets().addAll(this.getClass().getResource("about.css").toExternalForm());
		
		newWindow.setX(primaryStage.getX()+100);
		newWindow.setY(primaryStage.getY()+100);
		
		newWindow.initModality(Modality.APPLICATION_MODAL);
		
		newWindow.setResizable(false);
		newWindow.show();
	}
}
