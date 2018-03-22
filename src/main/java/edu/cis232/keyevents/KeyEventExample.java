package edu.cis232.keyevents;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class KeyEventExample extends Application {
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {

		Label lblKey = new Label("Press a key");

		HBox hbox = new HBox(lblKey);
		hbox.setAlignment(Pos.CENTER);
		Scene scene = new Scene(hbox, 640, 480);


		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {

				lblKey.setText(event.getCode() + " Pressed");
				if(event.getCode() == KeyCode.BACK_SLASH){
					lblKey.setText("BACK_SLASH, that's a secret.");
				}
			}
		});

		scene.setOnKeyReleased(x -> lblKey.setText(x.getCode() + " Released"));


		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
