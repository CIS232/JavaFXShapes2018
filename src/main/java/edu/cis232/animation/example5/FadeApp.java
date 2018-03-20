package edu.cis232.animation.example5;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class FadeApp extends Application {

	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Rectangle rectangle = new Rectangle(50, 50, 50, 50);

		Image image = new Image("file:HotAirBalloon.jpg");
		ImageView imageView = new ImageView(image);

		Pane pane = new Pane(rectangle, imageView);
		primaryStage.setScene(new Scene(pane));
		primaryStage.show();

		FadeTransition fadeTransition = new FadeTransition(Duration.seconds(15), imageView);
		fadeTransition.setFromValue(0.2);
		fadeTransition.setToValue(1.0);

		fadeTransition.play();
	}
}
