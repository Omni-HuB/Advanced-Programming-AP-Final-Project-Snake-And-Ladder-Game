package com.example.snake_and_ladder;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class InstructionMediaController implements Initializable {
    @FXML
    public MediaView mediaView;
    @FXML
    public Button skip;

    static  MediaPlayer mediaPlayer;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        File file= new File("src/yt1s.com - Snakes and Ladders Board Game Rules  Instructions" +
                "  Learn How To Play Snake and Ladder Game_1080p.mp4");
        // controller.setOnStartReference(this);
        //setting media path that is providing media source name
        Media media=new Media(file.toURI().toString());
        // providing media player media that is to be played

        mediaPlayer=new MediaPlayer(media);
        // providing mediaView to media player that we want to view otherwise we only hear audio
        //Game_Controller.mediaView=new MediaView();
        mediaView.setMediaPlayer(mediaPlayer);
        //  mediaPlayer.setVolume(0);
        mediaPlayer.play();

        Game_Controller menu =new Game_Controller();
        //Creating EventHandler
        EventHandler<ActionEvent> menuScreen = new EventHandler<>() {

            @Override
            public void handle(ActionEvent event) {
                // TODO Auto-generated method stub
                try {

                    menu.menuScreen();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        };

        //Adding Handler for the play and pause button
        skip.setOnAction(menuScreen);
    }


}
