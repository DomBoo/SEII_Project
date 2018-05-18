package GUI;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import Main.Empfaenger;
import Main.Message;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Hauptfensterklasse zum navigieren auf der Benutzeroberflaeche
 * 
 * @author AllSafe
 *
 */

public class MainFrame {
	
	/**
	 * Oberflaechenelemente der Benutzeroberflaeche
	 */
	private TextArea InputField = new TextArea();
	private TextArea OutputField = new TextArea();
	private Button encrypt = new Button("Encrypt");
	private Button decrypt = new Button("Decrypt");
	private Button getKey = new Button("Import Key");
	private Button showKey = new Button("Show Key");
	private Button help = new Button("?");
	private Button about = new Button("About");
	private ComboBox<String> user = new ComboBox<String>();
	private Label copyright = new Label("\u00a9 AllSafe 2018 all rights reserved");
	
	/**
	 * Layout der Benutzeroberflaeche
	 */
	private GridPane grid = new GridPane();
	private VBox buttonBox = new VBox();
	private Scene scene = new Scene(grid, 800, 600);
	
	/**
	 * Speichern der entschluesselten - und verschluesselten Nachricht
	 */
	private Message msg = new Message("");
	
	/**
	 * Erstellt das Hauptfenster
	 * 
	 * Die Buttons verhalten sich bei einem Klick entsprechend ihres Aufgabenbereiches 
	 * Die ComboBox enthaelt alle User die in der Datei user.txt vorhanden sind
	 * 
	 * @param primaryStage Ein Stage-Objekt welches das Hauptprogramm darstellt
	 */
	public void createWindow(Stage primaryStage) {
		primaryStage.setTitle("Encrypt your Message");
		
		InputField.setMaxHeight(200);
		InputField.setTranslateY(-20);
		InputField.setTranslateX(40);
		
		OutputField.setMaxHeight(200);
		OutputField.setTranslateY(-70);
		OutputField.setEditable(false);
		OutputField.setTranslateX(40);
		
		encrypt.setMaxWidth(100);
		decrypt.setMaxWidth(100);
		getKey.setMaxWidth(100);
		showKey.setMaxWidth(100);
		
		help.setTranslateX(50);
		help.setTranslateY(40);
		about.setMaxWidth(100);
		setComboBox(user);
		user.setMaxWidth(100);
		user.setPromptText("User");
		
		buttonBox.setSpacing(50);
		buttonBox.setTranslateY(80);
		buttonBox.setTranslateX(40);
		
		ObservableList<Node> list = buttonBox.getChildren();
		list.addAll(encrypt,decrypt,getKey,user,about);
		
		copyright.setFont(new Font("Arial", 30));
		
		grid.setAlignment(Pos.CENTER_LEFT);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(0,20,5,20));
		
		GridPane.setMargin(buttonBox, new Insets(0,50,0,50));
		
		primaryStage.setScene(scene);
		
		scene.getStylesheets().addAll(this.getClass().getResource("fenster.css").toExternalForm());
		
		grid.add(InputField, 0, 1);
		grid.add(OutputField, 0, 2);
		grid.add(buttonBox, 1, 1);
		grid.add(help, 2, 0);
		grid.add(copyright, 0, 3);
	
		getKey.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				try {
					if(Empfaenger.getEmpfaenger() == "") {
						new Window(primaryStage,"Keinen User ausgewaehlt","Fehler");
					}else {
						new KeyFrame(primaryStage,Empfaenger.getEmpfaenger());
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
				
		user.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				Empfaenger.setEmpfaenger(user.getSelectionModel().getSelectedItem().toString());
			}
		});
				
		help.setOnAction(new EventHandler<ActionEvent>() {					
			@Override
			public void handle(ActionEvent e) {			
				if(Desktop.getDesktop().isSupported(Desktop.Action.OPEN)) {
					try {
						String dir = System.getProperty("user.dir");
						
						Desktop.getDesktop().open(new File(dir+"/Documentation/Anwenderdokumentation.pdf"));
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
				
		about.setOnAction(new EventHandler<ActionEvent>() {					
			@Override
			public void handle(ActionEvent e) {				
				try {
					String dir = System.getProperty("user.dir");

					Desktop.getDesktop().open(new File(dir+"/src/GUI/about.txt"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
				
		encrypt.setOnAction(new EventHandler<ActionEvent>() {					
			@Override
			public void handle(ActionEvent e) {
				if(Empfaenger.getEmpfaenger() == "") {
					new Window(primaryStage,"Keinen User ausgewaehlt","Fehler");
				}else {
					if(InputField.getLength() < 10000) {
						msg.setText(InputField.getText());
						new EncryptFrame(primaryStage,msg.getText(),OutputField,Empfaenger.getEmpfaenger());
					}else {
						new Window(primaryStage, "Nicht mehr als 10000 Zeichen einfuegen", "Fehler");
					}
				}
			}
		});
				
		decrypt.setOnAction(new EventHandler<ActionEvent>() {					
			@Override
			public void handle(ActionEvent e) {
				if(Empfaenger.getEmpfaenger() == "") {
					new Window(primaryStage,"Keinen User ausgewaehlt","Fehler");
				}else {
					if(InputField.getLength() < 10000) {
						msg.setEncryptedText(InputField.getText());
						new DecryptFrame(primaryStage,msg.getEncryptedText(),OutputField,Empfaenger.getEmpfaenger());
					}else {
						new Window(primaryStage, "Nicht mehr als 10000 Zeichen einfuegen", "Fehler");
					}
				}
			}
		});
		
		primaryStage.setX(primaryStage.getX()-200);
		primaryStage.setY(primaryStage.getY()-100);
		
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	/**
	 * Fuellt eine ComboBox mit Daten auf
	 * 
	 * Die Methode sucht in der Datei user.txt Zeilenweise nach den Usern und stellt sie in der Combobox dar
	 * 
	 * @param cB ComboBox die gefuellt werden soll
	 */
	public void setComboBox(ComboBox<String> cB) {
		String dir = System.getProperty("user.dir");
		File f = new File(dir+"/src/Main/user.txt");
		
		try{
			Scanner scan = new Scanner(f);
			while(scan.hasNext()){
				String line = scan.nextLine().toString();
				cB.getItems().add(line);
			}
			scan.close();
        }
        catch(Exception fra){
          System.out.println(fra);
        }
	}
	
	public MainFrame(Stage primaryStage) {				
		createWindow(primaryStage);
	}
	
	
}
