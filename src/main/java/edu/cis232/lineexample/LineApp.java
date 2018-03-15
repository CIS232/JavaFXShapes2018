package edu.cis232.lineexample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class LineApp extends Application {

	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Line line = new Line(80, 120, 400, 520);

		Pane canvas = new Pane(line);

		Scene scene = new Scene(canvas);

		primaryStage.setScene(scene);

		primaryStage.setTitle("Line");
		primaryStage.show();

	}
}
