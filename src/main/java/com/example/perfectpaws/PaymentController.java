package com.example.perfectpaws;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class PaymentController implements Initializable {

    @FXML
    private Button backtoCheckoutButton;

    @FXML
    private Button reviewOrderButton;

    @FXML
    private ChoiceBox<String> shippingSpeed;

    @FXML
    void backToCheckout(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("checkout-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 795,620 );
        Stage stage = new Stage();
        stage.setTitle("Checkout Page");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void reviewOrder(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("order-details-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 795,620 );
        Stage stage = new Stage();
        stage.setTitle("Order Details Page");
        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        shippingSpeed.getItems().addAll("Overnight (+$29)", "3 Day (+$19)", "Ground (FREE)");
    }
}
