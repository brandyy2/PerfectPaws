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

public class CheckoutController implements Initializable {

    @FXML
    private Button backToCartButton;

    @FXML
    private Button goToPaymentButton;

    @FXML
    private ChoiceBox<String> state;

    @FXML
    void backToCart(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("cart-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 730,610 );
        Stage stage = new Stage();
        stage.setTitle("Cart Page");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void goToPayment(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("payment-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 795,620 );
        Stage stage = new Stage();
        stage.setTitle("Checkout Page");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        state.getItems().addAll("AL","AK","AZ","AR","CA","CO","CT","DE","FL","GA","HI","ID","IL","IN","IA","KS","KY","LA","ME",
                "MD","MA","MI","MN","MS","MO","MT","NE","NV","NH","NJ","NM","NY","NC","ND","OH","OK","OR","PA","RI","SC","SD",
                "TN","TX","UT","VT","VA","WA","WI","WY");
    }
}
