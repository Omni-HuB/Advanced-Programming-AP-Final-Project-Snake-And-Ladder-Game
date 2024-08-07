package com.example.snake_and_ladder;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import static com.example.snake_and_ladder.InstructionMediaController.mediaPlayer;

public class Game_Controller implements Initializable {

    /////////////////////////////////////////////////////
    @FXML
    public Button vsComputer;
    @FXML
    public Button player1VsPlayer2;
    @FXML
    public Button onlineMultiplayer;
    @FXML
    public Button playWithFriend;
    @FXML
    public Button coinSlot;
    @FXML
    public Button medal;
    @FXML
    public Button playLudo;
    @FXML
    public Button people;
    @FXML
    public Button freeCoins;
    @FXML
    public Button lucky7;
    @FXML
    public Button trim;
    @FXML
    public Button stuff;
    @FXML
    public Button exit;
    @FXML
    public ImageView pointing;


    static  public  Scene scene;
    static String css;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        css = new File("src/NotAvailable.css").toURI().toString();

       // EventHandler<ActionEvent> ButtonStuff= new EventHandler<>() {
        EventHandler<ActionEvent> ButtonTrim = event -> {
            // TODO Auto-generated method stub
            try {
                goToTrim();
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        EventHandler<ActionEvent> ButtonPlayWithFriend = event -> {
            // TODO Auto-generated method stub
            try {
                goToPlayWithFriend();
            } catch (IOException e) {
                e.printStackTrace();
            }
        };

        EventHandler<ActionEvent> ButtonOnlineMultiplayer = event -> {
            // TODO Auto-generated method stub
            try {
                goToOnlineMultiplayer();

            } catch (IOException e) {
                e.printStackTrace();
            }
        };

        EventHandler<ActionEvent> ButtonPlayer1VsPlayer2 = event -> {
            // TODO Auto-generated method stub
            try {
                goToLocalMultiplayer();

            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        EventHandler<ActionEvent> ButtonPeople = event -> {
            // TODO Auto-generated method stub
            try {
                goToPeople();

            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        EventHandler<ActionEvent> ButtonCoinSlot = event -> {
            // TODO Auto-generated method stub
            try {
                goToCoinSlot();

            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        EventHandler<ActionEvent> ButtonExit= event -> {
            // TODO Auto-generated method stub
            goToGameExit();
        };
        EventHandler<ActionEvent> ButtonLucky7 = event -> {
            // TODO Auto-generated method stub
            try {
                goToLucky7();

            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        EventHandler<ActionEvent> ButtonPlayLudo = event -> {
            // TODO Auto-generated method stub
            try {
                goToPlayLudo();

            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        EventHandler<ActionEvent> ButtonFreeCoins = event -> {
            // TODO Auto-generated method stub
            try {
                goToFreeCoins();

            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        EventHandler<ActionEvent> ButtonVsComputer = event -> {
            // TODO Auto-generated method stub
            try {
                goToVsComputer();

            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        EventHandler<ActionEvent> ButtonMedal = event -> {
            // TODO Auto-generated method stub
            try {
                goToMedal();

            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        EventHandler<ActionEvent> ButtonStuff= event -> {
            // TODO Auto-generated method stub
            try {
                goToStuff();

            } catch (IOException e) {
                e.printStackTrace();
            }
        };

        stuff.setOnAction(ButtonStuff);
        trim.setOnAction(ButtonTrim);
        onlineMultiplayer.setOnAction(ButtonOnlineMultiplayer);
        player1VsPlayer2.setOnAction(ButtonPlayer1VsPlayer2);
        exit.setOnAction(ButtonExit);
        lucky7.setOnAction(ButtonLucky7);
        freeCoins.setOnAction(ButtonFreeCoins);
        people.setOnAction(ButtonPeople);
        playLudo.setOnAction(ButtonPlayLudo);
        medal.setOnAction(ButtonMedal);
        coinSlot.setOnAction(ButtonCoinSlot);
        vsComputer.setOnAction(ButtonVsComputer);
        playWithFriend.setOnAction(ButtonPlayWithFriend);



        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

       /*                     Buttons Animations On Menu Screen
       */

        Image imageCoinSlot=new Image("file:ImagesAndVideos/coinSlots.png");
        ImageView viewCoinSlot=new ImageView(imageCoinSlot);
        viewCoinSlot.setFitHeight(40);
        viewCoinSlot.setFitWidth(50);
        coinSlot.setGraphic(viewCoinSlot);

        Image imageFreeCoins=new Image("file:ImagesAndVideos/watzchAddsForCoins.png");
        ImageView viewFreeCoins=new ImageView(imageFreeCoins);
        viewFreeCoins.setFitHeight(40);
        viewFreeCoins.setFitWidth(70);
        freeCoins.setGraphic(viewFreeCoins);

        Image imageLucky7=new Image("file:ImagesAndVideos/lucky7Button.png");
        ImageView viewLucky7=new ImageView(imageLucky7);
        viewLucky7.setFitHeight(40);
        viewLucky7.setFitWidth(120);
        lucky7.setGraphic(viewLucky7);

        Image imageMedal=new Image("file:ImagesAndVideos/medal.png");
        ImageView viewMedal=new ImageView(imageMedal);
        viewMedal.setFitHeight(40);
        viewMedal.setFitWidth(70);
        medal.setGraphic(viewMedal);

        Image imageOnlineMultiplayer=new Image("file:ImagesAndVideos/onlineMultiplayer.png");
        ImageView viewOnlineMultiplayer=new ImageView(imageOnlineMultiplayer);
        viewOnlineMultiplayer.setFitHeight(40);
        viewOnlineMultiplayer.setFitWidth(120);
        onlineMultiplayer.setGraphic(viewOnlineMultiplayer);

        Image imagePeople=new Image("file:ImagesAndVideos/People.png");
        ImageView viewPeople=new ImageView(imagePeople);
        viewPeople.setFitHeight(40);
        viewPeople.setFitWidth(70);
        people.setGraphic(viewPeople);

        Image imagePlayer1VsPlayer2=new Image("file:ImagesAndVideos/localMultiplayerButton.png");
        ImageView viewPlayer1VsPlayer2=new ImageView(imagePlayer1VsPlayer2);
        viewPlayer1VsPlayer2.setFitHeight(40);
        viewPlayer1VsPlayer2.setFitWidth(120);
        player1VsPlayer2.setGraphic(viewPlayer1VsPlayer2);

        Image imagePlayLudo=new Image("file:ImagesAndVideos/backToLudo.png");
        ImageView viewPlayLudo=new ImageView(imagePlayLudo);
        viewPlayLudo.setFitHeight(40);
        viewPlayLudo.setFitWidth(70);
        playLudo.setGraphic(viewPlayLudo);

        Image imagePlayWithFriend=new Image("file:ImagesAndVideos/playWithFriends.png");
        ImageView viewPlayWithFriend=new ImageView(imagePlayWithFriend);
        viewPlayWithFriend.setFitHeight(40);
        viewPlayWithFriend.setFitWidth(120);
        playWithFriend.setGraphic(viewPlayWithFriend);

        Image imageStuff=new Image("file:ImagesAndVideos/stuff.png");
        ImageView viewStuff=new ImageView(imageStuff);
        viewStuff.setFitHeight(60);
        viewStuff.setFitWidth(80);
        stuff.setGraphic(viewStuff);

        Image imageTrim=new Image("file:ImagesAndVideos/trims.png");
        ImageView viewTrim=new ImageView(imageTrim);
        viewTrim.setFitHeight(60);
        viewTrim.setFitWidth(80);
        trim.setGraphic(viewTrim);

        Image imageVsComputer=new Image("file:ImagesAndVideos/vsCompMenuButton.png");
        ImageView viewVsComputer=new ImageView(imageVsComputer);
        viewVsComputer.setFitHeight(40);
        viewVsComputer.setFitWidth(120);
        vsComputer.setGraphic(viewVsComputer);

        FadeTransition fadeIn = new FadeTransition();
        fadeIn.setNode(pointing);
        fadeIn.setCycleCount(TranslateTransition.INDEFINITE);
        fadeIn.setInterpolator(Interpolator.LINEAR);
        fadeIn.setFromValue(0);
        fadeIn.setToValue(1);
        fadeIn.play();


    }


    public static void menuScreen () throws IOException , NullPointerException{

        mediaPlayer.stop();
       // setButtonsEffect();
        Pane root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("menuScreen.fxml")));
        Scene scene = new Scene(root,768.0, 890.0);
        //790.0, 890.0
       // stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
      //  Image coinSlotImg= new Image("file:ImagesAndVideos/coinSlots.png");
        //coinSlot=new Button();
      //  coinSlot.setGraphic(new ImageView(coinSlotImg));
       // coinSlot.autosize();
        //coinSlot.set
      //  root.getChildren().addAll(coinSlot);
        Snake_AND_Ladders.stage.setMaxWidth(800.0);
        Snake_AND_Ladders.stage.setMaxHeight(910.0);
        Snake_AND_Ladders.stage.setX(600);
        Snake_AND_Ladders.stage.setY(20);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();

    }


   public  static void goBackToMenu () throws IOException {
         menuScreen ();
   }

    public  void goToTrim() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("trim.fxml")));
        Scene scene = new Scene(root);
      //  Snake_AND_Ladders.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders. stage.setY(200);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();
    }

    public  void goToVsComputer() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("vsComputer.fxml")));
        Scene scene = new Scene(root);
       // stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders.stage.setY(200);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();
    }

    public static void goToStuff() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("stuff.fxml")));
        Scene scene = new Scene(root);
      //  Snake_AND_Ladders.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders.stage.setY(200);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();

    }

    public  void goToLocalMultiplayer() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("player1VsPlayer2.fxml")));
      //  Game_Grid grid = new Game_Grid();
       Scene scene = new Scene(root, 1020.0, 960.0, Color.BISQUE);


     //   ImageView GAME_BOARD_IMAGE = new ImageView(new Image("file:ImagesAndVideos/Game_Board_2.png"));
      //  GAME_BOARD_IMAGE.setFitHeight(836.0);
     //   GAME_BOARD_IMAGE.setFitWidth(801.0);
      //  grid.createGrid().getChildren().add(GAME_BOARD_IMAGE);

      //  Snake_AND_Ladders.stage.setMaxWidth(1020.0);
       // Snake_AND_Ladders.stage.setMaxHeight(960.0);
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders.stage.setY(20);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();
    }

    public  void goToOnlineMultiplayer() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("onlineMultiplayer.fxml")));
        Scene scene = new Scene(root);
       // Snake_AND_Ladders.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders.stage.setY(200);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();
    }

    public  void goToPlayWithFriend() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("playWithFriend.fxml")));
        Scene scene = new Scene(root);
     //   Snake_AND_Ladders.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders.stage.setY(200);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();
    }

    public  void goToLucky7() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("lucky7.fxml")));
        Scene scene = new Scene(root);
      //  Snake_AND_Ladders.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders.stage.setY(200);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();
    }

    public  void goToCoinSlot() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("coinSlot.fxml")));
        Scene scene = new Scene(root);
       // Snake_AND_Ladders.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders.stage.setY(200);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();
    }

    public  void goToMedal() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("medal.fxml")));
        Scene scene = new Scene(root);
      //  Snake_AND_Ladders.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders.stage.setY(200);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();
    }

    public  void goToPlayLudo() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("playLudo.fxml")));
        Scene scene = new Scene(root);
       // Snake_AND_Ladders.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders.stage.setY(200);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();

    }

    public  void goToPeople() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("people.fxml")));
        Scene scene = new Scene(root);
       //Snake_AND_Ladders.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders.stage.setY(200);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();
    }

    public  void goToFreeCoins() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("freeCoins.fxml")));
        Scene scene = new Scene(root);
      //  Snake_AND_Ladders.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders.stage.setY(200);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();
    }

    public static void goToGameExit()  {
        System.exit(0);
    }

}
