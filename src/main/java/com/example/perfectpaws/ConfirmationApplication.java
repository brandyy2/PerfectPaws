package com.example.perfectpaws;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ConfirmationApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("confirmation-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 795,620 );
        stage.setTitle(" Confirmation Page");
        stage.setScene(scene);
        stage.show();

    }
}
