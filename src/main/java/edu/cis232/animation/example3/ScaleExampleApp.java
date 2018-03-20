package edu.cis232.animation.example3;

import javafx.animation.Interpolator;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ScaleExampleApp extends Application{
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		final int SCREEN_WIDTH_X = 640;
		final int SCREEN_WIDTH_Y = 480;

		final int MID_X = SCREEN_WIDTH_X / 2 - 1;
		final int MID_Y = SCREEN_WIDTH_Y / 2 - 1;
		Text hello = new Text(MID_X, MID_Y, "Hello World!");

		Pane pane = new Pane(hello);

		Scene scene = new Scene(pane, SCREEN_WIDTH_X, SCREEN_WIDTH_Y);
		primaryStage.setScene(scene);
		primaryStage.show();

		ScaleTransition scaleTransition = new ScaleTransition();
		scaleTransition.setDuration(Duration.seconds(10));
		scaleTransition.setNode(hello);
		scaleTransition.setInterpolator(Interpolator.EASE_OUT);
		scaleTransition.setByX(2.0);
		scaleTransition.setByY(2.0);
		scaleTransition.setCycleCount(5);
		scaleTransition.setAutoReverse(true);

		scaleTransition.play();
	}
}
