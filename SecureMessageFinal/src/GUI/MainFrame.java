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
	private TextArea encryptField = new TextArea();
	private TextArea decryptField = new TextArea();
	private Button encrypt = new Button("Encrypt");
	private Button decrypt = new Button("Decrypt");
	private Button getKey = new Button("Get Key");
	private Button showKey = new Button("Show Key");
	private Button help = new Button("?");
	private Button about = new Button("About");
	private ComboBox<String> user = new ComboBox<String>();
	
	/**
	 * Layout der Benutzeroberflaeche
	 */
	private GridPane grid = new GridPane();
	private VBox vBox = new VBox();
	private Scene scene = new Scene(grid, 800, 600);
	
	/**
	 * Speichern der entschluesselten - und verschluesselten Nachricht
	 */
	private Message msg = new Message("");
	
	/**
	 * Erstellt das Hauptfenster
	 * 
	 * 
	 * 
	 * @param primaryStage Ein Stage-Objekt welches das Hauptprogramm darstellt
	 */
	public void createWindow(Stage primaryStage) {
		primaryStage.setTitle("Encrypt your Message");
		
		encryptField.setMaxHeight(200);
		encryptField.setTranslateY(-40);
		
		decryptField.setMaxHeight(200);
		decryptField.setTranslateY(-100);
		decryptField.setEditable(false);
		
		encrypt.setMaxWidth(100);
		decrypt.setMaxWidth(100);
		getKey.setMaxWidth(100);
		showKey.setMaxWidth(100);
		
		help.setTranslateX(50);
		about.setMaxWidth(100);
		setComboBox(user);
		user.setMaxWidth(100);
		user.setPromptText("User");
		
		vBox.setSpacing(50);
		vBox.setTranslateY(60);
		vBox.setTranslateX(40);
		
		ObservableList<Node> list = vBox.getChildren();
		list.addAll(encrypt,decrypt,getKey,user,about);
		
		grid.setAlignment(Pos.CENTER_LEFT);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(20,20,20,20));
		
		GridPane.setMargin(vBox, new Insets(0,50,0,50));
		
		primaryStage.setScene(scene);
		
		scene.getStylesheets().addAll(this.getClass().getResource("fenster.css").toExternalForm());
		
		grid.add(encryptField, 0, 1);
		grid.add(decryptField, 0, 2);
		grid.add(vBox, 1, 1);
		grid.add(help, 2, 0);		
	
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
				System.out.println(Empfaenger.getEmpfaenger());
			}
		});
				
		help.setOnAction(new EventHandler<ActionEvent>() {					
			@Override
			public void handle(ActionEvent e) {			
				if(Desktop.getDesktop().isSupported(Desktop.Action.OPEN)) {
					try {
						Desktop.getDesktop().open(new File("C:\\Users\\Dominic\\Desktop\\SEII_Project\\SE\\src\\Main\\Readme.txt"));
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			
			}
		});
				
		about.setOnAction(new EventHandler<ActionEvent>() {					
			@Override
			public void handle(ActionEvent e) {
				new Window(primaryStage,"Abouttext","About");
			}
		});
				
		encrypt.setOnAction(new EventHandler<ActionEvent>() {					
			@Override
			public void handle(ActionEvent e) {
				if(Empfaenger.getEmpfaenger() == "") {
					new Window(primaryStage,"Keinen User ausgewaehlt","Fehler");
				}else {
					if(encryptField.getLength() < 10000) {
						msg.setText(encryptField.getText());
						new EncryptFrame(primaryStage,msg.getText(),decryptField,Empfaenger.getEmpfaenger());
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
					if(encryptField.getLength() < 10000) {
						msg.setEncryptedText(encryptField.getText());
						new DecryptFrame(primaryStage,msg.getEncryptedText(),decryptField,Empfaenger.getEmpfaenger());
					}else {
						new Window(primaryStage, "Nicht mehr als 10000 Zeichen einfuegen", "Fehler");
					}
				}
			}
		});
		
		primaryStage.setX(primaryStage.getX()-150);
		primaryStage.setY(primaryStage.getY()-100);
		
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	/**
	 * Fuellt eine ComboBox mit Daten auf
	 * 
	 * Die Methode sucht in der Datei user.txt Zeilenweise nach den Usern und stellt sie in der Combobox da
	 * 
	 * @param cB ComboBox die gefuellt werden soll
	 */
	public void setComboBox(ComboBox<String> cB) {
		File f = new File("C:\\Users\\Dominic\\Desktop\\SEII_Project\\SE\\src\\Main\\user.txt");
		
		
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
