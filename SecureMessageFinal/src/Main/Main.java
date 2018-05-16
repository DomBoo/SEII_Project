package Main;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Startet das Hauptprogramm
 * 
 * In der main Methode wird die Funktion launch aufgerufen, wodurch die Methode start aufgerufen wird.
 * 
 * @author AllSafe
 *
 */

public class Main extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * Öffnet das Login Fenster, damit der User sich anmelden kann 
	 * 
	 * Die start Methode bekommt ein Stage-Objekt <em>primaryStage</em> übergeben, welches für das als Oberflächenfenster für das Programm dient
	 * 
	 * @see Login
	 */
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		new Login(primaryStage);
	}

}
