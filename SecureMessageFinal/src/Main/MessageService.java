package Main;

import java.awt.event.KeyAdapter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import GUI.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MessageService {
	public MessageService(Stage primaryStage) {
		//Titel des Fensters
		primaryStage.setTitle("Encrypt your Message");
			
		//Elemente des Hauptfensters initialisieren
		Label name = new Label("User");
		Label password = new Label("Password");
		PasswordField passwordField = new PasswordField();
		TextField nameField = new TextField();
		Button ok = new Button("OK");
		
		//Layout des Hauptfensters anlegen
			
		GridPane grid = new GridPane();
				
		//Layoutattribute anpassen
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(20,20,20,20));
				
		//Fenster bereit machen und in das Hauptfenster einsetzen
		Scene scene = new Scene(grid, 300, 200);
		primaryStage.setScene(scene);
					
		grid.add(name,0,0);
		grid.add(nameField, 1, 0);
		grid.add(password, 0, 1);
		grid.add(passwordField, 1, 1);
		grid.add(ok, 0, 2);
		
		
		ok.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				
				String pass = "";
				
				try {
		            int zeilen = 1;
		            FileReader frUser = new FileReader(new File("C:\\Users\\s75954\\Desktop\\Software Engineering\\SecureMessage\\src\\Main\\user.txt"));
		            FileReader frPassword  = new FileReader(new File("C:\\Users\\s75954\\Desktop\\Software Engineering\\SecureMessage\\src\\Main\\password.txt"));
		            BufferedReader brUser = new BufferedReader(frUser);
		            BufferedReader brPassword = new BufferedReader(frPassword);
		            
		            String z = brUser.readLine();
		            pass = brPassword.readLine();
		            while (!z.isEmpty()) {
		                if (z.equals(nameField.getText())) {
		                   // System.out.println("Ich habe das Wort \"" + nameField.getText() + "\" in Zeile " + zeilen + " gefunden.");
		                    z = null;
		                    brUser = null;
		                    frUser = null;
		                    break;
		                } else {
		                    zeilen++;
		                    z = brUser.readLine();
		                    pass = 	brPassword.readLine();                   
		                }
		            }
		        } catch (Exception e1) {
		           //System.out.println("Suchfunktion beendet.");
		           
		        }
				//System.out.println(pass);
				if(passwordField.getText().equals(pass)) {
					new MainFrame(primaryStage);
				}else {
					grid.add(new Label("Falsche Eingabe"), 1, 2);
					//System.out.println(passwordField.getText());
				}
			}
		});
		
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				if(event.getCode().equals(KeyCode.ENTER)){
					String pass = "";
					
					try {
			            int zeilen = 1;
			            FileReader frUser = new FileReader(new File("C:\\Users\\s75954\\Desktop\\Software Engineering\\SecureMessage\\src\\Main\\user.txt"));
			            FileReader frPassword  = new FileReader(new File("C:\\Users\\s75954\\Desktop\\Software Engineering\\SecureMessage\\src\\Main\\password.txt"));
			            BufferedReader brUser = new BufferedReader(frUser);
			            BufferedReader brPassword = new BufferedReader(frPassword);
			            
			            String z = brUser.readLine();
			            pass = brPassword.readLine();
			            while (!z.isEmpty()) {
			                if (z.equals(nameField.getText())) {
			                   // System.out.println("Ich habe das Wort \"" + nameField.getText() + "\" in Zeile " + zeilen + " gefunden.");
			                    z = null;
			                    brUser = null;
			                    frUser = null;
			                    break;
			                } else {
			                    zeilen++;
			                    z = brUser.readLine();
			                    pass = 	brPassword.readLine();                   
			                }
			            }
			        } catch (Exception e1) {
			           //System.out.println("Suchfunktion beendet.");
			           
			        }
					//System.out.println(pass);
					if(passwordField.getText().equals(pass)) {
						new MainFrame(primaryStage);
					}else {
						grid.add(new Label("Falsche Eingabe"), 1, 2);
						//System.out.println(passwordField.getText());
					}
				}
			}
		});
		
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	public void form() {
		
	}
}