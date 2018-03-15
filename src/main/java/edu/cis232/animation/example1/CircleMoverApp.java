package edu.cis232.animation.example1;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class CircleMoverApp extends Application {

	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Circle c = new Circle(50, 100, 30);

		TranslateTransition moveCircle = new TranslateTransition(new Duration(10000), c);
		moveCircle.setByX(400);
		moveCircle.setByY(50);

		Pane pane = new Pane(c);

		Scene scene = new Scene(pane, 640, 480);

		primaryStage.setScene(scene);
		primaryStage.show();
		moveCircle.play();
	}
}
