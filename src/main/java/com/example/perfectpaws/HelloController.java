package com.example.perfectpaws;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Button loginButton;
    @FXML
    private Hyperlink registerLink;

    @FXML
    private CheckBox checkBox;

    @FXML
    private PasswordField passwordHidden;

    @FXML
    private TextField passwordVisable;
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
    void register(ActionEvent event) throws Exception{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Register-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 665,550 );
            Stage stage = new Stage();
            stage.setTitle("Register Page");
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
