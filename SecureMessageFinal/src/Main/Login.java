package Main;

import GUI.*;

import java.io.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Login extends User{
	
	/**
	 * Oberflaechenelemente der Benutzeroberflaeche
	 */
	private Label nameLab = new Label("User");
	private Label passwordLab = new Label("Password");
	private PasswordField passwordField = new PasswordField();
	private TextField nameField = new TextField();
	private Button okButton = new Button("OK");	
	
	/**
	 * Layout der Benutzeroberflaeche
	 */
	private GridPane grid = new GridPane();
	private Scene scene = new Scene(grid, 300, 200);

	/**
	 * Erstellt das Fenster zum Login des Benutzers, um den User nach Benutzername und Passwort zu fragen
	 * 
	 * Wenn der User auf den OK Button klickt oder Enter drueckt, springt das Programm zur Log Methode, in welcher die Login Daten des Users ueberprueft werden.
	 * 
	 * @param primaryStage Umgebung des Hauptprogramms
	 */
	public void createWindow(Stage primaryStage) {
				
		String dir = System.getProperty("user.dir");
		
		primaryStage.setTitle(dir);
		
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(20,20,20,20));
		
		primaryStage.setScene(scene);
					
		grid.add(nameLab,0,0);
		grid.add(nameField, 1, 0);
		grid.add(passwordLab, 0, 1);
		grid.add(passwordField, 1, 1);
		grid.add(okButton, 0, 2);
		
		okButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				Log(primaryStage);
			}
		});
		
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				if(event.getCode().equals(KeyCode.ENTER)){
					Log(primaryStage);
				}
			}
		});
		
		//primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	/**
	 * Ueberprueft ob der User valide Daten eingegeben hat
	 * 
	 * Es wird zuerst in der Datei user.txt nach einem User gesucht, um dann in der password.txt das passende Passwort zum User zu finden und mit der Eingabe zu vergleichen.
	 * 
	 * @param primaryStage Umgebung des Hauptprogramms
	 */
	public void Log(Stage primaryStage) {
		String dir = System.getProperty("user.dir");
		try {
            FileReader UserReader = new FileReader(new File(dir+"\\user.txt"));
            FileReader PasswordReader  = new FileReader(new File(dir+"\\password.txt"));
            
            @SuppressWarnings("resource")
			BufferedReader UserBuffer = new BufferedReader(UserReader);
            @SuppressWarnings("resource")
			BufferedReader PasswordBuffer = new BufferedReader(PasswordReader);
            
            name = UserBuffer.readLine();
            password = PasswordBuffer.readLine();
            
            nameLab.setText(name);
            passwordLab.setText(password);
            
            while (!name.isEmpty()) {
                if (name.equals(nameField.getText())) {
                	name = null;
                    UserBuffer = null;
                    UserReader = null;
                    break;
                } else {
                	User.name = UserBuffer.readLine();
                    password = 	PasswordBuffer.readLine();                   
                }
            }
            
            UserBuffer.close();
            PasswordBuffer.close();
            
        } catch (Exception e1) {
           e1.printStackTrace();
        }

		if(passwordField.getText().equals(password)) {
			new MainFrame(primaryStage);
		}else {
			grid.add(new Label("Falsche Eingabe"), 1, 2);
		}
	}
	
	/**
	 * Konstruktor der createWindow aufruft
	 * @param primaryStage Umgebung des Hauptprogramms
	 */
	public Login(Stage primaryStage) {
		createWindow(primaryStage);
	}
}