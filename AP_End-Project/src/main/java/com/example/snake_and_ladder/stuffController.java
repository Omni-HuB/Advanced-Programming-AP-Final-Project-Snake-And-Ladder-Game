package com.example.snake_and_ladder;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class stuffController implements Initializable {
    @FXML
    public Button goBackToMenuFromStuff;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        EventHandler<ActionEvent> handler = new EventHandler<>() {

            @Override
            public void handle(ActionEvent event) {
                // TODO Auto-generated method stub
                try {
                    Game_Controller.goBackToMenu();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        };
        goBackToMenuFromStuff.setOnAction(handler);
    }
}
