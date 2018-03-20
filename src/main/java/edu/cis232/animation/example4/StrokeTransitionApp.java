package edu.cis232.animation.example4;

import javafx.animation.Animation;
import javafx.animation.FillTransition;
import javafx.animation.Interpolator;
import javafx.animation.ScaleTransition;
import javafx.animation.StrokeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class StrokeTransitionApp extends Application {
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		final int SCREEN_WIDTH_X = 640;
		final int SCREEN_WIDTH_Y = 480;

		final int MID_X = SCREEN_WIDTH_X / 2 - 1;
		final int MID_Y = SCREEN_WIDTH_Y / 2 - 1;

		Ellipse ellipse = new Ellipse(MID_X, MID_Y, 200, 150);
		ellipse.setStrokeWidth(10);

		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(10);
		dropShadow.setOffsetY(20);

		ellipse.setEffect(dropShadow);

		Pane pane = new Pane(ellipse);

		Scene scene = new Scene(pane, SCREEN_WIDTH_X, SCREEN_WIDTH_Y);
		primaryStage.setScene(scene);
		primaryStage.show();

		StrokeTransition strokeTransition = new StrokeTransition();
		strokeTransition.setShape(ellipse);
		strokeTransition.setFromValue(Color.TOMATO);
		strokeTransition.setToValue(Color.TURQUOISE);
		strokeTransition.setDuration(Duration.seconds(15));

		FillTransition fillTransition = new FillTransition(Duration.seconds(1), ellipse, Color.BLACK, Color.YELLOW);
		fillTransition.setAutoReverse(true);
		fillTransition.setCycleCount(Animation.INDEFINITE);
		fillTransition.setInterpolator(Interpolator.LINEAR);


		strokeTransition.play();
		fillTransition.play();
	}
}


