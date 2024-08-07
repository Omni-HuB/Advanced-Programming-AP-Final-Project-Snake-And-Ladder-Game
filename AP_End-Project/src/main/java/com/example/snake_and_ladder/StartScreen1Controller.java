package com.example.snake_and_ladder;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import java.net.URL;
import java.util.ResourceBundle;

public class StartScreen1Controller implements Initializable {
    @FXML
    public ImageView startScreen1Img;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        FadeTransition fade = new FadeTransition();
        fade.setNode(startScreen1Img);
        fade.setDuration(Duration.millis(5000));
        fade.setCycleCount(1);
        fade.setInterpolator(Interpolator.LINEAR);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.play();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
