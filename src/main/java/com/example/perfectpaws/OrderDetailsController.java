package com.example.perfectpaws;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

import java.util.concurrent.ExecutionException;

public class OrderDetailsController {

    @FXML
    private Button backToPaymentButton;

    @FXML
    private Hyperlink changeAddressLink;

    @FXML
    private Hyperlink changeNameLink;

    @FXML
    private Hyperlink changePaymentLink;

    @FXML
    private Hyperlink changeShipTypeLink;

    @FXML
    private Button placeOrderBurton;

    @FXML
    void checkout(ActionEvent event) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("checkout-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 795,620 );
        Stage stage = new Stage();
        stage.setTitle("Checkout Page");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void payment(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("payment-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 795,620 );
        Stage stage = new Stage();
        stage.setTitle("Payment Page");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void placeOrder(ActionEvent event) {

    }

}
