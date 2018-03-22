package edu.cis232.sounds;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;

public class SeekExampleApp extends Application{
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		File songFile = new File("Pim Poy Pocket.wav");
		Media songMedia = new Media(songFile.toURI().toString());
		MediaPlayer songPlayer = new MediaPlayer(songMedia);

		songPlayer.setOnReady(() -> {
			//Seek to the last 5 seconds, and play from there.
			System.out.println("Media ready");
			songPlayer.pause();
			songPlayer.seek(Duration.seconds(songMedia.getDuration().toSeconds() - 5));
			songPlayer.play();
		});

		primaryStage.show();
	}
}
