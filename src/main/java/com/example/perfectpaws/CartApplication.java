package com.example.perfectpaws;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CartApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("cart-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 730,610 );
        stage.setTitle("Cart Page");
        stage.setScene(scene);
        stage.show();
    }
}
