package com.bitcoin;

import com.bitcoin.domain.Game;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/auth.fxml"));
        primaryStage.setTitle("Authorize");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setOnCloseRequest(e -> Game.stop());
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
