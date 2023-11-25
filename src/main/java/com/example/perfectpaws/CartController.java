package com.example.perfectpaws;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CartController {

    @FXML
    private Button checkoutButton;

    @FXML
    private Button continueShoppingButton;

    @FXML
    private TextField passwordVisable;

    @FXML
    void checkout(ActionEvent event) throws Exception{

    }

    @FXML
    void continueToShop(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-page-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 730,610 );
        Stage stage = new Stage();
        stage.setTitle("Main Page");
        stage.setScene(scene);
        stage.show();

    }

}
