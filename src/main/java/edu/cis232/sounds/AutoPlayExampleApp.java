package edu.cis232.sounds;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;

public class AutoPlayExampleApp extends Application {

	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		File guitarFile = new File("guitar.wav");
		Media guitarMedia = new Media(guitarFile.toURI().toString());
		MediaPlayer guitarPlayer = new MediaPlayer(guitarMedia);
		guitarPlayer.setAutoPlay(true);
		guitarPlayer.setCycleCount(MediaPlayer.INDEFINITE);
	}
}
