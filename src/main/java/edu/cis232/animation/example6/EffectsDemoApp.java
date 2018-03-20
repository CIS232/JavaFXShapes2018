package edu.cis232.animation.example6;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class EffectsDemoApp extends Application {
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Image image = new Image("file:flower.jpg");
		ImageView imageView = new ImageView(image);

		ColorAdjust colorAdjust = new ColorAdjust();
		colorAdjust.setHue(0);

		imageView.setEffect(colorAdjust);

		Pane pane = new Pane(imageView);
		primaryStage.setScene(new Scene(pane));
		primaryStage.show();
	}
}
