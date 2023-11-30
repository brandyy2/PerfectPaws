package com.example.perfectpaws;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPageApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        GridPane root = new GridPane();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-page-view.fxml"));
        ScrollPane sp = new ScrollPane();
        sp.setContent(root);
        Scene scene = new Scene(fxmlLoader.load(), 730,610 );
        stage.setTitle("Main Page");
        stage.setScene(scene);
        stage.show();
    }
}
