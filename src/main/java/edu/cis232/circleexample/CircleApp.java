package edu.cis232.circleexample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleApp extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) {

		Circle circle = new Circle(50);
		circle.setCenterX(75);
		circle.setCenterY(100);
		//circle.setFill(Color.MINTCREAM);
		circle.setFill(null);
		circle.setStroke(Color.CYAN);

		Pane canvas = new Pane(circle);

		Scene scene = new Scene(canvas, 320, 240, Color.RED);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Circle");
		primaryStage.show();
	}
}
