package com.example.perfectpaws;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainPageController {

    @FXML
    private Button addToCartButton;

    @FXML
    private Hyperlink cartLink;

    @FXML
    private Hyperlink logOutLink;

    @FXML
    private TextField searchPetBox;

    @FXML
    void addToCart(ActionEvent event) {

    }
    @FXML
    private Hyperlink viewSalesLink;

    @FXML
    void logOut(ActionEvent event) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 635,550 );
        Stage stage = new Stage();
        stage.setTitle("Login Page");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void searchPet(ActionEvent event) {

    }

    @FXML
    void viewCart(ActionEvent event) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("cart-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 730,610 );
        Stage stage = new Stage();
        stage.setTitle("Cart Page");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void viewSales(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sales-admin-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 870,640 );
        Stage stage = new Stage();
        stage.setTitle("Sales Page (Admin Only)");
        stage.setScene(scene);
        stage.show();

    }

}
