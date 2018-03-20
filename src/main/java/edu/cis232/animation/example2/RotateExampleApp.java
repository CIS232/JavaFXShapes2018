package edu.cis232.animation.example2;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RotateExampleApp extends Application{
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		final int RESOLUTION_WIDTH = 480;
		final int RESOLUTION_HEIGHT = 480;
		
		final int CENTER_X = RESOLUTION_WIDTH / 2 - 1;
		final int CENTER_Y = RESOLUTION_HEIGHT / 2 - 1;
		
		Circle c = new Circle(CENTER_X, CENTER_Y, 30);
		Arc a1 = new Arc(CENTER_X, CENTER_Y, 28, 28, 45, 45);
		a1.setFill(Color.SILVER);
		a1.setType(ArcType.ROUND);

		Arc a2 = new Arc(CENTER_X, CENTER_Y, 28, 28, 135, 45);
		a2.setType(ArcType.ROUND);
		a2.setFill(Color.DODGERBLUE);

		Arc a3 = new Arc(CENTER_X, CENTER_Y, 28, 28, 225, 45);
		a3.setType(ArcType.ROUND);
		a3.setFill(Color.SILVER);

		Arc a4 = new Arc(CENTER_X, CENTER_Y, 28, 28, 315, 45);
		a4.setType(ArcType.ROUND);
		a4.setFill(Color.DODGERBLUE);

		Pane pane = new Pane(c, a1, a2, a3, a4);

		Scene scene = new Scene(pane, RESOLUTION_WIDTH, RESOLUTION_HEIGHT);

		primaryStage.setScene(scene);
		primaryStage.show();

		RotateTransition rotateAnim = new RotateTransition(Duration.seconds(0.5), pane);
		rotateAnim.setByAngle(360);
		rotateAnim.setCycleCount(Animation.INDEFINITE);
		rotateAnim.setInterpolator(Interpolator.LINEAR);
		rotateAnim.play();
	}
}
