package com.example.perfectpaws;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AdminLoginController {

    @FXML
    private Hyperlink backToLogin;

    @FXML
    private CheckBox checkBox;

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField passwordHidden;

    @FXML
    private TextField passwordVisable;

    @FXML
    void goToLogin(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 635,550 );
        Stage stage = new Stage();
        stage.setTitle("Login Page");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void login(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-page-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 730,610 );
        Stage stage = new Stage();
        stage.setTitle("Main Page");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void showPassword(ActionEvent event) {
        if (checkBox.isSelected()){
            passwordVisable.setText(passwordHidden.getText());
            passwordVisable.setVisible(true);
            passwordHidden.setVisible(false);
            return;
        }
        passwordHidden.setText(passwordVisable.getText());
        passwordHidden.setVisible(true);
        passwordVisable.setVisible(false);

    }

}
