package GUI;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainFrame extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception{
		primaryStage.setTitle("Encrypt your Message");
		
		TextArea encryptField = new TextArea();
		TextArea decryptField = new TextArea();
		Button encrypt = new Button("Encrypt");
		encrypt.setMaxWidth(100);
		Button decrypt = new Button("Decrypt");
		decrypt.setMaxWidth(100);
		Button getKey = new Button("Get Key");
		getKey.setMaxWidth(100);
		Button showKey = new Button("Show Key");
		showKey.setMaxWidth(100);
		
		GridPane grid = new GridPane();
		VBox vBox = new VBox();
		vBox.setSpacing(50);
		
		ObservableList list = vBox.getChildren();
		
		list.addAll(encrypt,decrypt,getKey,showKey);
		
		grid.setAlignment(Pos.CENTER_LEFT);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(20,20,20,20));
		
		grid.setMargin(vBox, new Insets(0,0,0,50));
		
		Scene scene = new Scene(grid, 800, 600);
		primaryStage.setScene(scene);
		
		scene.getStylesheets().addAll(this.getClass().getResource("fenster.css").toExternalForm());
		
		grid.add(encryptField, 0, 0);
		grid.add(decryptField, 0, 1);
		grid.add(vBox, 1, 0);
		
		getKey.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				Label lab = new Label("Your PublicKey ... -> 12345");
				
				StackPane warning = new StackPane();
				warning.getChildren().add(lab);
				
				Scene secondScene = new Scene(warning,600,100);
				
				Stage newWindow = new Stage();
				newWindow.setTitle("KeyGen");
				newWindow.setScene(secondScene);
				
				newWindow.setX(primaryStage.getX()+100);
				newWindow.setY(primaryStage.getY()+200);
			
				newWindow.initModality(Modality.APPLICATION_MODAL);
				newWindow.show();
			}
		});
		
		primaryStage.show();
	}
}
