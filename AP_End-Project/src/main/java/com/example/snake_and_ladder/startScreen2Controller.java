package com.example.snake_and_ladder;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.net.URL;
import java.util.ResourceBundle;

public class startScreen2Controller implements Initializable {

    @FXML
    private ProgressBar progressBar;
    @FXML
    private Label progressBarLabel;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        progressBar.setStyle("-fx-accent: #00FF00;");
        progressIncrease();

    }

    public void progressIncrease() {

        int counter = 0;

        while (counter <= 100) {
            progressBar.setProgress((counter));
            progressBarLabel.setText(counter + "%");
            counter += 1;
            progressBarLabel.setText(counter+"%");
        }
        progressBarLabel.setText("Loading Game, Please Wait!!");
    }
}
