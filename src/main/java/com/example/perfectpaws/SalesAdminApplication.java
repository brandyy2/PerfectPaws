package com.example.perfectpaws;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SalesAdminApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sales-admin-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 870,640 );
        stage.setTitle("functionallityFiles.Sales Page (Admin Only)");
        stage.setScene(scene);
        stage.show();

    }
}
