package com.example.perfectpaws;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ourPetInventoryStuff.users;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

        private static List<users> readJsonFile(String filePath) {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                return objectMapper.readValue(new File(filePath),
                        objectMapper.getTypeFactory().constructCollectionType(List.class, users.class));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return new ArrayList<>();
        }

        private static void writeJsonFile(String filePath, List<users> data) {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
            ObjectWriter objectWriter = objectMapper.writerWithDefaultPrettyPrinter();
            try {
                objectWriter.writeValue(new File(filePath), data);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @FXML
        void createAccount(ActionEvent event) throws Exception {
            List<users> jsonFile = readJsonFile("src/main/resources/users.json");
            users newUser = new users(createUsername.getText(), createPassword.getText(), false, firstName.getText(), lastName.getText());
            jsonFile.add(newUser);
            writeJsonFile("src/main/resources/users.json", jsonFile);

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-page-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 730, 610);
            Stage stage = new Stage();
            stage.setTitle("Main Page");
            stage.setScene(scene);
            stage.show();
        }

        @FXML
        void backToLogin(ActionEvent event) throws Exception {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 635, 550);
            Stage stage = new Stage();
            stage.setTitle("Login Page");
            stage.setScene(scene);
            stage.show();
        }
    }



