package com.example.perfectpaws;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OrderDetailsApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("order-details-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 795,620 );
        stage.setTitle("Order Details Page");
        stage.setScene(scene);
        stage.show();
    }
}
