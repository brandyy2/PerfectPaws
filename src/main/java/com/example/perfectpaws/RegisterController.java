package com.example.perfectpaws;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterController {
    @FXML
    private Button backButton;

    @FXML
    private Button createAccountButton;
    @FXML
    private TextField createPassword;

    @FXML
    private TextField createUsername;

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    void createAccount(ActionEvent event) throws Exception{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-page-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 730,610 );
            Stage stage = new Stage();
            stage.setTitle("Main Page");
            stage.setScene(scene);
            stage.show();
    }
    @FXML
    void backToLogin(ActionEvent event) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 635,550 );
        Stage stage = new Stage();
        stage.setTitle("Login Page");
        stage.setScene(scene);
        stage.show();
        }
    }


