package edu.cis232.rectangleexample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RectangleApp extends Application {

	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Constants for the scene size
		final double SCENE_WIDTH = 320.0;
		final double SCENE_HEIGHT = 240.0;

		Rectangle r1 = new Rectangle(10, 20, 50, 100);
		r1.setFill(Color.CHARTREUSE);

		Ellipse e1 = new Ellipse(320, 240, 140, 100);
		e1.setFill(Color.DARKSALMON);
		e1.setStroke(Color.DODGERBLUE);
		e1.setStrokeWidth(5);

		Arc a1 = new Arc();
		a1.setCenterX(159);
		a1.setCenterY(119);
		a1.setRadiusX(80);
		a1.setRadiusY(100);
		a1.setStartAngle(-45);
		a1.setLength(90);
		a1.setFill(null);
		a1.setStroke(Color.DODGERBLUE);
		a1.setType(ArcType.ROUND);

		Polygon diamond = new Polygon();
		diamond.getPoints().addAll( 160.0, 20.0,
				300.0, 120.0,
				160.0, 220.0,
				20.0, 120.0);

		diamond.setFill(Color.ALICEBLUE);
		diamond.setStroke(Color.BLUEVIOLET);

		Pane canvas = new Pane();
		canvas.getChildren().addAll(diamond, a1, r1, e1);

		Scene scene = new Scene(canvas, SCENE_WIDTH, SCENE_HEIGHT);

		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
