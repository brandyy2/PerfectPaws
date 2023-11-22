package com.example.perfectpaws;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private PasswordField passwordHidden;

    @FXML
    private TextField passwordVisable;

    @FXML
    private CheckBox checkBox;
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
