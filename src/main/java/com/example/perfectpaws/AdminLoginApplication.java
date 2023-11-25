package com.example.perfectpaws;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AdminLoginApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("admin-login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 635,550 );
        stage.setTitle("Admin Login Page");
        stage.setScene(scene);
        stage.show();
    }
}
