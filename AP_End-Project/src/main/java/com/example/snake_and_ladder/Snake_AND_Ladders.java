package com.example.snake_and_ladder;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Snake_AND_Ladders extends Application {

   static Stage stage;
    @Override
    public void start(Stage primary) throws IOException, InterruptedException {
        stage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("startScreen1.fxml")));
        Scene scene = new Scene(root);

        Image gameIcon = new Image("file:ImagesAndVideos/gme_icon_4.jpeg");     // SOURCE : Google Images
        stage.getIcons().add(gameIcon);
        stage.setTitle(" Snakes And Ladders ");
        stage.setScene(scene);
        stage.show();

        Thread.sleep(200);

        FXMLLoader fxmlLoader = new FXMLLoader(Snake_AND_Ladders.class.getResource("startScreen2.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();

        Thread.sleep(2000);

        FXMLLoader fxmlLoader2 = new FXMLLoader(Snake_AND_Ladders.class.getResource("instructionsScreen.fxml"));
        scene = new Scene(fxmlLoader2.load());
        stage.setScene(scene);
        stage.setX(450);
        stage.setY(200);
        stage.show();
    }
    public static void main (String[]args){
            launch();
    }
}
